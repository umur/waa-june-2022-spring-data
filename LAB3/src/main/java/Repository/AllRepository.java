package Repository;

import Domain.Category;
import Domain.Product;
import Domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AllRepository extends JpaRepository<Product, Integer> {
  // @Query("Select p from Product p"  +"where p.price=minprice" )
//   List<Product> findProductByPrice
   //@Query("Select p from product p" +"where p.category=cat and p.price=maxprice")


    List <Product> getByPriceIsGreaterThan(double minprice);
    List<Product> getByCategoryAndPriceIsLessThan(Category cat, double maxprice);
    List<Product> getByName(String name);
    List<Product> getById(int userid);

    List<Review> findById(int productid);






}
