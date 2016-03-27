package com.atrium.modelo;


/**
 * DTO para la informacion de la calculadora.
 * 
 * @author Abert Arranz.
 * @version 2.0.
 * @since 18-3-2016.
 */
public class Modelo {
	// PROPIEDADES DE CLASE
	private double ope1;
	private double ope2;
	private double resultado;
	private String simbolos;
	// ACCESORES PARA LAS PROPIEDADES
	public double getOpe1() {
		return ope1;
	}

	public void setOpe1(double ope1) {
		this.ope1 = ope1;
	}

	public double getOpe2() {
		return ope2;
	}

	public String getSimbolos() {
		return simbolos;
	}

	public void setSimbolos(String simbolos) {
		this.simbolos = simbolos;
	}

	public void setOpe2(double ope2) {
		this.ope2 = ope2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	 
	 
	 
	
	public double  matematicas(String simbol, double ope1, double ope2){
		
		switch (simbol){
		case "+": 
			resultado= ope1 + ope2;
			break;
		case "-": 
			resultado= ope1-ope2;
			break;
		case "*": 
			resultado= ope1*ope2;break;
		case "/": 
		     if (ope2==0)
		    	 {resultado=0;}
		     else
		    	 resultado= ope1/ope2;
		     break;
		}
		return resultado;}
	

}
