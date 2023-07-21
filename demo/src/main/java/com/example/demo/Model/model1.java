package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "data")
public class model1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String Name;
   private String Email; 
   private String Password; 
  
public String getName() {
    return Name;
}
public void setName(String name) {
    Name = name;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getEmail() {
    return Email;
}
public void setEmail(String email) {
    this.Email = email;
}
public String getPassword() {
    return Password;
}
public void setPassword(String password) {
    this.Password = password;
}
@Override
public String toString() {
    return "model1 [id=" + id + ", Name=" + Name + ", Email=" + Email + ", Password=" + Password + "]";
}

   
}
