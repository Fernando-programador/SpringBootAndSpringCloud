package com.microServices.Servico;

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
		return new Pagamento("Fernando", 200.0, dia);

	}
}
