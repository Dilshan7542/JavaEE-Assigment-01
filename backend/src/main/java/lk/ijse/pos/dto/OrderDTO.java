package lk.ijse.pos.dto;

import lk.ijse.pos.entity.Customer;
import lk.ijse.pos.entity.SuperEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDTO implements SuperEntity {

    String orderID;
    Date date;
    Time time;
    int discount;
    Customer customer;
    List<OrderDetailDTO> orderDetailList;


}
