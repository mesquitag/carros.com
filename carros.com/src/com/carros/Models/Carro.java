package com.carros.Models;

import java.util.List;

import org.apache.commons.fileupload.FileItem;

public class Carro {
	
	protected String marca;
	protected String modelo;
	protected String placa;
	protected String ano;
	protected List<FileItem> image;
	
	
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

	public List<FileItem> getImage() {
		return image;
	}


	public void setImage(List<FileItem> multiparts) {
		this.image = multiparts;
	}
	
	
	
	
}
