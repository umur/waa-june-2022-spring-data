package miu.edu.springdata.service.impl;

import miu.edu.springdata.dto.CategoryDto;
import miu.edu.springdata.dto.CategoryDto;
import miu.edu.springdata.model.Category;
import miu.edu.springdata.repo.CategoryRepo;
import miu.edu.springdata.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepo categoryRepo;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<CategoryDto> findAll() {
        List<Category> addresses = (List<Category>) categoryRepo.findAll();
        return addresses.stream().map(address -> modelMapper.map(address, CategoryDto.class)).collect(Collectors.toList());
    }

    @Override
    public void createCategory(CategoryDto address) {
        categoryRepo.save(modelMapper.map(address, Category.class));
        System.out.println("New address added successfully");
    }

    @Override
    public CategoryDto update(CategoryDto address, int id) {
        Category add = modelMapper.map(address, Category.class);
        categoryRepo.findById(id).map(ad -> {
            return categoryRepo.save(add);
        });

        return address;
    }

    @Override
    public void delete(int id) {
        categoryRepo.deleteById(id);
    }
}
