package com.example.proektchernovik.models;
import java.io.Serializable;
public class User implements Serializable{
    private String email;
    private String password;
    private String name;
    private  String passwordTwo;
    public User(String email, String password, String name, String passwordTwo){
        this.email = email;
        this.password = password;
        this.name = name;
        this.passwordTwo = passwordTwo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPasswordTwo(){
        return passwordTwo;
    }
    public void setPasswordTwo(String passwordTwo){
        this.passwordTwo = passwordTwo;
    }
}
