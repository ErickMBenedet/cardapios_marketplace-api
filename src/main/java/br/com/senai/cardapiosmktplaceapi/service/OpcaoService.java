package br.com.senai.cardapiosmktplaceapi.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

import br.com.senai.cardapiosmktplaceapi.entity.Categoria;
import br.com.senai.cardapiosmktplaceapi.entity.Opcao;
import br.com.senai.cardapiosmktplaceapi.entity.Restaurante;
import br.com.senai.cardapiosmktplaceapi.entity.enums.Status;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Validated
public interface OpcaoService {

	public void salvar(
			@NotNull(message = "A opção é obrigatória")
			Opcao opcao);
	
	public void atualizarStatusOpcao(
			@NotNull(message = "O id é obrigatório")
			@Positive(message = "O id deve ser positivo")
			Integer id,
			@NotNull(message = "O status é obrigatório")
			Status status);
	
	public Page<Opcao> listarPor(
			@NotNull(message = "O nome é obrigatório")
			@Size(min = 3, message = "O nome deve conter no mínimno 3 caracteres")
			String nome,
			Categoria categoria, 
			Restaurante restaurante, 
			Pageable paginacao);
	
	public void buscarPor(
			@NotNull(message = "O id da busca é obrigatório")
			@Positive(message = "O id da busca deve ser positivo")
			Integer id);
	
	public void excluirPor(
			@NotNull(message = "O id da exclusão é obrigatório")
			@Positive(message = "O id da exclusão deve ser positivo")
			Integer id);
}
