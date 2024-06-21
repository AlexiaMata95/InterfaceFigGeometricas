package org.generation;

import org.generation.classes.Cuadrado;
import org.generation.classes.Rectangulo;
import org.generation.classes.Rombo;
import org.generation.classes.Romboide;
import org.generation.classes.Trapecio;
import org.generation.classes.Triangulo;
import org.generation.interfaces.FiguraGeometrica;

public class Main {

	public static void main(String[] args) {
		Triangulo bermudas = new Triangulo("Bermudas", 20, 10, 15);
		Triangulo t = new Triangulo("Triangulo T", 13, 21, 2);
		Cuadrado c = new Cuadrado("Cuadrado c", 10);
		Rectangulo r = new Rectangulo("Rectangulo r", 2, 3);
		Rombo r2 = new Rombo("Rombo", 10, 5, 3);
		Romboide r3 = new Romboide("Romboide", 3, 4);
		Trapecio t2 = new Trapecio("Trapecio t", 3, 6, 4, 2.5);
		imprimirCalculo(bermudas);
		imprimirCalculo(t);
		imprimirCalculo(c);
		imprimirCalculo(r);
		imprimirCalculo(r2);
		imprimirCalculo(r3);
		imprimirCalculo(t2);
	}
	
	public static void imprimirCalculo(FiguraGeometrica fig) {
		System.out.println(fig.toString());
		System.out.println("=====================");
		System.out.println("El area de [" + fig.getNombre()
				+ "] es :" + fig.calculateArea());
		System.out.println("El perimetro de [" + fig.getNombre()
				+ "] es :" + fig.calculatePerimeter());
		System.out.println("=====================");
	}

}
