package model.entities;

import model.enums.Cores;

public class Retangulo extends FormasAbstradas {

	private Double largura;
	private Double altura;

	public Retangulo(Cores cores, Double largura, Double altura) {
		super(cores);
		this.largura = largura;
		this.altura = altura;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return largura * altura;
	}
}