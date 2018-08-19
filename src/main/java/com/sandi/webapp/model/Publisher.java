package com.sandi.webapp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="publisher")
public class Publisher {
	
	private String name;
	private Address address;

}
