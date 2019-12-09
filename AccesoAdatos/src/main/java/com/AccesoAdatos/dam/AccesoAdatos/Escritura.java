package com.AccesoAdatos.dam.AccesoAdatos;

import java.util.Scanner;

public class Escritura {
	Biblioteca biblioteca = new Biblioteca();
	Scanner sc = new Scanner(System.in);
	Libro libro = new Libro();

	public void mostrarLibros() {

		for (int i = 0; i < biblioteca.getArraylibros().size(); i++) {
			System.out.println(biblioteca.getArraylibros().get(i).getTitulo());
			System.out.println(biblioteca.getArraylibros().get(i).getAutor());
			System.out.println(biblioteca.getArraylibros().get(i).getFechapubli());
			System.out.println(biblioteca.getArraylibros().get(i).getGenero());
			System.out.println(biblioteca.getArraylibros().get(i).getEdicion());
			System.out.println(biblioteca.getArraylibros().get(i).getEditorial());
			System.out.println(biblioteca.getArraylibros().get(i).getNcopias());
			System.out.println();
		}

	}

	public void introducirLibro() {
		System.out.println("Introduzca los siguientes datos sobre el libro:");
		System.out.print("Titulo: ");
		libro.setTitulo(sc.nextLine());
		System.out.print("Autor: ");
		libro.setAutor(sc.nextLine());
		System.out.print("Genero: ");
		libro.setGenero(sc.nextLine());
		System.out.print("Fecha de publicacion: ");
		libro.setFechapubli(sc.nextLine());
		System.out.print("Editorial: ");
		libro.setEditorial(sc.nextLine());
		System.out.print("Edicion: ");
		libro.setEdicion(sc.nextInt());
		sc.nextLine();
		System.out.print("Numero de copias: ");
		libro.setNcopias(sc.nextInt());
		sc.nextLine();
		biblioteca.getArraylibros().add(libro);
	}

	public void generarFicheros() {
		// TODO Auto-generated method stub

	}
}
