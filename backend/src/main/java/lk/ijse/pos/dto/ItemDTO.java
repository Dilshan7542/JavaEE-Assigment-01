package lk.ijse.pos.dto;

import lk.ijse.pos.entity.OrderDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {
    String code;
    String description;
    int qty;
    double unitPrice;
    List<OrderDetail> orderDetailList;
}
