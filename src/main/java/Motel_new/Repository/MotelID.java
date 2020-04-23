package Motel_new.Repository;

import Motel_new.Entity.Motel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotelID extends JpaRepository<Motel,Long> {
}
