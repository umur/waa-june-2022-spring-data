package edu.miu.springdata.service.impl;



import edu.miu.springdata.dto.AddressDto;
import edu.miu.springdata.dto.ProductDto;
import edu.miu.springdata.entity.Address;
import edu.miu.springdata.entity.User;
import edu.miu.springdata.repo.AddressRepo;
import edu.miu.springdata.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<AddressDto> findAll() {
        List<Address> addresses = addressRepo.findAll();
        List<AddressDto> addressDtoList = new ArrayList<>();
        for (Address Address : addresses){
            var rs = modelMapper.map(Address, AddressDto.class);
            addressDtoList.add(rs);
        }
        return addressDtoList;
    }

    @Override
    public void deleteById(int id) {
        addressRepo.deleteById(id);
    }

    @Override
    public void create(int id,String street,int zip,String city) {
        Address address = new Address();
        address.setId(id);
        address.setStreet(street);
        address.setZip(zip);
        address.setCity(city);
        //address.setUser(user);
        addressRepo.save(address);
    }

    @Override
    public void update(int id,String street,int zip,String city) {
        Address address = addressRepo.findById(id);
        address.setStreet(street);
        address.setZip(zip);
        address.setCity(city);
        //address.setUser(user);
    }

}
