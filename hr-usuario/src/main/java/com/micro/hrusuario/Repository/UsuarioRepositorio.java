package com.micro.hrusuario.Repository;





import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.hrusuario.Entities.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

	
	//Acrescentar uma busca por E-mail do usuário
	
	Usuario findByEmail(String email);

	//Optional<Usuario> findById(Long id);

	

	
}
