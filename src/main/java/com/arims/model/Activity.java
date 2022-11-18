package com.arims.model;

import javax.persistence.*;

@Entity
@Table(name="activity")

public class Activity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String activity_name;

    @Column(nullable = false)
    private String activity_type;

    public Activity() {

    } public Activity(String activity_name, String activity_type){
        super();
        this.activity_name= activity_name;
        this.activity_type= activity_type;
    }
    public Long getId() {return id; }

    public void setId(Long id) { this.id = id; }

    public String getActivity_name () { return activity_name; }

    public void setActivity_name (String activity_name){ this.activity_name = activity_name; }

    public String getActivity_type () { return activity_type; }

    public void setActivity_type (String activity_type){ this.activity_type= activity_type; }




}
