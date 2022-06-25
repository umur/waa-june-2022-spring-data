package com.example.datai.controller;

import com.example.datai.dto.AddressDto;
import com.example.datai.service.AddressService;
import com.example.datai.service.impl.AddressServiceImpl;
import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping
    public List<AddressDto> findAllAdresses(){

        return addressService.findAllQddresse();
    }
}
