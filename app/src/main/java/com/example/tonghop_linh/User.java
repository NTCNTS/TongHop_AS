package com.example.tonghop_linh;

public class User {
    private String name;
    private String birth;
    private String phone;
    private String mail;
    private String username;
    private String password;
    private String location;

    public User(String name, String birth, String phone, String mail, String username, String password, String location) {
        this.name = name;
        this.birth = birth;
        this.phone = phone;
        this.mail = mail;
        this.username = username;
        this.password = password;
        this.location = location;
    }

    public User(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
