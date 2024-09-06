package br.itb.projeto.ongiasp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.itb.projeto.ongiasp.model.entity.Ocorrencia;

@Repository

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long>{
	

}


