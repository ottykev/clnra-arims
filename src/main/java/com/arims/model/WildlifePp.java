package com.arims.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "wildlife_pp")

public class WildlifePp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String activity_type;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private String animal_type;

    @Column(nullable = false)
    private Integer animal_number;

    @Column(nullable = false)
    private Integer total_adults;

    @Column(nullable = false)
    private Integer female_adults;

    @Column(nullable = false)
    private Integer male_adults;

    @Column(nullable = false)
    private Integer female_subadults;

    @Column(nullable = false)
    private Integer male_subadults;

    @Column(nullable = false)
    private Integer female_juveniles;

    @Column(nullable = false)
    private Integer male_juveniles;

    public WildlifePp(){

    }public WildlifePp(String activity_type,Date date,String animal_type,Integer animal_number,Integer total_adults,Integer female_adults,
                       Integer male_adults,Integer female_subadults,Integer male_subadults,Integer female_juveniles,Integer male_juveniles) {
        super();
        this.activity_type = activity_type;
        this.date = date;
        this.animal_type = animal_type;
        this.animal_number = animal_number;
        this.total_adults = total_adults;
        this.female_adults = female_adults;
        this.male_adults = male_adults;
        this.female_subadults = female_subadults;
        this.male_subadults = male_subadults;
        this.female_juveniles = female_juveniles;
        this.male_juveniles = male_juveniles;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getActivity_type() {
        return activity_type;
    }

    public void setActivity_type(String activity_type) {
        this.activity_type = activity_type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAnimal_type() {
        return animal_type;
    }

    public void setAnimal_type(String animal_type) {
        this.animal_type = animal_type;
    }

    public Integer getAnimal_number() {
        return animal_number;
    }

    public void setAnimal_number(Integer animal_number) {
        this.animal_number = animal_number;
    }

    public Integer getTotal_adults() {
        return total_adults;
    }

    public void setTotal_adults(Integer total_adults) {
        this.total_adults = total_adults;
    }

    public Integer getFemale_adults() {
        return female_adults;
    }

    public void setFemale_adults(Integer female_adults) {
        this.female_adults = female_adults;
    }

    public Integer getMale_adults() {
        return male_adults;
    }

    public void setMale_adults(Integer male_adults) {
        this.male_adults = male_adults;
    }

    public Integer getFemale_subadults() {
        return female_subadults;
    }

    public void setFemale_subadults(Integer female_subadults) {
        this.female_subadults = female_subadults;
    }

    public Integer getMale_subadults() {
        return male_subadults;
    }

    public void setMale_subadults(Integer male_subadults) {
        this.male_subadults = male_subadults;
    }

    public Integer getFemale_juveniles() {
        return female_juveniles;
    }

    public void setFemale_juveniles(Integer female_juveniles) {
        this.female_juveniles = female_juveniles;
    }

    public Integer getMale_juveniles() {
        return male_juveniles;
    }

    public void setMale_juveniles(Integer male_juveniles) {
        this.male_juveniles = male_juveniles;
    }



}
