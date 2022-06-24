package miu.edu.unimapping.service;

import miu.edu.unimapping.dto.AddressDto;
import miu.edu.unimapping.entity.Address;

import java.util.Collection;

public interface AddressService {
    public Collection<AddressDto> getAllAddress();

    public Address addAddress(AddressDto addressDto);

    public void deleteAddress(Integer id);

    public Address updateAddress(AddressDto addressDto, Integer id);
}
