package deliver.controller;

import deliver.model.*;

import java.util.List;

public class OrderListController {
    public static deliver.database.controllers.DB_Manager db_manager = new deliver.database.controllers.DB_Manager();
    private Object Order;
    private Order order = new Order();


    //Open orders list!
    private void showOpenOrderList() {
        db_manager.findAll((Class) Order);
        String status = order.getStatus();
        long id = order.getId();
        String oName = order.getOrderName();
        String from = order.getFrom();
        String destination = order.getDestination();
        String note = order.getNote();
        long personId = order.getPerson_id();
        if (status == "Open") {
            System.out.println("Delivering ID: " + id + ". Order name: "+oName+". Status: "+status+". Person ID: "+personId+". From: "+from+". To: "+destination+". Note: " + note+".");
        }
    }

    //Done orderes list!
    private void showDoneOrderList() {
        db_manager.findAll((Class) Order);
        String status = order.getStatus();
        long id = order.getId();
        String oName = order.getOrderName();
        String from = order.getFrom();
        String destination = order.getDestination();
        String note = order.getNote();
        long personId = order.getPerson_id();
        if (status == "Done") {
            System.out.println("Delivering ID: " + id + ". Order name: "+oName+". Status: "+status+". Person ID: "+personId+". From: "+from+". To: "+destination+". Note: " + note+".");
        }
    }

    //All orders list!
    private void showAllOrderList() {
        List all = db_manager.findAll((Class) Order);
        System.out.println(all);

    }

}
