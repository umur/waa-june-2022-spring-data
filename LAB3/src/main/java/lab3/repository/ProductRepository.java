package lab3.repository;

import lab3.DTO.ProductDto;
import lab3.DTO.ReviewDto;
import lab3.model.bidirectional.Category;
import lab3.model.bidirectional.Product;
import lab3.model.bidirectional.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {
    public List<Product> getproGreaterMinPrice(double price);
    public List<Product> getCatLessMinprice(Category cat, double price);
    //public List<ProductDto>
    public List<Product> getAllById(int id);
    public List<Review> getProductId(int proid);
    public List<Product> getAll();
}
