package com.cs545waa.lab03.service;

import com.cs545waa.lab03.dto.AddressDTO;

import java.util.List;

public interface AddressService {
    public void create(AddressDTO dto);
    public void update(AddressDTO dto);
    public void delete(int id);
    public AddressDTO read(int id);
    public List<AddressDTO> readAll();
}
