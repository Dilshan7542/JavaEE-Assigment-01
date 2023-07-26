package lk.ijse.pos.dao.custom.impl;

import lk.ijse.pos.dao.custom.OrderDetailDAO;
import lk.ijse.pos.entity.OrderDetail;
import org.hibernate.Session;

import java.util.List;

public class OrderDetailDAOImpl implements OrderDetailDAO {
    @Override
    public OrderDetail save(Session session, OrderDetail entity) {
        return null;
    }

    @Override
    public OrderDetail update(Session session, OrderDetail entity) {
        return null;
    }

    @Override
    public boolean delete(Session session, String s) {
        return false;
    }

    @Override
    public OrderDetail search(Session session, String s) {
        return null;
    }

    @Override
    public List<OrderDetail> getAll(Session session) {
        return null;
    }
}
