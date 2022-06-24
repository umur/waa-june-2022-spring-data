package lab3.lab3.service.address;

import lab3.lab3.dto.AddressDTO;
import lab3.lab3.entity.Address;
import lab3.lab3.repository.AddressRepo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<AddressDTO> getAddresses() {
        return addressRepo.findAll()
                .stream()
                .map(address -> modelMapper.map(address, AddressDTO.class))
                .toList();
    }

    @Override
    public void create(AddressDTO addressDTO) {
        addressRepo.save(modelMapper.map(addressDTO, Address.class));
    }

    @Override
    public void update(AddressDTO addressDTO, int id) {
        addressRepo.save(modelMapper.map(addressDTO, Address.class));
    }

    @Override
    public void delete(int id) {
        addressRepo.deleteById(id);
    }
}
