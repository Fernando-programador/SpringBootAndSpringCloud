package com.microServices.Servico;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microServices.Entities.Pagamento;

@Service
public class PagamentoService {
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;

	public Pagamento getPagamento(long workerId, int dia) {
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", ""+workerId);
		
		Worker worker = restTemplate.getForObject(workerHost + "/service/{id}", Worker.class, uriVariables);
		return new Pagamento(worker.getNome(), worker.getSalario(), dia);

	}
}
