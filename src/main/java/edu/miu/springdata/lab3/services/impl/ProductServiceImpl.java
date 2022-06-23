package edu.miu.springdata.lab3.services.impl;

import edu.miu.springdata.lab3.repositories.ProductRepo;
import edu.miu.springdata.lab3.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    @Autowired
    private final ProductRepo productRepo;
}
