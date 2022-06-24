package lab3.lab3.service.product;

import lab3.lab3.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getProducts();

    void create(ProductDTO productDTO);

    void update(ProductDTO productdto, int id);

    void delete(int id);
}
