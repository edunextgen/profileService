package com.edunextgen.entity;

import javax.persistence.*;


@Entity
@Table(name = "user_labs")
public class userlabs {

	    @Id
	    @Column(name = "id")
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    Long id;

	    @Column(name = "user_id")
	    Long user_id;

	    @Column(name = "lab_id")
	    Long lab_id;
	    
	    @Column(name = "lab_username")
	    String lab_username;
	    
	    @Column(name = "lab_password")
	    String lab_password;
	    
	    @Column(name = "user_subs_id")
	    Long user_subs_id;
	    
	    @Column(name = "created_on")
	    Long created_on;
	    
	    @Column(name = "lab_system_id")
	    Long lab_system_id;

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public Long getuser_id() {
	        return user_id;
	    }

	    public void setuser_id(Long user_id) {
	        this.user_id = user_id;
	    }
	    
	    public Long getlab_id() {
	        return lab_id;
	    }

	    public void setlab_id(Long lab_id) {
	        this.lab_id = lab_id;
	    }

	    public String getlab_username() {
	        return lab_username;
	    }

	    public void setlab_username(String lab_username) {
	        this.lab_username = lab_username;
	    }
	    public String getlab_password() {
	        return lab_password;
	    }

	    public void setlab_password(String lab_password) {
	        this.lab_password = lab_password;
	    }
	    public Long getuser_subs_id() {
	        return user_subs_id;
	    }

	    public void setuser_subs_id(Long user_subs_id) {
	        this.user_subs_id = user_subs_id;
	    }
	    public Long getcreated_on() {
	        return created_on;
	    }

	    public void setcreated_on(Long created_on) {
	        this.created_on = created_on;
	    }

	    public Long getlab_system_id() {
	        return lab_system_id;
	    }

	    public void setlab_system_id(Long lab_system_id) {
	        this.lab_system_id = lab_system_id;
	    }
	}


