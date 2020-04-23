package Motel_new.Repository;

import Motel_new.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactID extends JpaRepository<Contact,Long> {
}
