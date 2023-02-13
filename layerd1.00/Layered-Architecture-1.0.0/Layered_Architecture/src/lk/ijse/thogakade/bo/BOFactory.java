/**
 * @author :Hansaka Malshan
 * created 2/10/2023---12:00 AM
 */
package lk.ijse.thogakade.bo;

import lk.ijse.thogakade.bo.custom.impl.CustomerBOImpl;

public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory(){

    }
    public static BOFactory getBoFactory(){
        return boFactory==null?new BOFactory():boFactory;
    }
    public enum Types{
        CUSTOMER
    }
    public SupperBO getBO(Types types){
        switch (types){
            case CUSTOMER:
                return new CustomerBOImpl();
            default:
                return null;
        }
    }

}
