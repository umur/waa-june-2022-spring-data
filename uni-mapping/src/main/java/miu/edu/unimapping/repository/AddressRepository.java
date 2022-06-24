package miu.edu.unimapping.repository;

import miu.edu.unimapping.entity.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Integer> {
}
