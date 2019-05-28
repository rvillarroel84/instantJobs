package com.rvillarroel.instantjob.model;

import java.util.Date;
//import java.util.HashSet;
import java.util.Set;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity
public class Calification {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Size(min= 1, max = 5)
	private Long calificacion;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date publicationDate;
	
	
	/*@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "specialist_fk")
	private Set<Specialist> specialist = new HashSet<>();*/
	
	@Size(min= 1, max = 5)
	private Long stars;


	/**
	 * @return the stars
	 */
	public Long getStars() {
		return stars;
	}


	/**
	 * @param stars the stars to set
	 */
	public void setStars(Long stars) {
		this.stars = stars;
	}


	/**
	 * @param id
	 * @param calificacion
	 * @param publicationDate
	 * @param specialist
	 */
	public Calification(Long id, Long calificacion, /*Date publicationDate,*/ Set<Specialist> specialist) {
		super();
		this.id = id;
		this.calificacion = calificacion;
		//this.publicationDate = publicationDate;
		//this.specialist = specialist;
	}


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
	 * @return the calificacion
	 */
	public Long getCalificacion() {
		return calificacion;
	}


	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(Long calificacion) {
		this.calificacion = calificacion;
	}


	/**
	 * @return the publicationDate
	 */
	
	public Date getPublicationDate() {
		return publicationDate;
	}


	/**
	 * @param publicationDate the publicationDate to set
	 */
	
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}


	/**
	 * @return the specialist
	 */
	//public Set<Specialist> getSpecialist() {
	//	return specialist;
	//}


	/**
	 * @param specialist the specialist to set
	 */
	//public void setSpecialist(Set<Specialist> specialist) {
	//	this.specialist = specialist;
	//}
	
	public Calification() {
		
	}
	
	
}
