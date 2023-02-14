package com.example.test;

public class User {
    private String userName;
    private String userEmail;
    private String userPhoneNumber;
    private String userPassword;


    public User(String userName, String userEmail, String userPhoneNumber, String userPassword) //register
    {
        this.userName = userName;
        this.userEmail = userEmail;

        this.userPhoneNumber = userPhoneNumber;
        this.userPassword = userPassword;

    }

    //overloading of constructors one of them for the register and the other for login
    public User(String userEmail, String userPassword)//login
    {
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }


    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }


    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public String getUserPassword() {
        return userPassword;
    }
}