package org.generation.classes;
import org.generation.interfaces.FiguraGeometrica;

public class Rombo implements FiguraGeometrica {
	private String nombre;
	private double lado;
	private double diagonalMenor;
	private double diagonalMayor;
	
	public Rombo(String nombre, double diagonalMayor, double diagonalMenor, double lado) {
		super();
		this.nombre = nombre;
		this.diagonalMenor = diagonalMenor;
		this.diagonalMayor = diagonalMayor;
		this.lado = lado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getDiagonalMenor() {
		return diagonalMenor;
	}
	public void setDiagonalMenor(double diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}
	
	public double getDiagonalMayor() {
		return diagonalMayor;
	}
	public void setDiagonalMayor(double diagonalMayor) {
		this.diagonalMayor = diagonalMayor;
	}	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", lado=" + lado + ", diagonalMenor=" + diagonalMenor + ", diagonalMayor="
				+ diagonalMayor + "]";
	}
	public double calculateArea() {
		return (diagonalMayor*diagonalMenor)/2;
	}
	
	public double calculatePerimeter() {
		return (4*lado);
	}
}
