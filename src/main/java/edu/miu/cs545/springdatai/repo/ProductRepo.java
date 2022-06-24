package edu.miu.cs545.springdatai.repo;

import edu.miu.cs545.springdatai.dto.ProductDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepo {
    private static List<ProductDto> productDtos;

    public ProductDto createProduct(ProductDto productDto) {
        productDtos.add(productDto);
        return productDto;
    }

    public List<ProductDto> getAllProducts() {
        return productDtos;
    }

    public ProductDto updateProduct(int id, ProductDto productDto) {
        for(ProductDto pd:productDtos){
            if(pd.getId()==id){
                productDtos.remove(pd);
                productDtos.add(productDto);
                return productDto;
            }
        }
        return null;
    }

    public ProductDto deleteProduct(int id) {
        for(ProductDto pd:productDtos){
            if(pd.getId()==id){
                productDtos.remove(pd);
                return pd;
            }
        }
        return null;
    }
}
