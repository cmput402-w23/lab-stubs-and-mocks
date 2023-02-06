import models.Address;
import services.AddressService;
import services.SalaryService;

import java.util.List;
import java.util.stream.Collectors;

public class Utilities {


    public List<Address> getAddressByCity(AddressService addressService, String city) {
        List<Address> allAddresses = addressService.getAllAddresses();
        List<Address> filteredAddresses = allAddresses.stream().filter(x -> x.getCity().equals(city)).collect(Collectors.toList());

        return filteredAddresses;
    }


    public List<Integer> getSalariesAbove(SalaryService salaryService, int cutOff) {
        List<Integer> salaries = salaryService.getSalaries();
        List<Integer> filteredSalaries = salaries.stream().filter(x -> x > cutOff).collect(Collectors.toList());

        return filteredSalaries;
    }
}
