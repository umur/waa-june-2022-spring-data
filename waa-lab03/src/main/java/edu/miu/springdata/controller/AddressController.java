package edu.miu.springdata.controller;

import edu.miu.springdata.dto.AddressDto;
import edu.miu.springdata.dto.ReviewDto;
import edu.miu.springdata.entity.User;
import edu.miu.springdata.service.AddressService;
import edu.miu.springdata.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/addresses")
@CrossOrigin
public class AddressController {

    private final AddressService addressService;

    //http://localhost:8080/addresses/findAll
    @GetMapping("/findAll")
    public List<AddressDto> findAll(){
        return addressService.findAll();
    }

    //http://localhost:8080/addresses/create?id=5&street=st111&zip=52557&Fairfield
    @GetMapping(value = "/create")
    public void create(@RequestParam int id,String street,int zip,String city){
        addressService.create( id, street, zip, city);
    }

    //http://localhost:8080/addresses/update?id=1&street=st222&zip=52557&Fairfield
    @GetMapping(value = "/update")
    public void update(@RequestParam int id,String street,int zip,String city){
        addressService.update( id, street, zip, city);
    }

    //http://localhost:8080/addresses/deleteById?id=1
    @GetMapping(value = "/deleteById")
    public void deleteById(@RequestParam int id){
        addressService.deleteById(id);
    }
}
