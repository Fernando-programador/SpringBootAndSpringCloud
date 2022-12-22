package com.micro.hrusuario.Resource;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.hrusuario.Entities.Usuario;
import com.micro.hrusuario.Repository.UsuarioRepositorio;

@RestController
@RequestMapping(value = "/usuario")
public class RecursoUsuario {

	@Autowired
	private UsuarioRepositorio repository;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> findbyid(@PathVariable ("id") Long id){
		Usuario obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
	
	@GetMapping(value = "/3")
	public String teste(){
		
		return "testando a conexão";
	
	}

}
