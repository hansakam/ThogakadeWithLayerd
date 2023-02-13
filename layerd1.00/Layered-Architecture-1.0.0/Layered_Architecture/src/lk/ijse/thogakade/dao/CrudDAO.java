package lk.ijse.thogakade.dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO <T,ID>extends SuperDAO{

    ArrayList<T>GetAll()throws SQLException,ClassNotFoundException;

    boolean Save(T dto)throws SQLException,ClassNotFoundException;

    boolean Exists(ID id)throws SQLException,ClassNotFoundException;

    boolean delete(ID id)throws SQLException,ClassNotFoundException;

    boolean Update(T dto)throws SQLException,ClassNotFoundException;

    T Search()throws SQLException,ClassNotFoundException;

    String generateNewId()throws SQLException,ClassNotFoundException;
}
