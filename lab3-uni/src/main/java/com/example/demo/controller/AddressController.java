package com.example.demo.controller;

import com.example.demo.dto.AddressDto;
import com.example.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")

public class AddressController {
  @Autowired
  AddressService addressService;

  @GetMapping
  public List<AddressDto> findAllAddress() {

    return addressService.findAllAddress();
  }

  @PostMapping
  public void createAddress(@RequestBody AddressDto dto) {
    addressService.createAddress(dto);
  }

  @DeleteMapping("/{id}")
  public void deleteAddress(@PathVariable int id) {
    addressService.delete(id);
  }

  @PutMapping("/{id}")

  public void update(@RequestBody @PathVariable int id, AddressDto addressDto) {

    addressService.update(id, addressDto);
  }

}
