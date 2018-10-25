package deliver.model;

import dbs.controllers.DB_Manager;

public class User {

    private int id;
    private int person_Id;
    private int role_Id;
    private String userName;
    private String password;
    private String eMail;
    private String address;
    private String status;

    public User(){
    }

    public User(int person_Id, int role_Id, String userName, String password, String eMail, String address, String status) {
        this.person_Id = person_Id;
        this.role_Id = role_Id;
        this.userName = userName;
        this.password = password;
        this.eMail = eMail;
        this.address = address;
        this.status = status;
    }

    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPerson_Id() {
        return person_Id;
    }
    public void setPerson_Id(int person_Id) {
        this.person_Id = person_Id;
    }
    public int getRole_Id() {
        return role_Id;
    }
    public void setRole_Id(int role_Id) {
        this.role_Id = role_Id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
