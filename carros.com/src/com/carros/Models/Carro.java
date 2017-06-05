package com.carros.Models;

public class Carro {
	
	protected String marca;
	protected String modelo;
	protected String placa;
	protected String ano;
	protected Byte image;
	
	
	public Carro(){}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}


	public Byte getImage() {
		return image;
	}


	public void setImage(Byte image) {
		this.image = image;
	}
	
	
	
	
}
