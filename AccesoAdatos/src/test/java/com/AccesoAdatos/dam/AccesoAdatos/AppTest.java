package com.AccesoAdatos.dam.AccesoAdatos;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Test;

public class AppTest{
	private Lectura lectura = new Lectura();
	private Biblioteca biblioteca = new Biblioteca();
	
	@Test
	public void textDoc() throws IOException{
		String data = "1 \n 2 2";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		lectura.cargarFicheroDoc(biblioteca);
		System.out.println("FicheroDoc cargado con exito");
	}
	
	@Test
	public void textTxt() throws IOException{
		String data = "1 \n 2 2";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		lectura.cargarFicheroTxt(biblioteca);
		System.out.println("FicheroTxt cargado con exito");
	}
	
	@Test
	public void textCsv() throws IOException{
		String data = "1 \n 2 2";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner scanner = new Scanner(System.in);
		lectura.cargarFicheroCsv(biblioteca);
		System.out.println("FicheroCsv cargado con exito");
	}	
}