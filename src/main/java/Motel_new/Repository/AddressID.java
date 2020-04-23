package Motel_new.Repository;

import Motel_new.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressID extends JpaRepository<Address,Long> {
}
