package com.hibernate.entity;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "jpa_student")
public class Student
{
    @Id
    private int studentId;
    private String studentName;
    private String about;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    @JoinColumn(name="student_Id_Mapped")
    private laptop laptop;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", about='" + about + '\'' +
                ", laptop=" + laptop +
                '}';
    }

    public Student() {
    }

    public Student(int studentId, String studentName, String about, com.hibernate.entity.laptop laptop) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.about = about;
        this.laptop = laptop;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public com.hibernate.entity.laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(com.hibernate.entity.laptop laptop) {
        this.laptop = laptop;
    }
}
