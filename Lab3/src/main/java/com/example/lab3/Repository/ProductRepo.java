package com.example.lab3.Repository;

import com.example.lab3.model.bidirectional.CategoryBi;
import com.example.lab3.model.bidirectional.ProductBi;
import com.example.lab3.model.bidirectional.ReviewBi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<ProductBi, Long> {
    List<ProductBi> findAllByPriceAfter(double minPrice);
    List<ProductBi>  findAllByCategoryBiAndPriceBefore(CategoryBi categoryBi,double price);

    List<ProductBi> findAllByNameContaining(String name);

//    List<ProductBi> findAllBy(long id);

//    List<ReviewBi> findAllByProductBi(long id);
}
