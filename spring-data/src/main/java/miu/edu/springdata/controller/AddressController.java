package miu.edu.springdata.controller;

import miu.edu.springdata.dto.AddressDto;
import miu.edu.springdata.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping
    public List<AddressDto> findAll() {
        return addressService.findAllAddress();
    }

    @PostMapping
    public void create(@RequestBody AddressDto address) {
        addressService.createAddress(address);
    }

    @PutMapping("/{id}")
    public AddressDto update(@RequestBody AddressDto address, @PathVariable int id) {
        return addressService.update(address, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        addressService.delete(id);
    }

}
