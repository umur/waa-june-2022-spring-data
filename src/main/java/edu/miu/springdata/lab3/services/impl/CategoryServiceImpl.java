package edu.miu.springdata.lab3.services.impl;

import edu.miu.springdata.lab3.repositories.CategoryRepo;
import edu.miu.springdata.lab3.services.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private final CategoryRepo categoryRepo;
}
