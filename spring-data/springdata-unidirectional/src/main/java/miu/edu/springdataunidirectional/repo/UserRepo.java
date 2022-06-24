package miu.edu.springdataunidirectional.repo;

import miu.edu.springdataunidirectional.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
}
