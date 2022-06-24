package lab3.service;

import lab3.DTO.AddressDto;
import lab3.model.bidirectional.AddressBi;
//import lab3.model.jointTable.AddressBi;
import lab3.repository.AddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class Addresserviceimpl implements Addressservice {
    private final AddressRepository addressRepository;

    public Addresserviceimpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }
public ModelMapper modelMapper= new ModelMapper();

    @Override
    public void save(AddressDto addressDto) {
        AddressBi address= modelMapper.map(addressDto, AddressBi.class);

    }

    @Override
    public void delete(int id) {
        addressRepository.deleteById(id);

    }

    @Override
    public AddressDto getById(int id) {
       return modelMapper.map(addressRepository.findById(id).get(),AddressDto.class);
    }

    @Override
    public List<AddressDto> getAll(int id) {
        var res= new ArrayList<AddressDto>();
        var data= addressRepository.findAll();
        // var data= addressRepository.findAll();
        for(AddressBi h:data){
            res.add(modelMapper.map(h,AddressDto.class));
        }
       // addressRepository.findAll().forEach(x-> res.add(modelMapper.map(x,AddressDto.class)));
        return res;
    }
}
