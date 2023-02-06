package services;

import models.Address;

import java.util.List;

public interface AddressService {
    // External service. May include rate limiting and may be slow due
    // network failures, slow round-trip times, high latency, etc.
    // Thus, cannot afford to test on a real instance. Any way to "mock" it? :)
    List<Address> getAllAddresses();
}