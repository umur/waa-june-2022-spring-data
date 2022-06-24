package edu.miu.springdata.lab3.services;

import edu.miu.springdata.lab3.dtos.AddressDto;

import java.util.List;

public interface AddressService {

    List<AddressDto> getAll();

    void update(AddressDto addressDto, int id);

    void save(AddressDto addressDto);

    void delete(int id);
}
