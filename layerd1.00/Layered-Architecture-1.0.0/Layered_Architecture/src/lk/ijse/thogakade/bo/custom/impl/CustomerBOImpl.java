/**
 * @author :Hansaka Malshan
 * created 2/10/2023---12:24 AM
 */
package lk.ijse.thogakade.bo.custom.impl;

import lk.ijse.thogakade.bo.custom.CustomerBO;
import lk.ijse.thogakade.dao.DAOFactory;
import lk.ijse.thogakade.dao.custom.CustomerDAO;
import lk.ijse.thogakade.dto.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.Types.CUSTOMER);
    public ArrayList<CustomerDTO> getAllCustomer()throws ClassNotFoundException, SQLException {
        ArrayList<CustomerDTO> All = customerDAO.GetAll();
        ArrayList<CustomerDTO>getall=new ArrayList<>();
        for (CustomerDTO customerDTO : All) {
            getall.add(new CustomerDTO(customerDTO.getId(),customerDTO.getName(),customerDTO.getAddress()));
        }
        return getall;
    }

    @Override
    public boolean SaveCustomer(CustomerDTO dto) throws ClassNotFoundException, SQLException {
        return customerDAO.Save(new CustomerDTO(dto.getId(),dto.getName(),dto.getAddress()));
    }

    @Override
    public boolean UpdateCustomer(CustomerDTO dto) throws ClassNotFoundException, SQLException {
        return customerDAO.Update(new CustomerDTO(dto.getId(),dto.getName(),dto.getAddress()));
    }

    @Override
    public boolean ExistsCustomer(String id) throws ClassNotFoundException, SQLException {
        return customerDAO.Exists(id);
    }

    @Override
    public boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException {
        return customerDAO.delete(id);
    }

    @Override
    public String generateNewId() throws ClassNotFoundException, SQLException {
        return customerDAO.generateNewId();
    }

}
