package Motel_new.Entity;

import Motel_new.Enum.PermissionName;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class StaffPermission {
    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private PermissionName name;
}
