package deliver.controller;

import deliver.main.Main;
import deliver.model.Person;

import java.util.Scanner;

public class SignUp {

    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public void createUser()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your first name: ");
        firstName= scanner.nextLine();
        System.out.println("Your last name: ");
        lastName = scanner.nextLine();
        System.out.println("Your phone: ");
        phone= scanner.nextLine();
        System.out.println("Your address: ");
        address=scanner.nextLine();

        Person user = (Person) Main.db_manager.save(new Person(firstName, lastName, phone, address));
        Person userInfo = (Person) Main.db_manager.get(user.getId(), Person.class);
        System.out.println(userInfo);


    }
    public static void main(String[] args){
        SignUp signUp = new SignUp();
        signUp.createUser();
    }
}
