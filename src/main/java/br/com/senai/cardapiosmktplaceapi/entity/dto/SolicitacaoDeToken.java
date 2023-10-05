package br.com.senai.cardapiosmktplaceapi.entity.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SolicitacaoDeToken {

	@NotBlank(message = "O Login é obrigatório")
	private String login;
	
	@NotBlank(message = "A senha é obrigatória")
	private String senha;

}
