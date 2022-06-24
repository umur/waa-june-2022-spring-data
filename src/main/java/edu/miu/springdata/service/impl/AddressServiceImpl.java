package edu.miu.springdata.service.impl;

import edu.miu.springdata.dto.AddressDto;
import edu.miu.springdata.entity.Address;
import edu.miu.springdata.repo.AddressRepo;
import edu.miu.springdata.service.AddressService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;

    private ModelMapper mapper;

    @Override
    public void save(AddressDto addressDto) {
        addressRepo.save(dtoToEntity(addressDto));
    }

    @Override
    public void updateAddress(AddressDto addressDto, Integer id){
        Address address = getById(id);
        address.setCity(addressDto.getCity());
        address.setStreet(addressDto.getStreet());
        address.setZip(addressDto.getZip());

        addressRepo.save(address);
    }

    @Override
    public void delete(int id) {
        addressRepo.deleteById(id);
    }

    @Override
    public Address getById(int id) {
        return addressRepo.findById(id).get();
    }

    @Override
    public List<AddressDto> getAll() {
        var addresss = addressRepo.findAll();
        var result = new ArrayList<AddressDto>();

        for(Address address: addresss){
            AddressDto dto = new AddressDto();
            var addressDto = toDto(address);
            result.add(addressDto);
        }
        return result;
    }

    private AddressDto toDto(Address address){
        AddressDto dto = mapper.map(address, AddressDto.class);
        return dto;
    }
    public Address dtoToEntity(AddressDto addressDto){
        Address address = mapper.map(addressDto, Address.class);
        return address;
    }
}
