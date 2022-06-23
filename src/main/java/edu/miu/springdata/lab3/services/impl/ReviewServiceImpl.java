package edu.miu.springdata.lab3.services.impl;

import edu.miu.springdata.lab3.repositories.ReviewRepo;
import edu.miu.springdata.lab3.services.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private final ReviewRepo reviewRepo;
}
