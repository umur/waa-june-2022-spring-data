package edu.miu.cs545.joincolumn.repo;

import edu.miu.cs545.joincolumn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
