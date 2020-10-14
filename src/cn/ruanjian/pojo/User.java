package cn.ruanjian.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String location;

    public User(String username, String location) {
        this.username = username;
        this.location = location;
    }

    public User(){

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", location='" + location + '\'' +
                '}';
    }


}
