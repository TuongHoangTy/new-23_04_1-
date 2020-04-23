package Motel_new.Entity;

import Motel_new.Enum.Gender;
import Motel_new.Enum.LoginStatus;
import Motel_new.Enum.RegisterStatus;
import Motel_new.Enum.UserRole;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity

public class Account  extends  AbstractEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String phoneNumber;
    private String password;
    @Column(unique = true)
    private String email;
    @Enumerated(EnumType.STRING)
    private UserRole userRole;
    private String fistname;
    private String lastname;
    private String avatarUrl;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private LoginStatus loginStatus;
    @Enumerated(EnumType.STRING)
    private RegisterStatus registerStatus;
    private String reistractionToken;
    @Column(columnDefinition = "TEXT")
    private String address;

    public String getFullName(){return lastname.concat(" ").concat(fistname).trim();}






}
