/**
 * @author :Hansaka Malshan
 * created 2/10/2023---12:29 AM
 */
package lk.ijse.thogakade.dao.custom.impl;

import lk.ijse.thogakade.dao.CrudUtil;
import lk.ijse.thogakade.dao.DAOFactory;
import lk.ijse.thogakade.dao.SuperDAO;
import lk.ijse.thogakade.dao.custom.CustomerDAO;
import lk.ijse.thogakade.db.DBConnection;
import lk.ijse.thogakade.dto.CustomerDTO;
import lk.ijse.thogakade.view.tdm.CustomerTM;

import java.sql.*;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public ArrayList<CustomerDTO> GetAll() throws SQLException, ClassNotFoundException {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer");
        ArrayList<CustomerDTO>all=new ArrayList<>();
        while (rst.next()) {
            all.add(new CustomerDTO(rst.getString(1),rst.getString(2),rst.getString(3)));
        }
      return all;
    }

    @Override
    public boolean Save(CustomerDTO dto) throws SQLException, ClassNotFoundException {

        return CrudUtil.executeUpdate("INSERT INTO Customer (id,name, address) VALUES (?,?,?)",dto.getId(),dto.getName(),dto.getAddress());
    }

    @Override
    public boolean Exists(String id) throws SQLException, ClassNotFoundException {

        ResultSet rst = CrudUtil.executeQuery("SELECT id FROM Customer WHERE id=?",id);
        return rst.next();
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return CrudUtil.executeUpdate("DELETE FROM Customer WHERE id=?",id);
    }

    @Override
    public boolean Update(CustomerDTO dto) throws SQLException, ClassNotFoundException {

      return CrudUtil.executeUpdate("UPDATE Customer SET name=?, address=? WHERE id=?",dto.getName(),dto.getAddress(),dto.getId());

    }

    @Override
    public CustomerDTO Search() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public String generateNewId() throws SQLException, ClassNotFoundException {

        ResultSet rst = CrudUtil.executeQuery("SELECT id FROM Customer ORDER BY id DESC LIMIT 1;");
        if (rst.next()) {
            String id = rst.getString("id");
            int newCustomerId = Integer.parseInt(id.replace("C00-", "")) + 1;
            return String.format("C00-%03d", newCustomerId);
        } else {
            return "C00-001";
        }
    }
}
