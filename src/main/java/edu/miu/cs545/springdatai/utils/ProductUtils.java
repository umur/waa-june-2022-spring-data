package edu.miu.cs545.springdatai.utils;

import edu.miu.cs545.springdatai.dto.ProductDto;
import edu.miu.cs545.springdatai.dto.ReviewDto;
import edu.miu.cs545.springdatai.entity.Product;
import edu.miu.cs545.springdatai.entity.Review;
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
