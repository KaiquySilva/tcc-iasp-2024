package br.itb.projeto.ongiasp.rest.controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itb.projeto.ongiasp.model.entity.TipoOcorrencia;
import br.itb.projeto.ongiasp.service.TipoOcorrenciaService;

@RestController
@RequestMapping("/tipoocorrencia/")
public class TipoOcorrenciaController {
	

	private TipoOcorrenciaService tipoocorrenciaService;

	public TipoOcorrenciaController(TipoOcorrenciaService tipoocorrenciaService) {
		super();
		this.tipoocorrenciaService = tipoocorrenciaService;
	}
	@GetMapping("findAll")
	public ResponseEntity<List<TipoOcorrencia>>findAll(){
		List<TipoOcorrencia> tipoocorrencias = tipoocorrenciaService.findAll();
		
		return new ResponseEntity<List<TipoOcorrencia>>(tipoocorrencias, HttpStatus.OK);
	}

}
