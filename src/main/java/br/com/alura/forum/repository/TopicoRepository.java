package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	List<Topico> findByCursoNome(String nomeCurso);
	
	
	// Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso") 
	// List<Topico> carregarPorNomeCurso(@Param("nomeCurso")String nomeCurso);
	 

}
