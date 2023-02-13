/**
 * @author :Hansaka Malshan
 * created 2/10/2023---12:11 AM
 */
package lk.ijse.thogakade.entity;

public class OrderEntity {
    String Oid;
    String date;
    String customerID;

    public OrderEntity(String oid, String date, String customerID) {
        this.Oid = oid;
        this.date = date;
        this.customerID = customerID;
    }

    public String getOid() {
        return Oid;
    }

    public void setOid(String oid) {
        Oid = oid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}
