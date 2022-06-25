package com.cs545waa.lab03.service;

import com.cs545waa.lab03.dto.AppUserDTO;

import java.util.List;

public interface AppUserService {
    public void create(AppUserDTO dto);
    public void update(AppUserDTO dto);
    public void delete(int id);
    public AppUserDTO read(int id);
    public List<AppUserDTO> readAll();
}
