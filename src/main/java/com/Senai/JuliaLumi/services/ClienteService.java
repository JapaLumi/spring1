package com.Senai.JuliaLumi.services;

import com.Senai.JuliaLumi.repositories.ClienteRepository;
import com.Senai.JuliaLumi.entities.Cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {

	private final ClienteRepository clienteRepository;
	
	@Autowired
	public ClienteService (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	//inserir produto
		public Cliente savecliente(Cliente cliente) {
			return clienteRepository.save(cliente);
	}
		
	//listar produto por id
		public Cliente getClienteById(Long idcCliente) {
			return clienteRepository.findById(idcCliente).orElse(null);
	}
		
	//listar todos os produtos
		public List<Cliente>getAllClientes(){
			return clienteRepository.findAll();
	}
		
	// apagar produto
		public void deleteCliente(Long idcCliente) {
			clienteRepository.deleteById(idcCliente);
	}
}
