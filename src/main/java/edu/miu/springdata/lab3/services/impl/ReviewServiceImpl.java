package edu.miu.springdata.lab3.services.impl;

import edu.miu.springdata.lab3.entity.User;
import edu.miu.springdata.lab3.repositories.ReviewRepo;
import edu.miu.springdata.lab3.repositories.UserRepo;
import edu.miu.springdata.lab3.services.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepo reviewRepo;
    @Override
    public void save(User p) {
        reviewRepo.save(p);
    }

    @Override
    public void delete(int id) {
        reviewRepo.deleteById(id);
    }

    @Override
    public User getById(int id) {
        return (User) reviewRepo.findById(id).get();
    }

    @Override
    public List<User> getAll() {
        return StreamSupport.stream(reviewRepo.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
