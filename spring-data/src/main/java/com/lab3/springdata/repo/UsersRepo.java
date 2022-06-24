package com.lab3.springdata.repo;

import com.lab3.springdata.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends CrudRepository<User, Integer> {

}
