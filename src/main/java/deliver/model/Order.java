package deliver.model;

import deliver.database.interfaces.Savable;

public class Order extends Savable{

    private long this_id =id;
    private long person_id;
    private String orderName;
    private String from;
    private String destination;
    private String note;
    private String status;

    public Order() {}

    public Order(long person_id, String orderName, String from, String destination, String note, String status) {
        this.person_id = person_id;
        this.orderName = orderName;
        this.from = from;
        this.destination = destination;
        this.note = note;
        this.status = status;
    }


    //getters and setters

    public void setId(int id) {
        this.this_id = id;
    }
    public long getPerson_id() {
        return person_id;
    }
    public void setPerson_id(long person_id) {
        this.person_id = person_id;
    }
    public String getOrderName() {
        return orderName;
    }
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderName='" + orderName + '\'' +
                ", from='" + from + '\'' +
                ", destination=" + destination + '\'' +
                ", note=" + note + '\'' +
                ", status=" + status +
                '}';
    }
}
