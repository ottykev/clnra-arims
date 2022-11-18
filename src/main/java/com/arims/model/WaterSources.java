package com.arims.model;

import org.springframework.data.geo.Point;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="water_sources")


public class WaterSources {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private String source_name;

    @Column(nullable = false)
    private Point source_location;

    @Column(nullable = false)
    private String mono;

    @Column(nullable = false)
    private String solar;

    @Column(nullable = false)
    private String hand_pumps;

    public WaterSources(){

    }public WaterSources(Date date,String source_name,Point source_location,String mono,String solar,String hand_pumps){
        super();
        this.date = date;
        this.source_name = source_name;
        this.source_location = source_location;
        this.mono = mono;
        this.solar = solar;
        this.hand_pumps = hand_pumps;

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

    public String getSource_name() {
        return source_name;
    }

    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    public Point getSource_location() {
        return source_location;
    }

    public void setSource_location(Point source_location) {
        this.source_location = source_location;
    }

    public String getMono() {
        return mono;
    }

    public void setMono(String mono) {
        this.mono = mono;
    }

    public String getSolar() {
        return solar;
    }

    public void setSolar(String solar) {
        this.solar = solar;
    }

    public String getHand_pumps() {
        return hand_pumps;
    }

    public void setHand_pumps(String hand_pumps) {
        this.hand_pumps = hand_pumps;
    }


}
