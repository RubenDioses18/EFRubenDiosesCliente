package com.idat.EFRubenDiosesCliente.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFRubenDiosesCliente.client.OpenFeignClient;
import com.idat.EFRubenDiosesCliente.dto.PizzaDTO;
import com.idat.EFRubenDiosesCliente.model.Cliente;
import com.idat.EFRubenDiosesCliente.model.ClienteDetalle;
import com.idat.EFRubenDiosesCliente.model.ClientePizzaFK;
import com.idat.EFRubenDiosesCliente.repository.ClienteRepository;
import com.idat.EFRubenDiosesCliente.repository.DetalleClientePizzaRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired(required = false)
	private ClienteRepository repository;
	
	@Autowired(required = false)
	private DetalleClientePizzaRepository repositoryClientePizza;
	
	@Autowired(required = false)
	private OpenFeignClient feign;
	

	@Override
	public List<Cliente> listarClientes() {
		return repository.findAll();
	}

	@Override
	public Cliente obtenerCliente() {
		return null;
	}

	@Override
	public void guardarCliente(Cliente cliente) {
		repository.save(cliente);

	}

	@Override
	public void asignarPizzas() {
		List<PizzaDTO> listado = feign.listadoPizzaSeleccionados();
		
		ClienteDetalle detalle = null;
		ClientePizzaFK fk = null;
		
		for (PizzaDTO pizzaDTO : listado) {
			detalle = new ClienteDetalle();
			fk = new ClientePizzaFK();
			
			fk.setIdpizza(pizzaDTO.getId_pizza());
			fk.setIdcliente(1);
			
			detalle.setFk(fk);
			
			repositoryClientePizza.save(detalle);
		}
		
		
	}

}
