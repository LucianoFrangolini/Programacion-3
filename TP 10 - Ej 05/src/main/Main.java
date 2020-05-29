package main;

import modelo.Biblioteca;
import modelo.Donador;
import modelo.Libro;
import modelo.Socio;

public class Main {
	
	public static void main(String[] args) {
		
		//El programa queda tildado a propósito, ya que el donador ya donó sus 9 libros y la biblioteca tenia 5
		//Por lo tanto los socios que quieran devolver su libro cuando la biblioteca está llena no van a poder y quedarán dormidos.
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
		Socio s11 = new Socio("Socio 11",biblioteca);
		Socio s12 = new Socio("Socio 12",biblioteca);
		Socio s13 = new Socio("Socio 13",biblioteca);
		Socio s14 = new Socio("Socio 14",biblioteca);
		Socio s15 = new Socio("Socio 15",biblioteca);
		Socio s16 = new Socio("Socio 16",biblioteca);
		Socio s17 = new Socio("Socio 17",biblioteca);
		Socio s18 = new Socio("Socio 18",biblioteca);
		Socio s19 = new Socio("Socio 19",biblioteca);
		Socio s20 = new Socio("Socio 20",biblioteca);
		
		Donador donor = new Donador("Donador",biblioteca);
		
		Libro l1 = new Libro("Libro 0",0);
		Libro l2 = new Libro("Libro 1",1);
		Libro l3 = new Libro("Libro 2",2);
		Libro l4 = new Libro("Libro 3",3);
		Libro l5 = new Libro("Libro 4",4);
		Libro l6 = new Libro("Libro 5",4);
		Libro l7 = new Libro("Libro 6",4);
		Libro l8 = new Libro("Libro 7",4);
		Libro l9 = new Libro("Libro 8",4);
		Libro l10 = new Libro("Libro 9",4);
		Libro l11 = new Libro("Libro 10",4);
		Libro l12 = new Libro("Libro 11",4);
		Libro l13 = new Libro("Libro 12",4);
		Libro l14 = new Libro("Libro 13",4);
		
		donor.agregarLibroADonar(l6);
		donor.agregarLibroADonar(l7);
		donor.agregarLibroADonar(l8);
		donor.agregarLibroADonar(l9);
		donor.agregarLibroADonar(l10);
		donor.agregarLibroADonar(l11);
		donor.agregarLibroADonar(l12);
		donor.agregarLibroADonar(l13);
		donor.agregarLibroADonar(l14);
		
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
		donor.start();
		s7.start();
		s8.start();
		s9.start();
		s10.start();
	}
}
