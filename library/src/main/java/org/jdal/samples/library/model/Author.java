package org.jdal.samples.library.model;

import info.joseluismartin.model.Entity;

import javax.persistence.Table;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;


@javax.persistence.Entity
@Table(name="authors")
@Filter(name="patternFilter", condition="name like :pattern or surname like :pattern")
@FilterDef(name="patternFilter", parameters=@ParamDef(name="pattern", type="string"))
public class Author  extends Entity {
	
	private static final long serialVersionUID = 1L;
	private String surname;

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String toString() {
		return name + " " + surname;
	}

}
