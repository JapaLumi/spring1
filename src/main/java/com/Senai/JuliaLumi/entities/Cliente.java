package com.Senai.JuliaLumi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

	//Atributos 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column(name = "nome")
	private String nCliente;
	
	@Column(name = "fone")
	private String fone;
	
	//Métodos get
	public Long getidcCliente() {
		return idcCliente;
	}
	
	public String getnCliente() {
		return nCliente;
	}
	
	public String getfone() {
		return fone;
	}
	
	//Métodos set
	public void setId(Long idcCliente) {
		this.idcCliente = idcCliente;
	}
	
	public void setName(String nCliente) {
		this.nCliente = nCliente;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}
}
