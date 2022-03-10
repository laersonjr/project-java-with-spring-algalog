package com.laerson.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laerson.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(1l);
		cliente1.setNome("Nome");
		cliente1.setTelefone("Telefone");
		cliente1.setEmail("Email@Email.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Nome2");
		cliente2.setTelefone("Telefone2");
		cliente2.setEmail("Email2@email.com");
		
		return Arrays.asList(cliente1,cliente2);
	}

}
