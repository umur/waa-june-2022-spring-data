package edu.miu.cs545.jointable;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataIApplication {
	@Bean
	public ModelMapper mapper(){
		System.out.println("Here");
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataIApplication.class, args);
	}
}
