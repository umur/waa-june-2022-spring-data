package edu.miu.springdata.service;

import edu.miu.springdata.dto.AddressDto;
import edu.miu.springdata.entity.Address;

import java.util.List;

public interface AddressService {

    void save(AddressDto arddress);

    public void updateAddress(AddressDto arddress, Integer id);
    void delete(int id);

    Address getById(int id);

    List<AddressDto> getAll();
}
