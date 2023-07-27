package lk.ijse.pos.controller;

import lk.ijse.pos.bo.BOType;
import lk.ijse.pos.bo.FactoryBO;
import lk.ijse.pos.bo.custom.ItemBO;
import lk.ijse.pos.util.HandleController;
import lk.ijse.pos.util.Status;

import javax.json.JsonObject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/item")
public class ItemController extends HttpServlet implements HandleController {
    ItemBO itemBO= (ItemBO) FactoryBO.getInstance().getBO(BOType.ITEM);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }

    @Override
    public void saveAndUpdateCustomer(HttpServletRequest req, HttpServletResponse resp, Status status) throws Exception {

    }

    @Override
    public boolean isValid(JsonObject jsonObject) {
        return false;
    }
}
