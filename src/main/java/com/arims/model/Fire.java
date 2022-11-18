package com.arims.model;


import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "fire_incident")
public class Fire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private Time time;

    @Column(nullable = false)
    private String area_name;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String prevention_measures;

    @Column(nullable = false)
    private String fire_cause;

    @Column(nullable = false)
    private String fire_damage;

    @Column(nullable = false)
    private Integer animals_affected;

    @Column(nullable = false)
    private Integer people_affected;

    @Column(nullable = false)
    private String crops_affected;

    public Fire(){

    }public Fire(Date date, Time time, String area_name,String location,String prevention_measures,
                 String fire_cause,String fire_damage,Integer animals_affected,Integer people_affected,String crops_affected){
        super();
        this.date=date;
        this.time=time;
        this.area_name=area_name;
        this.location=location;
        this.prevention_measures=prevention_measures;
        this.fire_cause=fire_cause;
        this.fire_damage=fire_damage;
        this.animals_affected=animals_affected;
        this.people_affected=people_affected;
        this.crops_affected=crops_affected;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPrevention_measures() {
        return prevention_measures;
    }

    public void setPrevention_measures(String prevention_measures) {
        this.prevention_measures = prevention_measures;
    }

    public String getFire_cause() {
        return fire_cause;
    }

    public void setFire_cause(String fire_cause) {
        this.fire_cause = fire_cause;
    }

    public String getFire_damage() {
        return fire_damage;
    }

    public void setFire_damage(String fire_damage) {
        this.fire_damage = fire_damage;
    }

    public Integer getAnimals_affected() {
        return animals_affected;
    }

    public void setAnimals_affected(Integer animals_affected) {
        this.animals_affected = animals_affected;
    }

    public Integer getPeople_affected() {
        return people_affected;
    }

    public void setPeople_affected(Integer people_affected) {
        this.people_affected = people_affected;
    }

    public String getCrops_affected() {
        return crops_affected;
    }

    public void setCrops_affected(String crops_affected) {
        this.crops_affected = crops_affected;
    }




}
