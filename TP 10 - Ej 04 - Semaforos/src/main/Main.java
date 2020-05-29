package main;

import modelo.Biblioteca;
import modelo.Libro;
import modelo.Socio;

public class Main {
	
	public static void main(String[] args) {
		Biblioteca biblioteca = Biblioteca.getInstance();
		
		Socio s1 = new Socio("Socio 1",biblioteca);
		Socio s2 = new Socio("Socio 2",biblioteca);
		Socio s3 = new Socio("Socio 3",biblioteca);
		Socio s4 = new Socio("Socio 4",biblioteca);
		Socio s5 = new Socio("Socio 5",biblioteca);
		Socio s6 = new Socio("Socio 6",biblioteca);
		Socio s7 = new Socio("Socio 7",biblioteca);
		Socio s8 = new Socio("Socio 8",biblioteca);
		Socio s9 = new Socio("Socio 9",biblioteca);
		Socio s10 = new Socio("Socio 10",biblioteca);
		
		Libro l1 = new Libro("Libro 0",0);
		Libro l2 = new Libro("Libro 1",1);
		Libro l3 = new Libro("Libro 2",2);
		Libro l4 = new Libro("Libro 3",3);
		Libro l5 = new Libro("Libro 4",4);
		
		biblioteca.agregarLibro(l1);
		biblioteca.agregarLibro(l2);
		biblioteca.agregarLibro(l3);
		biblioteca.agregarLibro(l4);
		biblioteca.agregarLibro(l5);
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
		s6.start();
		s7.start();
		s8.start();
		s9.start();
		s10.start();
	}
}
