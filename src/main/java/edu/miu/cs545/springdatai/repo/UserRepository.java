package edu.miu.cs545.springdatai.repo;

import edu.miu.cs545.springdatai.entity.Review;
import edu.miu.cs545.springdatai.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
}
