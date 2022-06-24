package lab3.lab3.repository;

import lab3.lab3.entity.entity_bi.Category_bi;
import lab3.lab3.entity.entity_bi.Product_bi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product_bi, Integer> {

    List<Product_bi> findAllByPriceAfter(double checkPrice);

    List<Product_bi> findAllByCategoryAndPriceBefore(Category_bi cat, double checkPrice);

    List<Product_bi> findAllByNameContains(String checkName);
}
