package com.hibernate.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Student_Address")
public class StudentAddress
{

    @Id
    private int id;
    private String name;
    private String about;

    @OneToMany(mappedBy = "studentAddress", cascade = CascadeType.ALL)
    private List<Address> addressList = new ArrayList<>();


    public StudentAddress() {
    }

    public StudentAddress(int id, String name, String about, List<Address> addressList) {
        this.id = id;
        this.name = name;
        this.about = about;
        this.addressList = addressList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }


    @Override
    public String toString() {
        return "StudentAddress{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                ", addressList=" + addressList +
                '}';
    }

}
