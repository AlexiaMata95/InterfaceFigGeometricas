package org.generation.classes;
import org.generation.interfaces.FiguraGeometrica;

public class Cuadrado implements FiguraGeometrica{
		private String nombre;
		private double lado;
		
		public Cuadrado(String nombre, double lado) {
			super();
			this.nombre = nombre;
			this.lado = lado;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public double getLado() {
			return lado;
		}
		public void setLado(double lado) {
			this.lado = lado;
		}
		@Override
		public String toString() {
			return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
		}
		
		public double calculateArea() {
			return (Math.pow(lado, 2));
		}
		
		public double calculatePerimeter() {
			return (4*lado);
		}

}
