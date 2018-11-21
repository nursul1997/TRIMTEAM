package deliver.model;

import deliver.database.interfaces.Savable;

public class Item extends Savable {

    private long order_id;
    private String itemName;
    private int quantity;
    private float price;

    public Item(){};

    public Item(long order_id, String itemName, int quantity, float price) {
        this.order_id = order_id;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    //getters and setters
    public void setId(long id) {
        this.id = id;
    }
    public long getOrder_id() {
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", order_id='" + order_id + '\'' +
                ", itemName='" + itemName + '\'' +
                ", quantity=" + quantity + '\'' +
                ", price=" + price +
                '}';
    }
}
