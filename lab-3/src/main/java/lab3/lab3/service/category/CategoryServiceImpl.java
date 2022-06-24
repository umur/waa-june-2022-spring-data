package lab3.lab3.service.category;

import lab3.lab3.dto.CategoryDTO;
import lab3.lab3.entity.Category;
import lab3.lab3.repository.CategoryRepo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<CategoryDTO> getAll() {
        return categoryRepo.findAll()
                .stream()
                .map(category -> modelMapper.map(category, CategoryDTO.class))
                .toList();
    }

    @Override
    public void create(CategoryDTO categoryDTO) {
        categoryRepo.save(modelMapper.map(categoryDTO, Category.class));
    }

    @Override
    public void update(CategoryDTO categoryDTO, int id) {
        categoryRepo.save(modelMapper.map(categoryDTO, Category.class));
    }

    @Override
    public void delete(int id) {
        categoryRepo.deleteById(id);
    }
}
