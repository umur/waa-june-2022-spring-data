package miu.edu.springdataunidirectional.repo;

import miu.edu.springdataunidirectional.model.Category;
import miu.edu.springdataunidirectional.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
    List<Product> findAllByPriceAfter(double value);

//    List<Product> findAllByCategoryAndPriceBefore(Category category, double price);
    List<Product> findAllByNameContains(String name);
}
