package Motel_new.Entity;

import Motel_new.Controller.Controller;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Long id;

    @MapsId
    @OneToOne
    @JoinColumn(name = "id")
    private Account account;

    private String identity;
}
