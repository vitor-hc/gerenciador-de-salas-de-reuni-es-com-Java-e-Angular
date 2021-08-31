package com.digital.crud.saladereuniao.model;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="meetingroom")
public class Room {
    private long id;
    private String name;
    private String date;
    private String starHour;
    private String endHour;
    public Room(){

    }

    public Room(long id, String name, String date, String starHour, String endHour) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.starHour = starHour;
        this.endHour = endHour;
    }
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
@Column(name="name",nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column(name="date",nullable = false)
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @Column(name="getStarHour",nullable = false)
    public String getStarHour() {
        return starHour;
    }

    public void setStarHour(String starHour) {
        this.starHour = starHour;
    }
    @Column(name="getEndHour",nullable = false)
    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }
    @Override

    public String toString(){
 return  "Room [id="+id+", name="+name+", startHour="+starHour+" endHour="+endHour+" ]";



    }
}
