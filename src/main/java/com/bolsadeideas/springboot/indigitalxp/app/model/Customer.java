package com.bolsadeideas.springboot.indigitalxp.app.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String lastname;
	private String email;
	private String dni;
	private Date birthdate;
}
