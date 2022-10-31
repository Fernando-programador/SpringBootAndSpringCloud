package com.micro.hrusuario.Entities;

import java.io.Serializable;
import java.util.Objects;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_funcao")
public class Funcao implements Serializable{

	/**
	 * não usar list mas usar o set que representa um conjunto
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeFuncao;
	
	
	public Funcao() {
	}


	public Funcao(long id, String nomeFuncao) {
		super();
		this.id = id;
		this.nomeFuncao = nomeFuncao;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getRolename() {
		return nomeFuncao;
	}


	public void setRolename(String nomeFuncao) {
		this.nomeFuncao = nomeFuncao;
	}


	@Override
	public int hashCode() {
		return Objects.hash(nomeFuncao);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcao other = (Funcao) obj;
		return Objects.equals(nomeFuncao, other.nomeFuncao);
	}




	
	
	
}
