package com.itb.comercio.model;

public class Produto {
	private Long id;
	private String name;
	private String descreption;
	private String codeBar;
	private double preco;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescreption() {
		return descreption;
	}
	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}
	public String getCodeBar() {
		return codeBar;
	}
	public void setCodeBar(String codeBar) {
		this.codeBar = codeBar;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
