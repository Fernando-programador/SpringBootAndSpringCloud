package com.microServices.Entity.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microServices.Entity.Worker;

public interface RepositoryWorker extends JpaRepository<Worker, Long> {

}
