package lab3.lab3.service.address;

import lab3.lab3.dto.AddressDTO;

import java.util.List;

public interface AddressService {
    List<AddressDTO> getAddresses();

    void create(AddressDTO addressDTO);

    void update(AddressDTO addressDTO, int id);

    void delete(int id);
}
