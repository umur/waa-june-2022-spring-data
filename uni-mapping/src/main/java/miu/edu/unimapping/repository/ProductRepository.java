package miu.edu.unimapping.repository;

import miu.edu.unimapping.entity.Category;
import miu.edu.unimapping.entity.Product;
import org.springframework.data.domain.Sort;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findAllByPriceAfter(Double checkPrice);

//    List<Product> findAllByCategoryAndPriceBefore(Category category, double checkPrice);

    List<Product> findAllByNameContains(String checkName);
}
