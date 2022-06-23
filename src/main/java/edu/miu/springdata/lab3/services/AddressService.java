package edu.miu.springdata.lab3.services;

import edu.miu.springdata.lab3.dtos.AddressDto;

import java.util.List;

public interface AddressService {

    List<AddressDto> getAddress();

    void updateAddress(AddressDto addressDto, int id);

    void addAddress(AddressDto addressDto);

    void deleteAddress(int id);
}
