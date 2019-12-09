package com.AccesoAdatos.dam.AccesoAdatos;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	static Libro libro = new Libro();
	static ArrayList<Libro> arraylibros = new ArrayList<Libro>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int opcion;
		cargarFicheroCsv();
		cargarFicheroTxt();
		cargarFicheroXml();
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
					introducirLibro();
					break;

				case 2:
					mostrarLibros();
					break;
					
				case 3:
					generarFicheros();
					break;
				}

			} while (opcion != 4);
			sc.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void cargarFicheroXml() {
		// TODO Auto-generated method stub
		
	}

	private static void cargarFicheroTxt() {
		// TODO Auto-generated method stub
		
	}

	private static void generarFicheros() {
		// TODO Auto-generated method stub
		
	}

	private static void mostrarLibros() {
		// TODO Auto-generated method stub
		
	}

	private static void introducirLibro() {
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
		arraylibros.add(libro);
	}

	private static void cargarFicheroCsv() {
		      File archivo = null;
		      FileReader fr = null;
		      BufferedReader br = null;
		      String[] palabras;
		      String linea = null;
		      int cont = 0;
		      try {
		         archivo = new File ("Ficheros\\libros.csv");
		         fr = new FileReader (archivo);
		         br = new BufferedReader(fr);
		         linea = br.readLine();
		         while(linea !=null){
		        	 palabras = linea.split(",");
		        	 Libro l1 = new Libro();
		        	 l1.setTitulo(palabras[0]);
		        	 l1.setAutor(palabras[1]);
		        	 l1.setFechapubli(palabras[2]);
		        	 l1.setGenero(palabras[3]);
		        	 l1.setEdicion(Integer.parseInt(palabras[4]));
		        	 l1.setEditorial(palabras[5]);
		        	 l1.setNcopias(Integer.parseInt(palabras[6]));
		        	 arraylibros.add(cont, l1);
		        	 cont ++;
		        	 linea= br.readLine();
		        	 
		         }
		        	 for (int i = 0; i < arraylibros.size(); i++) {
						System.out.println(arraylibros.get(i).getTitulo());
						System.out.println(arraylibros.get(i).getAutor());
						System.out.println(arraylibros.get(i).getFechapubli());
						System.out.println(arraylibros.get(i).getGenero());
						System.out.println(arraylibros.get(i).getEdicion());
						System.out.println(arraylibros.get(i).getEditorial());
						System.out.println(arraylibros.get(i).getNcopias());
						System.out.println();
					}
		        	 
		      }
		      catch(Exception e){
		         e.printStackTrace();
		      }finally{
		    
		         try{                    
		            if( null != fr ){   
		               fr.close();     
		            }                  
		         }catch (Exception e2){ 
		            e2.printStackTrace();
		         }
		      }
		   }
		
		
	}

