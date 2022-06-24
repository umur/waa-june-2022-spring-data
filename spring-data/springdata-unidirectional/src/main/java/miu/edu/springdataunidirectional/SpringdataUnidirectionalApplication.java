package miu.edu.springdataunidirectional;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringdataUnidirectionalApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringdataUnidirectionalApplication.class, args);
    }

    @Bean
    public ModelMapper getMapper() {
        return new ModelMapper();
    }

}
