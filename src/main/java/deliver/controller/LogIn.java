package deliver.controller;

import deliver.main.Main;
import deliver.model.Person;
import deliver.model.User;

import java.util.ArrayList;

public class LogIn {

    public void LoggingIn(){
        ArrayList<Object> allUsers = (ArrayList<Object>) Main.db_manager.findAll(Person.class);
        for (Object person : allUsers) {
            if (person.toString().contains("45") && person.toString().contains("12")){
                System.out.println(true);
            }
            System.out.println(false);
        }

        //Search from db
        //switchToMainBoardScreen(person);
    }

    private void incorrectInputReminder(){

    }

    private void showSignUpScreen(){

    }

    private void switchToMainBoardScreen(User user){
        MainBoard mainBoard = new MainBoard(user);
    }

    public static void main(String[] args) {
        LogIn logIn = new LogIn();
        logIn.LoggingIn();
    }
}
