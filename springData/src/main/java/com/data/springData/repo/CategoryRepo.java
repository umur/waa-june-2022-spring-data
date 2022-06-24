package com.data.springData.repo;

import com.data.springData.entity.uniDirectional.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
