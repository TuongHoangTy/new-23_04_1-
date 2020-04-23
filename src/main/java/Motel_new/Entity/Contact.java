package Motel_new.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Contact {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String content;

    private String reply;

    @ManyToOne
    @JoinColumn(name = "motel_id")
    private Motel motel;

    @ManyToOne
    private Customer createBy;

    @ManyToOne
    private Staff updateBy;


}
