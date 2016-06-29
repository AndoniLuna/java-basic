package com.ipartek.formacion.nombreproyecto.pojo;

public class VehiculoDiesel extends Vehiculo {
	/**
	 * Litros minimos del (int){@code deposito}
	 */
	public final static int DEPOSITO_MINIMO=50;
	/**
	 * Capacidad en litros del combustible
	 */
	private int deposito;
	/**
	 * Lo mismo que el Padre, pero con deposito = DEPOSITO_MINIMO litros
	 */
	public VehiculoDiesel(){
		super();
		this.deposito=DEPOSITO_MINIMO;
	}
	public VehiculoDiesel(String nombre){
		super(nombre);
		this.deposito=DEPOSITO_MINIMO;
	}

	public float getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}
	public static void main(String[] args) {
		
	}
}
