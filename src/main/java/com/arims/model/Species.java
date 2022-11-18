package com.arims.model;

import javax.persistence.*;
import java.time.Year;

@Entity
@Table(name="species")

public class Species {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String species_name;

    @Column(nullable = false)
    private Year year;

    @Column(nullable = false)
    private Integer allocated_quota;

    @Column(nullable = false)
    private Integer trophy_fee;

    @Column(nullable = false)
    private Integer total_trophy_amount;

    @Column(nullable = false)
    private Integer number_hunted;

    @Column(nullable = false)
    private Integer special_quota;

    @Column(nullable = false)
    private Integer quota_utilization;

    public Species(){

    }public Species(String species_name,Year year,Integer allocated_quota,Integer trophy_fee,
                    Integer total_trophy_amount,Integer number_hunted,Integer special_quota,Integer quota_utilization){
        super();
        this.species_name = species_name;
        this.year = year;
        this.allocated_quota = allocated_quota;
        this.trophy_fee = trophy_fee;
        this.total_trophy_amount = total_trophy_amount;
        this.number_hunted = number_hunted;
        this.special_quota = special_quota;
        this.quota_utilization = quota_utilization;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getSpecies_name() {
        return species_name;
    }

    public void setSpecies_name(String species_name) {
        this.species_name = species_name;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Integer getAllocated_quota() {
        return allocated_quota;
    }

    public void setAllocated_quota(Integer allocated_quota) {
        this.allocated_quota = allocated_quota;
    }

    public Integer getTrophy_fee() {
        return trophy_fee;
    }

    public void setTrophy_fee(Integer trophy_fee) {
        this.trophy_fee = trophy_fee;
    }

    public Integer getTotal_trophy_amount() {
        return total_trophy_amount;
    }

    public void setTotal_trophy_amount(Integer total_trophy_amount) {
        this.total_trophy_amount = total_trophy_amount;
    }

    public Integer getNumber_hunted() {
        return number_hunted;
    }

    public void setNumber_hunted(Integer number_hunted) {
        this.number_hunted = number_hunted;
    }

    public Integer getSpecial_quota() {
        return special_quota;
    }

    public void setSpecial_quota(Integer special_quota) {
        this.special_quota = special_quota;
    }

    public Integer getQuota_utilization() {
        return quota_utilization;
    }

    public void setQuota_utilization(Integer quota_utilization) {
        this.quota_utilization = quota_utilization;
    }



}
