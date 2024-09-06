package br.itb.projeto.ongiasp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.itb.projeto.ongiasp.model.entity.HistOcorrencia;
import br.itb.projeto.ongiasp.model.repository.HistOcorrenciaRepository;

@Service
public class HistOcorrenciaService{
	
	private HistOcorrenciaRepository histocorrenciaRepository;

	public HistOcorrenciaService(HistOcorrenciaRepository histocorrenciaRepository) {
		super();
		this.histocorrenciaRepository = histocorrenciaRepository;
	}
	
	public List<HistOcorrencia> findAll(){
		List<HistOcorrencia> histocorrencias = histocorrenciaRepository.findAll();
		return histocorrencias;
	}
	
	

	}
	
	




