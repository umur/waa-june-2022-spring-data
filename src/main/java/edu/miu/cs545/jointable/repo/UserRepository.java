package edu.miu.cs545.jointable.repo;

import edu.miu.cs545.jointable.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
