package com.cs545waa.lab03.repo;

import com.cs545waa.lab03.entity.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepo extends CrudRepository<AppUser,Integer> {
}
