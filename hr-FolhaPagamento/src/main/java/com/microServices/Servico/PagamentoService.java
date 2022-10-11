package com.microServices.Servico;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.microServices.Entities.Pagamento;
import com.microServices.FeignClient.WorkerFeingClient;

@Service
public class PagamentoService {

	@Autowired
	private WorkerFeingClient workerFeingClient;

	public Pagamento getPagamento(long workerId, int dia) {

		Worker worker = workerFeingClient.findByid(workerId).getBody();
		return new Pagamento(worker.getNome(), worker.getSalario(), dia);

	}
}
