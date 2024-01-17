package com.generation.gamestore.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(max = 100, message = "O nome deve ter no máximo 100 caracteres")
	@NotBlank(message = "Atributo nome é obrigatorio")
	private String nome;
	
	@Size(max = 100, message = "O desenvolvedora deve ter no máximo 100 caracteres")
	@NotBlank(message = "Atributo desenvolvedora é obrigatorio")
	private String desenvolvedora;
	
	@Size(max = 100, message = "A distribuidora deve ter no máximo 100 caracteres")
	@NotBlank(message = "Atributo distribuidora é obrigatorio")
	private String distribuidora;

	@NotNull(message = "Atributo preço é obrigatorio")
	private Double preco;
	
	@NotNull(message = "Atributo dataLancamento é obrigatorio")
	private String dataLancamento;
	
	@NotNull(message = "Atributo classificacaoEtaria é obrigatorio")
	private Integer classificacaoEtaria;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesenvolvedora() {
		return desenvolvedora;
	}

	public void setDesenvolvedora(String desenvolvedora) {
		this.desenvolvedora = desenvolvedora;
	}

	public String getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Integer getClassificacaoEtaria() {
		return classificacaoEtaria;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void setClassificacaoEtaria(Integer classificacaoEtaria) {
		this.classificacaoEtaria = classificacaoEtaria;
	}
	
}
