package deliver.controller;


import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import deliver.database.controllers.DB_Manager;
import deliver.model.Order;
import deliver.model.User;

public class MainBoard {

    //FXML bindings from view to controller
    @FXML
    private VBox NavigationMenu;

    @FXML
    private JFXButton Button_toUserInfo;

    @FXML
    private Label Label_shortInfo;

    @FXML
    private ImageView ImageView_UserImage;

    @FXML
    private JFXButton Button_myOrders;

    @FXML
    private JFXButton Button_deliveryServices;

    @FXML
    private JFXButton Button_report;

    @FXML
    private JFXButton Button_settings;

    @FXML
    private ListView<?> ListView_mainList;

    @FXML
    private FontAwesomeIconView Button_addOrder;

    @FXML
    void initialize() {

        assert NavigationMenu != null : "fx:id=\"NavigationMenu\" was not injected: check your FXML file 'sample.fxml'.";
        assert Button_toUserInfo != null : "fx:id=\"Button_toUserInfo\" was not injected: check your FXML file 'sample.fxml'.";
        assert Label_shortInfo != null : "fx:id=\"Label_shortInfo\" was not injected: check your FXML file 'sample.fxml'.";
        assert Button_myOrders != null : "fx:id=\"Button_myOrders\" was not injected: check your FXML file 'sample.fxml'.";
        assert Button_deliveryServices != null : "fx:id=\"Button_deliveryServices\" was not injected: check your FXML file 'sample.fxml'.";
        assert Button_report != null : "fx:id=\"Button_report\" was not injected: check your FXML file 'sample.fxml'.";
        assert Button_settings != null : "fx:id=\"Button_settings\" was not injected: check your FXML file 'sample.fxml'.";
        assert ListView_mainList != null : "fx:id=\"ListView_mainList\" was not injected: check your FXML file 'sample.fxml'.";
        Button_addOrder = null;
    }

    //inner methods

    public static long userId;
    public static DB_Manager db_manager = new DB_Manager();

    public MainBoard(User user) {
        userId = user.getId();
    }

    private void makeOrder(){
        Order myOrder = new Order(userId, "Shoes","Shoes","Shoes","Shoes","Shoes");
        db_manager.save(myOrder);
    }

    private void updateList(){
    }

    private void notifyCourier(){

    }

    private void searchFor(){

    }

    private void showSettingsScreen(){

    }

    private void makeReport() {
    }
}
