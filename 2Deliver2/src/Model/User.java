package Model;

public class User {

    int person_Id;
    int role_Id;
    String userName;
    String password;
    String eMail;
    String address;
    String status;
    public User(){
    }

    public User(String userName, String password,String eMail, String address, String status){
        this.userName = userName;
        this.password = password;
        this.eMail = eMail;
        this.address = address;
        this.status = status;
    }

}
