package com.ipartek.formacion.nombreproyecto.pojo;

public class Triangulo extends ObjetoGrafico {

	public static int LONG_LADO = 1;
	
	private int longitudLado;
	
	
	public Triangulo() {
		super();
		longitudLado = LONG_LADO;
	}




	public int getLongitudLado() {
		return longitudLado;
	}




	public void setLongitudLado(int longitudLado) {
		this.longitudLado = longitudLado;
	}


	@Override
	public String dibujar() {
		return "dibujamos un tri�ngulo con longitud de lado " + this.longitudLado;

	}

}