package com.example.lab3.Repository;

import com.example.lab3.model.bidirectional.AddressBi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<AddressBi, Long> {
}
