package lk.ijse.pos.dao.custom.impl;

import lk.ijse.pos.dao.custom.ItemDAO;
import lk.ijse.pos.entity.Item;
import org.hibernate.Session;

import java.util.List;

public class ItemDAOImpl  implements ItemDAO {
    @Override
    public Item save(Session session, Item entity) {
        return null;
    }

    @Override
    public Item update(Session session, Item entity) {
        return null;
    }

    @Override
    public boolean delete(Session session, String s) {
        return false;
    }

    @Override
    public Item search(Session session, String s) {
        return null;
    }

    @Override
    public List<Item> getAll(Session session) {
        return null;
    }
}
