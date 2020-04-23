package Motel_new.Entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Basic;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.OffsetDateTime;

@Getter
@Setter
@Where(clause = "delete_flag= false")
public class AbstractEntity {
    @Basic(optional = false)
    private boolean deleteFlag;

    private OffsetDateTime createAt;

    private OffsetDateTime updateAt;

    @PrePersist
    public void onPersist(){ updateAt = createAt = OffsetDateTime.now();}

    @PreUpdate
    public  void onUpdate(){ updateAt=OffsetDateTime.now();}
}
