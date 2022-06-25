package com.example.lab3.Repository;

import com.example.lab3.model.bidirectional.UserBi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserBi, Long> {
}
