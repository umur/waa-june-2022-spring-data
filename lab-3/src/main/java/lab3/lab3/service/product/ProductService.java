package lab3.lab3.service.product;

import lab3.lab3.dto.ProductDTO;
import lab3.lab3.entity.entity_bi.Category_bi;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getProducts();

    void create(ProductDTO productDTO);

    void update(ProductDTO productdto, int id);

    void delete(int id);

    List<ProductDTO> getProductCostMoreThan(double price);

    List<ProductDTO> getProductByCategoryCostLessThan(Category_bi category, double price);

    List<ProductDTO> getProductContainingKeyWord(String keyWord);
}
