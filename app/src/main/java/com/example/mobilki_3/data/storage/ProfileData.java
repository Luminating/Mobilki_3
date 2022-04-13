package com.example.mobilki_3.data.storage;

import com.example.mobilki_3.data.SerializeBitmap;
import java.io.Serializable;
import java.util.Date;


public class ProfileData implements Serializable {
    private String id = "";
    private String name = "";
    Date birthday = new Date(10,1,1);
    int weight = 70;
    int height = 170;
    SerializeBitmap photo = null;
    String phoneNumber;
    String email;

    public ProfileData(String id, String name, Date birthday, int weight, int height, SerializeBitmap photo, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
        this.height = height;
        this.photo = photo;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public SerializeBitmap getPhoto() {
        return photo;
    }

    public void setPhoto(SerializeBitmap photo) {
        this.photo = photo;
    }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }
}
