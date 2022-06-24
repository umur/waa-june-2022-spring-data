package lab3.service;

import lab3.DTO.ProductDto;
import lab3.DTO.ReviewDto;
import lab3.model.bidirectional.Category;

import java.util.List;

public interface ProductService {
    public List<ProductDto> getproGreaterMinPrice(double price);
    public List<ProductDto> getCatLessMinprice(Category cat, double price);
    //public List<ProductDto>
    public List<ProductDto> getAllById(int id);
    public List<ReviewDto> getProductId(int proid);

    public List<ProductDto> getAll();

}
