package Motel_new.Repository;

import Motel_new.Entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffID extends JpaRepository<Staff,Long> {
}
