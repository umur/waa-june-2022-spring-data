package com.example.datai.repository;

import com.example.datai.dto.ProductDto;
import com.example.datai.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {


}
