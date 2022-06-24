package miu.edu.unimapping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data@Component@NoArgsConstructor@AllArgsConstructor
public class ReviewDto {
    private Integer id;
    private String comment;
}
