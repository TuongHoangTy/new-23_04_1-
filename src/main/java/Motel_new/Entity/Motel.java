package Motel_new.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

@Data
@Entity
public class Motel {
    @Id
    @GeneratedValue
    private Long id;
    private String nanme;
    private String thumbnail;
    private BigDecimal price;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne
    private Staff createBy;

    @ManyToOne
    private Staff updateBy;







}

