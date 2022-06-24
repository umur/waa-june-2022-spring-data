package lab3.repository;

import lab3.model.bidirectional.AddressBi;
//import lab3.model.jointTable.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<AddressBi, Integer> {
        //JpaRepository<Address,Integer>{


}
