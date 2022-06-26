package edu.miu.springdata.controller;

import edu.miu.springdata.dto.AddressDto;
import edu.miu.springdata.entity.Address;
import edu.miu.springdata.service.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/addresses/")
    public void save(@RequestBody AddressDto p) {
        addressService.save(p);
    }

    @GetMapping("/addresses/")
    public List<AddressDto> getAll() {
        return addressService.getAll();
    }

    @GetMapping("/addresses/{id}")
    public Address getById(@PathVariable int id) {
        return addressService.getById(id);
    }

    @DeleteMapping("/addresses/{id}")
    public void delete(@PathVariable int id) {
        addressService.delete(id);
    }

    @PutMapping("/addresses/{id}")
    public void update(@PathVariable("id") int id, @RequestBody AddressDto address) {
        addressService.updateAddress(address, id);
    }
}
