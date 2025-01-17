package br.itb.projeto.ongiasp.model.entity;

import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ocorrencia")
public class Ocorrencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private LocalDateTime dataOcor;
	private String descricao;
	private String titulo;
	private String logradouro;
	private String numero;
	private String cep;
	private String cidade;
	private String uf;
	private String pontoRef;
	private byte[] foto;
	
	@ManyToOne
	@JoinColumn(name = "id_TOc")
	private TipoOcorrencia tipoOcorrencia;

	private String statusOcor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getDataOcor() {
		return dataOcor;
	}

	public void setDataOcor(LocalDateTime dataOcor) {
		this.dataOcor = dataOcor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getPontoRef() {
		return pontoRef;
	}

	public void setPontoRef(String pontoRef) {
		this.pontoRef = pontoRef;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public TipoOcorrencia getTipoOcorrencia() {
		return tipoOcorrencia;
	}

	public void setTipoOcorrencia(TipoOcorrencia tipoOcorrencia) {
		this.tipoOcorrencia = tipoOcorrencia;
	}

	public String getStatusOcor() {
		return statusOcor;
	}

	public void setStatusOcor(String statusOcor) {
		this.statusOcor = statusOcor;
	}
	
	
	
	

	}
	
	
