package com.example.lab3.service.impl;

import com.example.lab3.Repository.UserBiRepository;
import com.example.lab3.model.bidirectional.CategoryBi;
import com.example.lab3.model.bidirectional.UserBi;
import com.example.lab3.service.UserBiService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
@Transactional
public class UserBiServiceImpl implements UserBiService {
    private final UserBiRepository userBiRepository;

    @Override
    public void save(UserBi p) {
        userBiRepository.save(p);
    }

    @Override
    public void delete(long id) {
        userBiRepository.deleteById(id);
    }

    @Override
    public UserBi getById(long id) {
        return (UserBi) userBiRepository.findById(id).get();
    }

    @Override
    public List<UserBi> getAll() {
        return StreamSupport.stream(userBiRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());

    }
}
