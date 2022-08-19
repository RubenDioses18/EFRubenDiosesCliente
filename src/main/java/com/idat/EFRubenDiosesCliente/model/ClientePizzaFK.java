package com.idat.EFRubenDiosesCliente.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ClientePizzaFK implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1250053801460905173L;

	@Column(name = "id_cliente", nullable = false, unique = true)
	private Integer idcliente;
	
	@Column(name = "id_pizza", nullable = false, unique = true)
	private Integer idpizza;

	public Integer getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	public Integer getIdpizza() {
		return idpizza;
	}

	public void setIdpizza(Integer idpizza) {
		this.idpizza = idpizza;
	}
	

}
