package br.com.senai.cardapiosmktplaceapi.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.senai.cardapiosmktplaceapi.entity.Categoria;
import br.com.senai.cardapiosmktplaceapi.entity.Opcao;
import br.com.senai.cardapiosmktplaceapi.entity.Restaurante;
import br.com.senai.cardapiosmktplaceapi.entity.enums.Status;
import br.com.senai.cardapiosmktplaceapi.service.OpcaoService;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class OpcaoServiceImpl implements OpcaoService {

	@Override
	public void salvar(Opcao opcao) {

	}

	@Override
	public void atualizarStatusOpcao(Integer id, Status status) {

	}

	@Override
	public Page<Opcao> listarPor(String nome, Categoria categoria, Restaurante restaurante, Pageable paginacao) {
		
		return null;
	}

	@Override
	public void buscarPor(Integer id) {

	}

	@Override
	public void excluirPor(Integer id) {

	}

}
