package edu.miu.springdata.lab3.repositories;

import edu.miu.springdata.lab3.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends CrudRepository<Product,Integer> {


}
