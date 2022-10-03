package com.microServices.Recurso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microServices.Entity.Worker;
import com.microServices.Entity.Repositorio.RepositoryWorker;



@RestController
@RequestMapping(value = "/service")
public class ResourceWorker {
	
	@Autowired
	private RepositoryWorker repository;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll(){
		List<Worker> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findByid(@PathVariable Long id) {
		Worker obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
	
	
}
