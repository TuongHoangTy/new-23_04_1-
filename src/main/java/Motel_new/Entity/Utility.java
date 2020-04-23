package Motel_new.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Utility {
    @Id
    @GeneratedValue
    private Long id;
    private String name;


}
