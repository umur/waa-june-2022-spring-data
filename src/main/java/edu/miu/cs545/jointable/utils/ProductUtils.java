package edu.miu.cs545.jointable.utils;

import edu.miu.cs545.jointable.dto.ProductDto;
import edu.miu.cs545.jointable.entity.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductUtils {
    static ModelMapper mapper;
    @Autowired
    public void setModelMapper(ModelMapper modelMapper){
        ProductUtils.mapper=modelMapper;
    }

    public static ProductDto parseProductToProductDto(Product product){
        return mapper.map(product, ProductDto.class);
    }

    public static Product parseProductDtoToProduct(ProductDto productDto){return mapper.map(productDto,Product.class);}
}
