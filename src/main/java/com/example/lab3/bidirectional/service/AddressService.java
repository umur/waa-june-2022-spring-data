package com.example.lab3.bidirectional.service;

import com.example.lab3.bidirectional.entity.Address;


public interface AddressService {
    void save(Address address);

    Address getById(int id);

    void delete(int id);

}
