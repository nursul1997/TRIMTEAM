package Model;

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
}
