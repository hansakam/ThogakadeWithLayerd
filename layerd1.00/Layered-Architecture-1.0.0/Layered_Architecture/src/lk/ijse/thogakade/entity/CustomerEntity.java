/**
 * @author :Hansaka Malshan
 * created 2/10/2023---12:07 AM
 */
package lk.ijse.thogakade.entity;

public class CustomerEntity {
    String id;
    String name;
    String address;

    public CustomerEntity(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
