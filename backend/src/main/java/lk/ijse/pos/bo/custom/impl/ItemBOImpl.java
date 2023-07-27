package lk.ijse.pos.bo.custom.impl;

import lk.ijse.pos.bo.custom.ItemBO;
import lk.ijse.pos.dto.ItemDTO;
import org.hibernate.Session;

import java.util.List;

public class ItemBOImpl implements ItemBO {
    @Override
    public ItemDTO saveItem( ItemDTO itemDTO) {
        return null;
    }

    @Override
    public ItemDTO updateItem( ItemDTO itemDTO) {
        return null;
    }

    @Override
    public boolean deleteItem( String id) {
        return false;
    }

    @Override
    public ItemDTO searchItem( String id) {
        return null;
    }

    @Override
    public List<ItemDTO> getAllItem() {
        return null;
    }

    @Override
    public void openSession() {

    }

    @Override
    public void closeSession() {

    }
}
