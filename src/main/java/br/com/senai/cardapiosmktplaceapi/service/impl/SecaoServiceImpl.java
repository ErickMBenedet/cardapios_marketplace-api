package br.com.senai.cardapiosmktplaceapi.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.senai.cardapiosmktplaceapi.entity.Secao;
import br.com.senai.cardapiosmktplaceapi.entity.enums.Status;
import br.com.senai.cardapiosmktplaceapi.service.SecaoService;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class SecaoServiceImpl implements SecaoService {

	@Override
	public void salvar(Secao secao) {

	}

	@Override
	public void ataulizarStatusSecao(Integer id, Status status) {

	}

	@Override
	public Page<Secao> listarPor(String nome, Pageable paginacao) {
		
		return null;
	}

	@Override
	public Secao buscarPor(Integer id) {

		return null;
	}

	@Override
	public Secao excluirPor(Integer id) {

		return null;
	}

}
