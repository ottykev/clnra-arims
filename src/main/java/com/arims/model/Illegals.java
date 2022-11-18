package com.arims.model;


import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="illegal_activities")

public class Illegals {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private Time time;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private Integer number_shots;

    @Column(nullable = false)
    private String spoor_seen;

    @Column(nullable = false)
    private String camp_found;

    @Column(nullable = false)
    private String specy_killed;

    @Column(nullable = false)
    private Integer fish_species_caught;

    @Column(nullable = false)
    private Integer animals_killed;

    @Column(nullable = false)
    private String poaching_method;

    @Column(nullable = false)
    private String illegal_incident;

    @Column(nullable = false)
    private String stock_theft;

    @Column(nullable = false)
    private String stock_type;

    @Column(nullable = false)
    private Integer number_stock;

    @Column(nullable = false)
    private String reported_by;

    @Column(nullable = false)
    private String arrest_by;

    @Column(nullable = false)
    private String conviction;

    @Column(nullable = false)
    private String conviction_type;

    public Illegals(){

    }public Illegals(Date date, Time time,String location,Integer number_shots,String spoor_seen,
                     String camp_found,String specy_killed,Integer fish_species_caught,
                     Integer animals_killed,String poaching_method,String illegal_incident,String stock_theft,String stock_type,
                     Integer number_stock,String reported_by,String arrest_by,String conviction,String conviction_type){
        super();
        this.date = date;
        this.time = time;
        this.location = location;
        this.number_shots = number_shots;
        this.spoor_seen =spoor_seen;
        this.camp_found = camp_found;
        this.specy_killed = specy_killed;
        this.fish_species_caught = fish_species_caught;
        this.animals_killed = animals_killed;
        this.poaching_method = poaching_method;
        this.illegal_incident = illegal_incident;
        this.stock_theft = stock_theft;
        this.stock_type = stock_type;
        this.number_stock = number_stock;
        this.reported_by = reported_by;
        this.arrest_by = arrest_by;
        this.conviction = conviction;
        this.conviction_type = conviction_type;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getNumber_shots() {
        return number_shots;
    }

    public void setNumber_shots(Integer number_shots) {
        this.number_shots = number_shots;
    }

    public String getSpoor_seen() {
        return spoor_seen;
    }

    public void setSpoor_seen(String spoor_seen) {
        this.spoor_seen = spoor_seen;
    }

    public String getCamp_found() {
        return camp_found;
    }

    public void setCamp_found(String camp_found) {
        this.camp_found = camp_found;
    }

    public String getSpecy_killed() {
        return specy_killed;
    }

    public void setSpecy_killed(String specy_killed) {
        this.specy_killed = specy_killed;
    }

    public Integer getFish_species_caught() {
        return fish_species_caught;
    }

    public void setFish_species_caught(Integer fish_species_caught) {
        this.fish_species_caught = fish_species_caught;
    }

    public Integer getAnimals_killed() {
        return animals_killed;
    }

    public void setAnimals_killed(Integer animals_killed) {
        this.animals_killed = animals_killed;
    }

    public String getPoaching_method() {
        return poaching_method;
    }

    public void setPoaching_method(String poaching_method) {
        this.poaching_method = poaching_method;
    }

    public String getIllegal_incident() {
        return illegal_incident;
    }

    public void setIllegal_incident(String illegal_incident) {
        this.illegal_incident = illegal_incident;
    }

    public String getStock_theft() {
        return stock_theft;
    }

    public void setStock_theft(String stock_theft) {
        this.stock_theft = stock_theft;
    }

    public String getStock_type() {
        return stock_type;
    }

    public void setStock_type(String stock_type) {
        this.stock_type = stock_type;
    }

    public Integer getNumber_stock() {
        return number_stock;
    }

    public void setNumber_stock(Integer number_stock) {
        this.number_stock = number_stock;
    }

    public String getReported_by() {
        return reported_by;
    }

    public void setReported_by(String reported_by) {
        this.reported_by = reported_by;
    }

    public String getArrest_by() {
        return arrest_by;
    }

    public void setArrest_by(String arrest_by) {
        this.arrest_by = arrest_by;
    }

    public String getConviction() {
        return conviction;
    }

    public void setConviction(String conviction) {
        this.conviction = conviction;
    }

    public String getConviction_type() {
        return conviction_type;
    }

    public void setConviction_type(String conviction_type) {
        this.conviction_type = conviction_type;
    }



}
