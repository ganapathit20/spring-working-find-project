package com.startup.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {
	
	@Id
	private long id;
	
	private String uName;

}
