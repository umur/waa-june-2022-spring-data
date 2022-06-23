package edu.miu.springdata.lab3.repositories;

import edu.miu.springdata.lab3.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends PagingAndSortingRepository<User,Integer> {

}
