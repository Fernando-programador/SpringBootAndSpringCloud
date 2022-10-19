package com.microServices.Recurso;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microServices.Entities.Pagamento;
import com.microServices.Servico.PagamentoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping(value = "/pagamento")
public class PagamentoResource {

	@Autowired
	private PagamentoService service;
	
	@HystrixCommand(fallbackMethod = "getPagamentoAltenativo")
	@GetMapping(value = "/{workerId}/dia/{dia}")
	public ResponseEntity<Pagamento> getPagamento(@PathVariable Long workerId, @PathVariable Integer dia) {
		Pagamento pagamento = service.getPagamento(workerId, dia);

		return ResponseEntity.ok(pagamento);
	}
	
	public ResponseEntity<Pagamento> getPagamentoAltenativo(Long workerId, Integer dia) {
		Pagamento pagamento = new Pagamento("Alternativo",  145.4, dia);
		return ResponseEntity.ok(pagamento);
	}
	
}



