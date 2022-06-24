package lab3.lab3.service.category;

import lab3.lab3.dto.AddressDTO;
import lab3.lab3.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAll();

    void create(CategoryDTO categoryDTO);

    void update(CategoryDTO categoryDTO, int id);

    void delete(int id);
}
