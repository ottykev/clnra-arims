package com.arims.model;

import javax.persistence.*;

@Entity
@Table(name = "partners")
public class Partners {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String partner_name;

    @Column(nullable = false)
    private String partner_url;

    @Column(nullable = false)
    private String partner_type;

    @Column(nullable = false)
    private String contact_person;

    @Column(nullable = false)
    private String contact_email;

    @Column(nullable = false)
    private String physical_address;

    @Column(nullable = false)
    private Integer phone_number;

    public Partners(){

    }public Partners(String partner_name,String partner_url,String partner_type,String contact_person,String contact_email,String physical_address,Integer phone_number){
        super();
        this.partner_name = partner_name;
        this.partner_url = partner_url;
        this.partner_type = partner_type;
        this.contact_person = contact_person;
        this.contact_email = contact_email;
        this.physical_address = physical_address;
        this.phone_number = phone_number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getPartner_name() {
        return partner_name;
    }

    public void setPartner_name(String partner_name) {
        this.partner_name = partner_name;
    }

    public String getPartner_url() {
        return partner_url;
    }

    public void setPartner_url(String partner_url) {
        this.partner_url = partner_url;
    }

    public String getPartner_type() {
        return partner_type;
    }

    public void setPartner_type(String partner_type) {
        this.partner_type = partner_type;
    }

    public String getContact_person() {
        return contact_person;
    }

    public void setContact_person(String contact_person) {
        this.contact_person = contact_person;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getPhysical_address() {
        return physical_address;
    }

    public void setPhysical_address(String physical_address) {
        this.physical_address = physical_address;
    }

    public Integer getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Integer phone_number) {
        this.phone_number = phone_number;
    }






}
