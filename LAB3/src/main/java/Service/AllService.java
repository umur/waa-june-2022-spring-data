package Service;

import DTO.ProductDto;
import DTO.ReviewDto;
import Domain.Category;

import java.util.List;

public interface AllService {
    List<ProductDto> getByPriceIsGreaterThan(double minprice);
    List<ProductDto> getByCategoryAndPriceIsLessThan(Category cat, double maxprice);
    List<ProductDto> getByName(String name);
    List<ProductDto> getById(int userid);
    List<ReviewDto> findById(int productid);

}
