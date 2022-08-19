package com.idat.EFRubenDiosesCliente.servicio;

import java.util.List;

import com.idat.EFRubenDiosesCliente.model.Cliente;

public interface ClienteService {
	
	public List<Cliente> listarClientes();
	public Cliente obtenerCliente();
	public void guardarCliente(Cliente cliente);
	public void asignarPizzas();

}
