package lab3.service;

import lab3.DTO.AddressDto;

import java.util.List;

public interface Addressservice {
    public void save(AddressDto addressDto);
    public void delete(int id);
    public AddressDto getById(int id);
    public List<AddressDto> getAll(int id);
}
