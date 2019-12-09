package com.AccesoAdatos.dam.AccesoAdatos;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class App {
	static Libro libro = new Libro();
	static ArrayList<Libro> arraylibros = new ArrayList<Libro>();
	static Scanner sc = new Scanner(System.in);
	static File archivo = null;
	static FileReader fr = null;
	static BufferedReader br = null;

	public static void main(String[] args) throws IOException {

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

	private static void cargarFicheroXml() throws IOException {
		archivo = new File("Ficheros\\libros.xml");
		fr = new FileReader(archivo);
		br = new BufferedReader(fr);
		String linea;
		int cont = 0;
		linea = br.readLine();

		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(archivo);
			NodeList nList = doc.getElementsByTagName("libro");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					libro.setTitulo(eElement.getElementsByTagName("titulo").item(0).getTextContent());
					libro.setAutor(eElement.getElementsByTagName("autor").item(0).getTextContent());
					libro.setFechapubli(eElement.getElementsByTagName("fecha").item(0).getTextContent());
					libro.setGenero(eElement.getElementsByTagName("genero").item(0).getTextContent());
					libro.setEdicion(
							Integer.parseInt(eElement.getElementsByTagName("edicion").item(0).getTextContent()));
					libro.setEditorial(eElement.getElementsByTagName("editoral").item(0).getTextContent());
					libro.setNcopias(
							Integer.parseInt(eElement.getElementsByTagName("ncopias").item(0).getTextContent()));
					arraylibros.add(cont, libro);
					cont++;
				}
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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	private static void generarFicheros() {
		// TODO Auto-generated method stub

	}

	private static void cargarFicheroTxt() {
		
	}

	private static void mostrarLibros() {
		// TODO Auto-generated method stub

	}

	private static void cargarFicheroCsv() {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		String[] palabras;
		String linea = null;
		int cont = 0;
		try {
			archivo = new File("Ficheros\\libros.csv");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			linea = br.readLine();
			while (linea != null) {
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
				cont++;
				linea = br.readLine();

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

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
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
}
