package com.Monitoria.aulaoSpring.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Monitoria.aulaoSpring.Model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo); 
	
	
}
/***
 * @author Angela Deodato
 * 
 * Classe Repository  --> Faz a ponte entre a model e a controller
 * <Postagem, Long> --> Qual a classe que virá para a repository e o tipo da primary key
	
**/