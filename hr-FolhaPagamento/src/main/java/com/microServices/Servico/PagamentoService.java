package com.microServices.Servico;

//import java.util.HashMap;
//import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;

import com.microServices.Entities.Pagamento;
import com.microServices.FeignClient.WorkerFeingClient;

//pode ser usado o @Component
@Service
public class PagamentoService {
	
	//usa com restTmplate @Value("hr-worker.host")
	//usa com restTemplate private String workerHost;
	//@Autowired
	//private RestTemplate restTemplate;

	@Autowired
	private WorkerFeingClient workerFeingClient;

	public Pagamento getPagamento(long workerId, int dia) {
		//Map<String, String> uriVariables = new HashMap<>();
		//uriVariables.put("id", "" + workerId);
		//Worker worker  = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
		//return new Pagamento ("Fernando", 200.0, dia);
		
		Worker worker = workerFeingClient.findByid(workerId).getBody();
		return new Pagamento(worker.getNome(), worker.getSalario(), dia);
	}
	
 
}
