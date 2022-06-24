package miu.edu.springdata.service;

import miu.edu.springdata.dto.AddressDto;
import miu.edu.springdata.model.Address;

import java.util.List;

public interface AddressService {
    List<AddressDto> findAllAddress();
    void createAddress(AddressDto address);
    AddressDto update(AddressDto address, int id);
    void delete(int id);
}
