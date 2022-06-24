package miu.edu.springdataunidirectional.service;


import miu.edu.springdataunidirectional.dto.AddressDto;

import java.util.List;

public interface AddressService {
    List<AddressDto> findAllAddress();
    void createAddress(AddressDto address);
    AddressDto update(AddressDto address, int id);
    void delete(int id);
}
