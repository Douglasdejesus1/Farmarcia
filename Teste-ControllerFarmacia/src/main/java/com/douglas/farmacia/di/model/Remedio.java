package com.douglas.farmacia.di.model;

import java.math.BigDecimal;

public class Remedio {
	
	private String principioAtivo;
	private String fabricante;
	private BigDecimal Total;
	public Remedio(String principioAtivo, String fabricante, BigDecimal total) {
		super();
		this.principioAtivo = principioAtivo;
		this.fabricante = fabricante;
		Total = total;
	}
	public String getPrincipioAtivo() {
		return principioAtivo;
	}
	public void setPrincipioAtivo(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public BigDecimal getTotal() {
		return Total;
	}
	public void setTotal(BigDecimal total) {
		Total = total;
	}
	
	
	

}
