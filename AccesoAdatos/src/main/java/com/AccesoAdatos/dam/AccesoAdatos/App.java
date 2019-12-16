package com.AccesoAdatos.dam.AccesoAdatos;

import java.io.*;
import java.util.Scanner;

public class App {
	static Libro libro = new Libro();

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		Biblioteca biblioteca = new Biblioteca();
		Lectura lectura = new Lectura();
		Escritura escritura = new Escritura();
		int opcion;
		lectura.cargarFicheroCsv(biblioteca);
		lectura.cargarFicheroTxt(biblioteca);
		lectura.cargarFicheroDoc(biblioteca);
		try {
			do {
				System.out.println("BIENVENIDO A LA BIBLIOTECA DE BIDEBARRIETA:");
				System.out.println("1.Introducir un libro ");
				System.out.println("2.Mostrar libros");
				System.out.println("3.Generar ficheros");
				System.out.println("4.Salir");
				opcion = sc.nextInt();
				switch (opcion) {
				case 1:
					escritura.introducirLibro(biblioteca);
					break;

				case 2:
					escritura.mostrarLibros(biblioteca);
					break;

				case 3:
					escritura.generarFicheros(biblioteca);
					break;
				}

			} while (opcion != 4);
			sc.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
