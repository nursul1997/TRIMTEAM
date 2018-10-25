package deliver.controller;

import deliver.main.Main;
import deliver.model.User;

public class LogIn {

    public void LoggingIn(User user){
        //Search from db
        switchToMainBoardScreen(user);
    }

    private void incorrectInputReminder(){

    }

    private void showSignUpScreen(){

    }

    private void switchToMainBoardScreen(User user){
        MainBoard mainBoard = new MainBoard(user);
    }
}
