package lk.ijse.pos.dao.custom.impl;

import lk.ijse.pos.dao.custom.OrderDAO;
import lk.ijse.pos.entity.Order;
import org.hibernate.Session;

import java.util.List;

public class OrderDAOImpl implements OrderDAO {
    @Override
    public Order save(Session session, Order entity) {
        return null;
    }

    @Override
    public Order update(Session session, Order entity) {
        return null;
    }

    @Override
    public boolean delete(Session session, String s) {
        return false;
    }

    @Override
    public Order search(Session session, String s) {
        return null;
    }

    @Override
    public List<Order> getAll(Session session) {
        return null;
    }
}
