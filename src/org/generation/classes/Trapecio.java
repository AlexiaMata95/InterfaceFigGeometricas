package org.generation.classes;

import org.generation.interfaces.FiguraGeometrica;

public class Trapecio implements FiguraGeometrica{
	private String nombre;
	private double lado1;
	private double baseMenor;
	private double baseMayor;
	private double altura;
	
	public Trapecio(String nombre, double lado1, double baseMenor, double baseMayor, double altura) {
		super();
		this.nombre = nombre;
		this.lado1 = lado1;
		this.baseMenor = baseMenor;
		this.baseMayor = baseMayor;
		this.altura = altura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	
	public double getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	public double getBaseMayor() {
		return baseMayor;
	}
	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Trapecio [nombre=" + nombre + ", lado1=" + lado1 + ", baseMenor=" + baseMenor + ", baseMayor="
				+ baseMayor + ", altura=" + altura + "]";
	}
	
	public double calculateArea() {
		return (altura * ( baseMayor + baseMenor)) / 2;
	}
	
	public double calculatePerimeter() {
		return ((lado1*2) + baseMenor + baseMayor);
	}
	
	
}
