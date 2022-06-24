package com.example.lab3.Repository;

import com.example.lab3.model.bidirectional.UserBi;
import org.springframework.data.repository.CrudRepository;

public interface UserBiRepository extends CrudRepository<UserBi, Long> {
}
