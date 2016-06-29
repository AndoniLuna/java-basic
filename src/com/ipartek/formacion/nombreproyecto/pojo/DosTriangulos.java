package com.ipartek.formacion.nombreproyecto.pojo;


/**
 * Al ser una clase <b>final</b>, no puede tener hijos
 *
 */
public final class DosTriangulos extends Triangulo {

	private String tipo;

	@Override
	public String dibujar() {
		return "Dibujamos Triangulo de tipo " + this.tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;

	}
}
