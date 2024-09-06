package br.itb.projeto.ongiasp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.itb.projeto.ongiasp.model.entity.Usuario;
import br.itb.projeto.ongiasp.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

	private UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}

	public List<Usuario> findAll() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		return usuarios;
	}

	public Usuario findById(long id) {

		Usuario usuario = usuarioRepository.findById(id).orElseThrow();

		return usuario;
	}
	
	public Usuario findByEmail(String email) {

		Usuario usuario = usuarioRepository.findByEmail(email);
	return usuario;
	
   
	}
}
