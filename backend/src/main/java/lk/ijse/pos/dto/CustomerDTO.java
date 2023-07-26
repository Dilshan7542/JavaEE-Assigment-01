package lk.ijse.pos.dto;

import lk.ijse.pos.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    String customerID;
    String name;
    String address;
    double salary;
    List<Order> orderList;
}