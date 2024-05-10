package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;

@Entity
@Scope("prototype")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Name;
    private String Email;
    private String Dept;

    // generating getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Dept='" + Dept + '\'' +
                '}';
    }
}
