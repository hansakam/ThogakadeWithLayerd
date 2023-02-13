package lk.ijse.thogakade.bo.custom;

import lk.ijse.thogakade.bo.SupperBO;
import lk.ijse.thogakade.dao.SuperDAO;
import lk.ijse.thogakade.dto.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBO extends SupperBO {
     ArrayList<CustomerDTO> getAllCustomer()throws ClassNotFoundException, SQLException;
     boolean SaveCustomer(CustomerDTO dto)throws ClassNotFoundException, SQLException;
     boolean UpdateCustomer(CustomerDTO dto)throws ClassNotFoundException, SQLException;
     boolean ExistsCustomer(String id)throws ClassNotFoundException, SQLException;
     boolean deleteCustomer(String id)throws ClassNotFoundException, SQLException;
     String generateNewId() throws ClassNotFoundException, SQLException;
}
