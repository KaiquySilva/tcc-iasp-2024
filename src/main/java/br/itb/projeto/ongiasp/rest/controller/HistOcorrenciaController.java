package br.itb.projeto.ongiasp.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itb.projeto.ongiasp.model.entity.HistOcorrencia;
import br.itb.projeto.ongiasp.service.HistOcorrenciaService;

@RestController
@RequestMapping("/histocorrencia/")
public class HistOcorrenciaController {
	
	private HistOcorrenciaService HistocorrenciaService;

	public HistOcorrenciaController(HistOcorrenciaService histocorrenciaService) {
		super();
		this.HistocorrenciaService = histocorrenciaService;
	}
	
	@GetMapping("findAll")
	public ResponseEntity<List<HistOcorrencia>> findAll(){
		List<HistOcorrencia> histocorrencias = HistocorrenciaService.findAll();
		
		return new ResponseEntity<List<HistOcorrencia>>(histocorrencias, HttpStatus.OK);
	}

}
