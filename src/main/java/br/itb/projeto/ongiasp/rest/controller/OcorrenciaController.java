package br.itb.projeto.ongiasp.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itb.projeto.ongiasp.model.entity.Ocorrencia;
import br.itb.projeto.ongiasp.service.OcorrenciaService;

@RestController
@RequestMapping("/ocorrencia/")
public class OcorrenciaController {
   
	private OcorrenciaService ocorrenciaService;

	public OcorrenciaController(OcorrenciaService ocorrenciaService) {
		super();
		this.ocorrenciaService = ocorrenciaService;
	}

	
	@GetMapping("findAll")
	public ResponseEntity<List<Ocorrencia>> findAll(){
		List<Ocorrencia> ocorrencias = ocorrenciaService.findAll();
		
		return new ResponseEntity<List<Ocorrencia>>(ocorrencias, HttpStatus.OK);
	}
}
	
