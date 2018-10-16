package deliver.model;

public class Order {

    private int person_id;
    private String orderName;
    private String from;
    private String destination;
    private String note;
    private String status;

    public Order() {
    }

    public Order(String orderName, String from, String destination, String note) {
        this.orderName = orderName;
        this.from = from;
        this.destination = destination;
        this.note = note;
    }

    //getters and setters
    public int getPerson_id() {
        return person_id;
    }
    public void setPerson_id(int person_id) {
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
}
