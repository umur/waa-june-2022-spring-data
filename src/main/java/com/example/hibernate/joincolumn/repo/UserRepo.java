package com.example.hibernate.joincolumn.repo;

import com.example.hibernate.joincolumn.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

}
