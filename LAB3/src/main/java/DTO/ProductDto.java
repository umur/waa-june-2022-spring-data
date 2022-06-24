package DTO;

import Domain.Category;
import Domain.Product;
import lombok.Data;

import javax.persistence.ManyToOne;
@Data
public class ProductDto {

    private int id;
    private String name;
    private double price;
    private double rating;
    private Category category;


//  public ProductDto toDto(Product product){
//      ProductDto dto= new ProductDto();
//       dto.setId(product.getId());
//       dto.setName(product.getName());
//     dto.setRating(product.getRating());
//      dto.setCategory(product.getCategory());
//       return dto;
//        }
        public Product toEntity(ProductDto pdto){
        Product pro= new Product();
        pro.setId(pdto.getId());
        pro.setPrice(pdto.getPrice());
        pro.setRating(pdto.getRating());
        pro.setCategory(pdto.getCategory());
        return pro;

    }

}
