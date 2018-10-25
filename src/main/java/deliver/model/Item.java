package deliver.model;

import dbs.controllers.*;
public class Item {

    private int id;
    private int order_id;
    private String itemName;
    private int quantity;
    private float price;

    public Item(int order_id, String itemName, int quantity, float price) {
        this.order_id = order_id;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getOrder_id() {
        return order_id;
    }
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
