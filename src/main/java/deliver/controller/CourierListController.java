package deliver.controller;

import deliver.model.*;

import java.util.List;

public class CourierListController extends deliver.database.controllers.DB_Manager {
    public static deliver.database.controllers.DB_Manager db_manager = new deliver.database.controllers.DB_Manager();
    private Object Person;
    private Object User;
    private User user = new User();

    //Free couriers list!
    private void showFreeCouriersList() {
        db_manager.findAll((Class) User);
        String status = user.getStatus();
        String uName = user.getUserName();
        if (status == "free") {
            System.out.println(uName + " is " + status);
        }
    }

    // All couriers list!
    private void showAllCouriersList() {
        List all = db_manager.findAll((Class) User);
        System.out.println(all);
    }

    //Delivering couriers list!
    private void showDeliveringCouriersList() {
        db_manager.findAll((Class) User);
        String status = user.getStatus();
        String uName = user.getUserName();
        if (status == "delivering") {
            System.out.println(uName + " is " + status);
        }
    }

}
