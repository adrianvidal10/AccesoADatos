package com.AccesoAdatos.dam.AccesoAdatos;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Test;

public class Sprint2{
	private Escritura escritura = new Escritura();
	private Biblioteca biblioteca = new Biblioteca();
	
	@Test
	public void textIntroducirLibro() throws IOException{
		String data = "Kong King \n Macaco \n 12-12-1930 \n coca-ina \n 6 \n Santillano \n 500 ";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		escritura.introducirLibro(biblioteca);
		scanner.close();
	}
	
	@Test
	public void textMostrarLibros() throws IOException{
		String data = "1 \n 2 2";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		escritura.mostrarLibros(biblioteca);
		scanner.close();
	}
	
	@Test
	public void textFicheroCsv() throws IOException{
		String data = "1 \n 2 2";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		escritura.generarFicheroCsv(biblioteca);
		System.out.println("FicheroCsv generado con exito");
		scanner.close();
	}	
	
	@Test
	public void textFicheroTxt() throws IOException{
		String data = "1 \n 2 2";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		escritura.generarFicheroTxt(biblioteca);
		System.out.println("FicheroTxt generado con exito");
		scanner.close();
	}
	
	@Test
	public void textFicheroDoc() throws IOException{
		String data = "1 \n 2 2";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		escritura.generarFicheroDoc(biblioteca);
		System.out.println("FicheroDoc generado con exito");
		scanner.close();
	}
}
