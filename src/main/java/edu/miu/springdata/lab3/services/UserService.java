package edu.miu.springdata.lab3.services;


import edu.miu.springdata.lab3.entity.User;

import java.util.List;

public interface UserService {
    void save(User p);

    void delete(int id);

    User getById(int id);

    List<User> getAll();


}
