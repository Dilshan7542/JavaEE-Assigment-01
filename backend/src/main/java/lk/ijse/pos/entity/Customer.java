package lk.ijse.pos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer implements SuperEntity{
    @Id
    String customerID;
    String name;
    String address;
    double salary;
    @OneToMany(mappedBy = "customer",orphanRemoval = true,cascade = CascadeType.ALL)
            @OnDelete(action = OnDeleteAction.CASCADE)
    List<Order> orderList;
}
