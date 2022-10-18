package com.microServices.FeignClient;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microServices.Servico.Worker;


//@FeignClient(name = "hr-worker",url = "localhost:8005", path = "/service")
//componente gerenciado pelo spring
@Component 

@FeignClient(name = "hr-worker", path = "/service")
public interface WorkerFeingClient {

	//copiei do hr-funcionario com.microService.Recurso
	@GetMapping(value = "/{id}")
	ResponseEntity<Worker> findByid(@PathVariable Long id);
}
