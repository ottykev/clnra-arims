package com.arims.model;

import javax.persistence.*;

@Entity
@Table(name="human_conflict")

public class Hwc {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String activity_type;

    @Column(nullable = false)
    private String specy_name;

    @Column(nullable = false)
    private String place;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String livestock_killed;

    @Column(nullable = false)
    private String livestock_type;

    @Column(nullable = false)
    private Integer number_killed;

    @Column(nullable = false)
    private String garden_damaged;

    @Column(nullable = false)
    private String crops_field;

    @Column(nullable = false)
    private String infrastructure;

    @Column(nullable = false)
    private int human_females;

    @Column(nullable = false)
    private int human_males;

    @Column(nullable = false)
    private String others;

    @Column(nullable = false)
    private String damage_confirmed;

    @Column(nullable = false)
    private String reported;

    @Column(nullable = false)
    private String responded_by;

    @Column(nullable = false)
    private String action_taken;

    @Column(nullable = false)
    private String complainant_name;

    @Column(nullable = false)
    private String complainant_address;

    @Column(nullable = false)
    private String investigated_by;

    public Hwc(){

    } public Hwc(String activity_type,String specy_name,String place,String location,String livestock_killed,String livestock_type,Integer number_killed,
                 String garden_damaged,String crops_field,String infrastructure,Integer human_females,Integer human_males,String others,
                 String damage_confirmed,String reported,String responded_by,String action_taken,String complainant_name,String complainant_address,
                 String investigated_by){
        super();
        this.activity_type = activity_type;
        this.specy_name = specy_name;
        this.place = place;
        this.location = location;
        this.livestock_killed = livestock_killed;
        this.livestock_type = livestock_type;
        this.number_killed = number_killed;
        this.garden_damaged = garden_damaged;
        this.crops_field = crops_field;
        this.infrastructure = infrastructure;
        this.human_females = human_females;
        this.human_males = human_males;
        this.others = others;
        this.damage_confirmed = damage_confirmed;
        this.reported = reported;
        this.responded_by = responded_by;
        this.action_taken = action_taken;
        this.complainant_name = complainant_name;
        this.complainant_address = complainant_address;
        this.investigated_by = investigated_by;

    }
    public Long getId() {return id; }

    public void setId(Long Id) { this.id= id; }

    public String getActivity_type() {return activity_type; }
    public void setActivity_type(String activity_type) { this.activity_type =activity_type; }

    public String getSpecy_name() {return specy_name; }
    public void setSpecy_name(String specy_name) {this.specy_name = specy_name; }

    public String getPlace() {return place; }
    public void setPlace(String place) {this.place = place; }

    public String getLocation() {return location; }
    public void setLocation(String location) {this.location = location; }

    public String getLivestock_killed() {return livestock_killed; }
    public void setLivestock_killed(String livestock_killed) {this.livestock_killed = livestock_killed; }

    public String getLivestock_type() {return livestock_type; }
    public void setLivestock_type(String livestock_type) {this.livestock_type = livestock_type; }

    public Integer getNumber_killed() { return number_killed; }
    public void setNumber_killed(Integer number_killed) {this.number_killed = number_killed; }

    public String getGarden_damaged() {
        return garden_damaged;
    }

    public void setGarden_damaged(String garden_damaged) {
        this.garden_damaged = garden_damaged;
    }

    public String getCrops_field() {
        return crops_field;
    }

    public void setCrops_field(String crops_field) {
        this.crops_field = crops_field;
    }

    public String getInfrastructure() {
        return infrastructure;
    }

    public void setInfrastructure(String infrastructure) {
        this.infrastructure = infrastructure;
    }

    public int getHuman_females() {
        return human_females;
    }

    public void setHuman_females(int human_females) {
        this.human_females = human_females;
    }

    public int getHuman_males() {
        return human_males;
    }

    public void setHuman_males(int human_males) {
        this.human_males = human_males;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getDamage_confirmed() {
        return damage_confirmed;
    }

    public void setDamage_confirmed(String damage_confirmed) {
        this.damage_confirmed = damage_confirmed;
    }

    public String getReported() {
        return reported;
    }

    public void setReported(String reported) {
        this.reported = reported;
    }

    public String getResponded_by() {
        return responded_by;
    }

    public void setResponded_by(String responded_by) {
        this.responded_by = responded_by;
    }

    public String getAction_taken() {
        return action_taken;
    }

    public void setAction_taken(String action_taken) {
        this.action_taken = action_taken;
    }

    public String getComplainant_name() {
        return complainant_name;
    }

    public void setComplainant_name(String complainant_name) {
        this.complainant_name = complainant_name;
    }

    public String getComplainant_address() {
        return complainant_address;
    }

    public void setComplainant_address(String complainant_address) {
        this.complainant_address = complainant_address;
    }

    public String getInvestigated_by() {
        return investigated_by;
    }

    public void setInvestigated_by(String investigated_by) {
        this.investigated_by = investigated_by;
    }



}
