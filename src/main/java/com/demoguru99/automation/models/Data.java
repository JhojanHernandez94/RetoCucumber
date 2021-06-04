package com.demoguru99.automation.models;

public class Data {
    private String userName, email, password;

    public Data(String userName,String email,String password){
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}

