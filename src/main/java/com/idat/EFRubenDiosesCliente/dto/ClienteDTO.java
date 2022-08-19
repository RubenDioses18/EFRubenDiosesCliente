package com.idat.EFRubenDiosesCliente.dto;

public class ClienteDTO {
	
	private Integer id_cliente;
	private String nombre_cliente;
	private String apellido_cliente;
	private String nro_celular;
	private String direccion;
	
	
	public ClienteDTO() {
		super();
	}
	public Integer getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public String getApellido_cliente() {
		return apellido_cliente;
	}
	public void setApellido_cliente(String apellido_cliente) {
		this.apellido_cliente = apellido_cliente;
	}
	public String getNro_celular() {
		return nro_celular;
	}
	public void setNro_celular(String nro_celular) {
		this.nro_celular = nro_celular;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	

}
