package miu.edu.springdata.repo;

import miu.edu.springdata.model.Category;
import miu.edu.springdata.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
    List<Product> findAllByPriceAfter(double value);

    List<Product> findAllByCategoryAndPriceBefore(Category category, double price);
    List<Product> findAllByNameContains(String name);
}
