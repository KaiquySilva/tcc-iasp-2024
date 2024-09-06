package br.itb.projeto.ongiasp.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.itb.projeto.ongiasp.model.entity.TipoOcorrencia;

@Repository
public interface TipoOcorrenciaRepository extends JpaRepository<TipoOcorrencia, Long>{
	
	
	

}
