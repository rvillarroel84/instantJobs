package com.rvillarroel.instantjob.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Specialist {
	@Id
	@GeneratedValue
	private Long id;

	@Column(length = 200)
	@NotNull
	private String name;

	@Column(name = "last_name", length = 250)
	@NotNull
	private String lastName;

	@Column(length = 20)
	@NotNull
	private String dni;

	@Column(length = 150)
	@NotNull
	private String email;

	@Size(min = 1, max = 2000)
	private String resumen;


	@NotNull
	private List<String> habilities;


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}


	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}


	/**
	 * @param resumen the resumen to set
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}


	/**
	 * @return the habilities
	 */
	public List<String> getHabilities() {
		return habilities;
	}
	
	


	/**
	 * @param habilities the habilities to set
	 */
	public void setHabilities(List<String> habilities) {
		this.habilities = habilities;
	}


	/**
	 * @param id
	 * @param name
	 * @param lastName
	 * @param dni
	 * @param email
	 * @param resumen
	 * @param habilities
	 */
	public Specialist(Long id, String name, String lastName, String dni, String email, String resumen,
			List<String> habilities) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.dni = dni;
		this.email = email;
		this.resumen = resumen;
		this.habilities = habilities;
	}
	
	public Specialist() {
		
	}






}
