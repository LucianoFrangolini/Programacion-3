package main;

import modelo.Biblioteca;
import modelo.Libro;
import modelo.Revista;
import modelo.Socio;
import modelo.SocioLibro;
import modelo.SocioRevista;

public class Main {
	
	public static void main(String[] args) {
		
		//Se podría solucionar el problema de sincronización de bloques teniendo una coleccion (arraylist por ejemplo)
		//con todas las revistas y una con todos los libros que ingresan. Y sincronizar solo los metodos que retiran objetos hMap.
		
		Biblioteca biblioteca = Biblioteca.getInstance();
		
		Socio s1 = new SocioLibro("Socio L 1",biblioteca);
		Socio s2 = new SocioLibro("Socio L 2",biblioteca);
		Socio s3 = new SocioLibro("Socio L 3",biblioteca);
		Socio s4 = new SocioLibro("Socio L 4",biblioteca);
		Socio s5 = new SocioLibro("Socio L 5",biblioteca);
		Socio s6 = new SocioRevista("Socio R 1",biblioteca);
		Socio s7 = new SocioRevista("Socio R 2",biblioteca);
		Socio s8 = new SocioRevista("Socio R 3",biblioteca);
		Socio s9 = new SocioRevista("Socio R 4",biblioteca);
		Socio s10 = new SocioRevista("Socio R 5",biblioteca);
		
		Libro l1 = new Libro("Libro 0",0);
		Libro l2 = new Libro("Libro 1",1);
		Libro l3 = new Libro("Libro 2",2);
		Libro l4 = new Libro("Libro 3",3);
		Libro l5 = new Libro("Libro 4",4);
		Revista r1 = new Revista("REV 0",110);
		Revista r2 = new Revista("REV 1",111);
		Revista r3 = new Revista("REV 2",112);
		Revista r4 = new Revista("REV 3",113);
		Revista r5 = new Revista("REV 4",114);
		
		
		biblioteca.agregarLibro(l1);
		biblioteca.agregarLibro(l2);
		biblioteca.agregarLibro(l3);
		biblioteca.agregarLibro(l4);
		biblioteca.agregarLibro(l5);
		biblioteca.agregarRevista(r1);
		biblioteca.agregarRevista(r2);
		biblioteca.agregarRevista(r3);
		biblioteca.agregarRevista(r4);
		biblioteca.agregarRevista(r5);
		
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
