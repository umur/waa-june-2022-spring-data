package com.data.springData.repo;
import com.data.springData.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends  CrudRepository<User,Integer> {
}
