package com.idat.EFRubenDiosesCliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFRubenDiosesCliente.model.Cliente;
import com.idat.EFRubenDiosesCliente.servicio.ClienteService;

@Controller
@RequestMapping("/api/v1/cliente")
public class ClienteController {
	
	@Autowired(required = false)
	private ClienteService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Cliente> listarClientes(){
		return service.listarClientes();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Cliente obtenerCliente(@PathVariable Integer id) {
		return null;
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarCliente(@RequestBody Cliente cliente) {
		service.guardarCliente(cliente);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarPizzas() {
		service.asignarPizzas();
	}

}
