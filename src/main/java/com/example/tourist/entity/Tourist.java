package com.example.tourist.entity;
import jakarta.persistence.*;
@Entity
@Table(name="tourists")
public class Tourist {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 private String name;
 private String country;
 private String destination;
 public Long getId(){return id;}
 public void setId(Long id){this.id=id;}
 public String getName(){return name;}
 public void setName(String name){this.name=name;}
 public String getCountry(){return country;}
 public void setCountry(String country){this.country=country;}
 public String getDestination(){return destination;}
 public void setDestination(String destination){this.destination=destination;}
}
