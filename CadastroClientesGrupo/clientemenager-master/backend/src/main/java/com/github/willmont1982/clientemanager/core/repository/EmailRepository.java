package com.github.willmont1982.clientemanager.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.willmont1982.clientemanager.core.model.Email;

public interface EmailRepository extends JpaRepository<Email, Long> {
	
	 

}
