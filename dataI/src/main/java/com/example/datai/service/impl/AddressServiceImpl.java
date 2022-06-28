package com.example.datai.service.impl;

import com.example.datai.dto.AddressDto;
import com.example.datai.entity.Address;
import com.example.datai.repository.AddressRepo;
import com.example.datai.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepo address;

    @Autowired
    private  ModelMapper modelMapper;

    @Override
    public List<AddressDto> findAllQddresse() {

        List<AddressDto> addressDtos = new ArrayList<>();
        var aa = address.findAll();

        for(Address aaa: aa){
            addressDtos.add(modelMapper.map(aaa,AddressDto.class));
        }
        return addressDtos;
    }
}
