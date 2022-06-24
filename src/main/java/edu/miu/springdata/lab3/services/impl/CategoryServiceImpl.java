package edu.miu.springdata.lab3.services.impl;

import edu.miu.springdata.lab3.dtos.CategoryDto;
import edu.miu.springdata.lab3.dtos.UserDto;
import edu.miu.springdata.lab3.entity.Category;
import edu.miu.springdata.lab3.repositories.CategoryRepo;
import edu.miu.springdata.lab3.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private final CategoryRepo categoryRepo;

    @Autowired
    private final ModelMapper modelMapper;

    @Override
    public void save(CategoryDto p) {
        categoryRepo.save(modelMapper.map(p, Category.class));
    }

    @Override
    public void delete(int id) {
        categoryRepo.deleteById(id);
    }

    @Override
    public CategoryDto getById(int id) {
        return modelMapper.map(categoryRepo.findById(id).get(), CategoryDto.class);
    }

    @Override
    public List<CategoryDto> getAll() {
        return StreamSupport.stream(categoryRepo.findAll().spliterator(), false)
                .map(u -> modelMapper.map(u, CategoryDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public void update(CategoryDto categoryDto, int id) {
        return;
    }
}
