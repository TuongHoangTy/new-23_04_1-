package Motel_new.Repository;

import Motel_new.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerID extends JpaRepository<Customer,Long> {
}
