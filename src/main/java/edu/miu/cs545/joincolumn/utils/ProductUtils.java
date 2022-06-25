package edu.miu.cs545.joincolumn.utils;

import edu.miu.cs545.joincolumn.dto.ProductDto;
import edu.miu.cs545.joincolumn.entity.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductUtils {

    @Autowired
    private static ModelMapper mapper;

    public static ProductDto parseProductToProductDto(Product product){
        return mapper.map(product, ProductDto.class);
    }

    public static Product parseProductDtoToProduct(ProductDto productDto){
        return mapper.map(productDto, Product.class);
    }
}
