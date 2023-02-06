import models.Address;
import org.junit.jupiter.api.Test;
import services.AddressService;
import services.SalaryService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UtilityTest {

    @Test
    public void getAddresses(){
        AddressService addressService = mock(AddressService.class);
        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("address 1", "city 1"));
        addresses.add(new Address("address 2", "city 1"));
        addresses.add(new Address("address 3", "city 2"));
        addresses.add(new Address("address 4", "city 3"));
        addresses.add(new Address("address 5", "city 4"));
        when(addressService.getAllAddresses()).thenReturn(addresses);

        Utilities utilities = new Utilities();
        List<Address> expectedAddresses = new ArrayList<>();
        expectedAddresses.add(new Address("address 1", "city 1"));
        expectedAddresses.add(new Address("address 2", "city 1"));

        List<Address> actualAddresses = utilities.getAddressByCity(addressService, "city 1");

        assertEquals(expectedAddresses.size(), actualAddresses.size());
        for (int i = 0; i < actualAddresses.size(); i++) {
            assertEquals(expectedAddresses.get(i).getAddress() ,actualAddresses.get(i).getAddress());
        }
    }


    @Test
    public void getSalaries(){
        SalaryService salaryService = mock(SalaryService.class);
        List<Integer> salaries = new ArrayList<>();
        salaries.add(40000);
        salaries.add(50000);
        salaries.add(55000);
        salaries.add(60000);
        salaries.add(65000);


        when(salaryService.getSalaries()).thenReturn(salaries);

        Utilities utilities = new Utilities();
        List<Integer> expectedSalaries = new ArrayList<>();
        expectedSalaries.add(55000);
        expectedSalaries.add(60000);
        expectedSalaries.add(65000);


        List<Integer> actualSalaries = utilities.getSalariesAbove(salaryService, 50000);

        assertEquals(expectedSalaries.size(), actualSalaries.size());
        for (int i = 0; i < actualSalaries.size(); i++) {
            assertEquals(expectedSalaries.get(i) ,actualSalaries.get(i));
        }
    }
}
