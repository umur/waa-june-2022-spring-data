package miu.edu.unimapping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data@Component
@NoArgsConstructor@AllArgsConstructor
public class ProductDto {
    private Integer id;

    private String name;

    private Double price;

    private Double rating;
}
