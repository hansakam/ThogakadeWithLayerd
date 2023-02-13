/**
 * @author :Hansaka Malshan
 * created 2/9/2023---11:58 PM
 */
package lk.ijse.thogakade.dao;

import lk.ijse.thogakade.dao.custom.impl.CustomerDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getDaoFactory() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
            //  return daoFactory==null?new DAOFactory():daoFactory;
        }
        return daoFactory;
    }
    public enum Types{
        CUSTOMER
    }
    public SuperDAO getDAO(Types types){
        switch (types){
            case CUSTOMER:
                return new CustomerDAOImpl();
            default:
                return null;
        }
    }
}

