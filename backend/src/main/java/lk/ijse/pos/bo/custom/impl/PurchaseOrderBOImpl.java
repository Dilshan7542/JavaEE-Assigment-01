package lk.ijse.pos.bo.custom.impl;

import lk.ijse.pos.bo.custom.PurchaseOrderBO;
import lk.ijse.pos.dto.OrderDTO;
import org.hibernate.Session;

import java.util.List;

public class PurchaseOrderBOImpl implements PurchaseOrderBO {
    @Override
    public OrderDTO saveOrder( OrderDTO itemDTO) {
        return null;
    }

    @Override
    public OrderDTO updateOrder( OrderDTO itemDTO) {
        return null;
    }

    @Override
    public boolean deleteOrder( String id) {
        return false;
    }

    @Override
    public OrderDTO searchOrder( String id) {
        return null;
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        return null;
    }

    @Override
    public void openSession() {

    }

    @Override
    public void closeSession() {

    }
}
