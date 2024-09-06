package br.itb.projeto.ongiasp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.itb.projeto.ongiasp.model.entity.Ocorrencia;
import br.itb.projeto.ongiasp.model.repository.OcorrenciaRepository;

@Service
public class OcorrenciaService {
	
	private OcorrenciaRepository ocorrenciaRepository;

	public OcorrenciaService(OcorrenciaRepository ocorrenciaRepository) {
		super();
		this.ocorrenciaRepository = ocorrenciaRepository;
	}
	
	public List<Ocorrencia> findAll(){
		List<Ocorrencia> ocorrencias = ocorrenciaRepository.findAll();
		
		return ocorrencias;
	}

}
