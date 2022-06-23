package edu.miu.springdata.lab3.repositories;

import edu.miu.springdata.lab3.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
}
