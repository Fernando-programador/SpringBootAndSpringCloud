package com.micro.hrusuario.Entities;

import java.io.Serializable;
import java.util.Objects;

public class Role implements Serializable{

	/**
	 * não usar list mas usar o set que representa um conjunto
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String rolename;
	
	
	public Role() {
		super();
	}


	public Role(long id, String rolename) {
		super();
		this.id = id;
		this.rolename = rolename;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getRolename() {
		return rolename;
	}


	public void setRolename(String rolename) {
		this.rolename = rolename;
	}


	@Override
	public int hashCode() {
		return Objects.hash(rolename);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		return Objects.equals(rolename, other.rolename);
	}




	
	
	
}
