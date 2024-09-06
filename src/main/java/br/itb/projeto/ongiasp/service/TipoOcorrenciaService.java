package br.itb.projeto.ongiasp.service;

import java.util.List;


import org.springframework.stereotype.Service;

import br.itb.projeto.ongiasp.model.entity.TipoOcorrencia;
import br.itb.projeto.ongiasp.model.repository.TipoOcorrenciaRepository;

@Service
public class TipoOcorrenciaService {
	
	
	private TipoOcorrenciaRepository tipoOcorrenciaRepository;

	public TipoOcorrenciaService(TipoOcorrenciaRepository tipoocorrenciaRepository) {
		super();
		this.tipoOcorrenciaRepository = tipoocorrenciaRepository;
	}
	public List<TipoOcorrencia> findAll(){
		List<TipoOcorrencia> tipoocorrencias = tipoOcorrenciaRepository.findAll();
		return tipoocorrencias;
	}

}
