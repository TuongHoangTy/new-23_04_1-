package Motel_new.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
public class Staff {
    @Id
    @GeneratedValue
    private Long id;

    @MapsId
    @OneToOne
    @JoinColumn(name = "id")
    private Account account;

    private String salePhone;

    @ManyToOne
    @JoinColumn(name = "permission_id")
    private StaffPermission permission;


}
