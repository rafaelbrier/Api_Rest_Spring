package com.brier.compapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.Type;

@Entity
public class PlacaMae {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "preco")
	private Double preco;
	
	@Column(name = "socketProc", length = 20)
	private String socketProc;
	
	@Column(name = "socketMem", length = 20)
	private String socketMem;
	
	@Column(name = "image")
	@Lob
    @Type(type = "org.hibernate.type.TextType")
	private String image;
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getSocketProc() {
		return socketProc;
	}

	public void setSocketProc(String socketProc) {
		this.socketProc = socketProc;
	}

	public String getSocketMem() {
		return socketMem;
	}

	public void setSocketMem(String socketMem) {
		this.socketMem = socketMem;
	}	

}
