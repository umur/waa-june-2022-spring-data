package miu.edu.springdataunidirectional.repo;

import miu.edu.springdataunidirectional.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends CrudRepository<Address, Integer> {
}
