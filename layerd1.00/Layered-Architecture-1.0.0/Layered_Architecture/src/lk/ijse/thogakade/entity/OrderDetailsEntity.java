/**
 * @author :Hansaka Malshan
 * created 2/10/2023---12:19 AM
 */
package lk.ijse.thogakade.entity;

public class OrderDetailsEntity {
    String OId;
    String itemCode;
    int qty;
    double unitPrice;

    public OrderDetailsEntity(String OId, String itemCode, int qty, double unitPrice) {
        this.OId = OId;
        this.itemCode = itemCode;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getOId() {
        return OId;
    }

    public void setOId(String OId) {
        this.OId = OId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
