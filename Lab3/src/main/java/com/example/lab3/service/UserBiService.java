package com.example.lab3.service;

import com.example.lab3.model.bidirectional.CategoryBi;
import com.example.lab3.model.bidirectional.UserBi;

import java.util.List;

public interface UserBiService {
    void save(UserBi p);

    void delete(long id);

    UserBi getById(long id);

    List<UserBi> getAll();

}
