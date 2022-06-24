package edu.miu.cs545.springdatai.repo;

import edu.miu.cs545.springdatai.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
