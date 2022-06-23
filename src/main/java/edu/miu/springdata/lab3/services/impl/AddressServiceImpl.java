package edu.miu.springdata.lab3.services.impl;

import edu.miu.springdata.lab3.dtos.AddressDto;
import edu.miu.springdata.lab3.repositories.AddressRepo;
import edu.miu.springdata.lab3.services.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService {

    @Autowired
    private final AddressRepo addressRepo;

    @Override
    public List<AddressDto> getAddress() {
        return null;
    }

    @Override
    public void updateAddress(AddressDto addressDto, int id) {

    }

    @Override
    public void addAddress(AddressDto addressDto) {

    }

    @Override
    public void deleteAddress(int id) {

    }
}
