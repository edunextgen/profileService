package com.edunextgen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subscription_type")
public class subscriptiontype {
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "sub_type_name")
    String sub_type_name;
    
    @Column(name = "sub_validity")
    Long sub_validity;
    
    @Column(name = "sub_price")
    Long sub_price;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getsub_type_name() {
        return sub_type_name;
    }

    public void setsub_type_name(String sub_type_name) {
        this.sub_type_name = sub_type_name;
    }
    
    public Long getsub_validity() {
        return sub_validity;
    }

    public void setsub_validity(Long sub_validity) {
        this.sub_validity = sub_validity;
    }
    
    public Long getsub_price() {
        return sub_price;
    }

    public void setsub_pricey(Long sub_price) {
        this.sub_price = sub_price;
    }
}



