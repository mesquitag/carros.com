package com.carros.Models;

import java.util.ArrayList;
import java.util.List;

public class Telefone {
	
	protected int id;
	protected List<Telefone>celular = new ArrayList<Telefone>();
	protected List<Telefone>fixo = new ArrayList<Telefone>();
	protected List<Telefone>recado = new ArrayList<Telefone>();
	
	
	public  Telefone(){}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public List<Telefone> getCelular() {
		return celular;
	}


	public void setCelular(List<Telefone> celular) {
		this.celular = celular;
	}


	public List<Telefone> getFixo() {
		return fixo;
	}


	public void setFixo(List<Telefone> fixo) {
		this.fixo = fixo;
	}


	public List<Telefone> getRecado() {
		return recado;
	}


	public void setRecado(List<Telefone> recado) {
		this.recado = recado;
	}
	
	
}
