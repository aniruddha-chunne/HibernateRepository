package com.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="jpa_laptop")
public class laptop
{

    @Id
    private int laptop;
    private String modelNumber;
    private String brand;


    @OneToOne
    private Student student;

    @Override
    public String toString() {
        return "laptop{" +
                "laptop=" + laptop +
                ", modelNumber='" + modelNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", student=" + student +
                '}';
    }

    public laptop() {
    }

    public laptop(int laptop, String modelNumber, String brand, Student student) {
        this.laptop = laptop;
        this.modelNumber = modelNumber;
        this.brand = brand;
        this.student = student;
    }

    public int getLaptop() {
        return laptop;
    }

    public void setLaptop(int laptop) {
        this.laptop = laptop;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
