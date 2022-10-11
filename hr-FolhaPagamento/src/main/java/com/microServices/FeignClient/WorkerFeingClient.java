package com.microServices.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Component
@FeignClient(name = "hr-worker", path = "/service")
public interface WorkerFeingClient {

	//copiei do hr-funcionario com.microService.Recurso
	@GetMapping(value = "/{id}")
	ResponseEntity<com.microServices.Servico.Worker> findByid(@PathVariable Long id);
}
