package com.idat.EFRubenDiosesCliente.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.EFRubenDiosesCliente.dto.PizzaDTO;

@FeignClient(name = "idat-pizza", url= "localhost:8082")
public interface OpenFeignClient {
	
	@GetMapping("/api/v1/pizza/listar")
	public List<PizzaDTO> listadoPizzaSeleccionados();

}
