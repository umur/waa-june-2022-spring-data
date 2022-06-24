package edu.miu.springdata.lab3.services.impl;

import edu.miu.springdata.lab3.dtos.AddressDto;
import edu.miu.springdata.lab3.entity.Address;
import edu.miu.springdata.lab3.entity.User;
import edu.miu.springdata.lab3.repositories.AddressRepo;
import edu.miu.springdata.lab3.services.AddressService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService {

    @Autowired
    private final AddressRepo addressRepo;

    @Autowired
    private final ModelMapper modelMapper;

    @Override
    public List<AddressDto> getAll() {
        return StreamSupport.stream(addressRepo.findAll().spliterator(), false)
                .map(a -> modelMapper.map(a, AddressDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public void update(AddressDto addressDto, int id) {
        return;
    }

    @Override
    public void save(AddressDto addressDto) {
        addressRepo.save(modelMapper.map(addressDto, Address.class));

    }

    @Override
    public void delete(int id) {
        addressRepo.deleteById(id);
    }
}
