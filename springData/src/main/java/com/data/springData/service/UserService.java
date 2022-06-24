package com.data.springData.service;

import com.data.springData.entity.User;

public interface UserService {

    void save(User p);

    void delete(int id);

    User getById(int id);
}
