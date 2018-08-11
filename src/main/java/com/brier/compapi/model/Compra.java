package com.brier.compapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Compra {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@Column(name = "data")
	private String data;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idProcessador", nullable = false)
	private Processador processador;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idPlacaDeVideo", nullable = false)
	private PlacaDeVideo placaDeVideo;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idPlacaMae", nullable = false)
	private PlacaMae placaMae;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idMemoriaRam", nullable = false)
	private Memoria memoria;
	
	@Column(name = "qtd_memoria_ram")
	private int qtdMemoriaRam;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idGabinete", nullable = false)
	private Gabinete gabinete;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idFonte", nullable = false)
	private Fonte fonte;
	
	@Column(name = "forma_pagamento")
	private Double formaPagamento;

	@Column(name = "preco_total")
	private Double precoTotal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Processador getProcessador() {
		return processador;
	}

	public void setProcessador(Processador processador) {
		this.processador = processador;
	}

	public PlacaDeVideo getPlacaDeVideo() {
		return placaDeVideo;
	}

	public void setPlacaDeVideo(PlacaDeVideo placaDeVideo) {
		this.placaDeVideo = placaDeVideo;
	}

	public PlacaMae getPlacaMae() {
		return placaMae;
	}

	public void setPlacaMae(PlacaMae placaMae) {
		this.placaMae = placaMae;
	}

	public Double getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(Double formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(Double precoTotal) {
		this.precoTotal = precoTotal;
	}
	
}
