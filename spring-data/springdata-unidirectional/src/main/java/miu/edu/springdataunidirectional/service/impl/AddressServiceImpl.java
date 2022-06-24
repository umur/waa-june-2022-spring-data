package miu.edu.springdataunidirectional.service.impl;

import miu.edu.springdata.dto.AddressDto;
import miu.edu.springdata.model.Address;
import miu.edu.springdata.repo.AddressRepo;
import miu.edu.springdata.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepo addressRepo;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<AddressDto> findAllAddress() {
        List<Address> addresses = (List<Address>) addressRepo.findAll();
        return addresses.stream().map(address -> modelMapper.map(address, AddressDto.class)).collect(Collectors.toList());
    }

    @Override
    public void createAddress(AddressDto address) {
        addressRepo.save(modelMapper.map(address, Address.class));
        System.out.println("New address added successfully");
    }

    @Override
    public AddressDto update(AddressDto address, int id) {
        Address add = modelMapper.map(address, Address.class);
        addressRepo.findById(id).map(ad -> {
            return addressRepo.save(add);
        });

        return address;
    }

    @Override
    public void delete(int id) {
        addressRepo.deleteById(id);
    }
}
