package com.github.willmont1982.clientemanager.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.willmont1982.clientemanager.core.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	 List<Cliente> findByNomeStartingWithIgnoreCase(String nome);

}
