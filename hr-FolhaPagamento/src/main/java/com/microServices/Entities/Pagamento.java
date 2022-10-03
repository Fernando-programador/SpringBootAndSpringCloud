package com.microServices.Entities;

import java.io.Serializable;

public class Pagamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Double valorDia;
	private Integer dia;
	
	public Pagamento() {
		
	}

	public Pagamento(String nome, Double valorDia, Integer dia) {
		this.nome = nome;
		this.valorDia = valorDia;
		this.dia = dia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorDia() {
		return valorDia;
	}

	public void setValorDia(Double valorDia) {
		this.valorDia = valorDia;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}
	
	
	public Double getTotal() {
		return dia * valorDia;
	}
	
	
}
