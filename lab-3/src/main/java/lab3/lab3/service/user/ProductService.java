package lab3.lab3.service.user;

import lab3.lab3.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    public List<ProductDTO> getProducts();
    public void create();
    public void update(ProductDTO productdto, int id);
    public void delete(int id);
}
