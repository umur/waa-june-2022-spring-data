package edu.miu.springdata.service;

import edu.miu.springdata.dto.AddressDto;
import edu.miu.springdata.entity.Address;
import edu.miu.springdata.entity.User;

import java.util.List;

public interface AddressService {
    List<AddressDto> findAll();
    void deleteById(int id);
    public void create(int id,String street,int zip,String city);
    public void update(int id,String street,int zip,String city);
}
