package com.AccesoAdatos.dam.AccesoAdatos;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		String titulo, autor, genero, fechaPubli, editorial;
		int edicion, ncopias;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los siguientes datos sobre el libro:");
		System.out.print("Titulo: ");
		titulo = sc.nextLine();
		System.out.print("Autor: ");
		autor = sc.nextLine();
		System.out.print("Genero: ");
		genero = sc.nextLine();
		System.out.print("Fecha de publicacion: "); 
		fechaPubli = sc.nextLine();
		System.out.print("Editorial: ");
		editorial = sc.nextLine();
		System.out.print("Edicion: ");
		edicion = sc.nextInt();
		sc.nextLine();
		System.out.print("Numero de copias: ");
		ncopias = sc.nextInt();
		sc.nextLine();
		sc.close();
		
	}
}
