package lk.ijse.pos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class OrderDetail implements SuperEntity{
    @Id
    @ManyToOne
    @JoinColumn(name = "orderID")
    Order order;
    int qty;
    int discount;
    double unitPrice;
    @Id
    @ManyToOne
    @JoinColumn(name = "itemCode")
    Item item;

}
