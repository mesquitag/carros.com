package com.carros.Models;

import java.util.Date;

public class Reserva {

	protected int id; 
	protected Date dataReserva;
	protected Date dataPrevistaInicio;
	protected Date dataPrevistaTermino;
	
	public Reserva(Date dataReserva , Object Carro, Object Cliente){}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDataReserva() {
		return dataReserva;
	}
	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}
	public Date getDataPrevistaInicio() {
		return dataPrevistaInicio;
	}
	public void setDataPrevistaInicio(Date dataPrevistaInicio) {
		this.dataPrevistaInicio = dataPrevistaInicio;
	}
	public Date getDataPrevistaTermino() {
		return dataPrevistaTermino;
	}
	public void setDataPrevistaTermino(Date dataPrevistaTermino) {
		this.dataPrevistaTermino = dataPrevistaTermino;
	}
}
