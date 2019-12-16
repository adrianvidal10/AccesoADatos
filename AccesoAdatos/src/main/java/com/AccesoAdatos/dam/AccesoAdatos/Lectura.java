package com.AccesoAdatos.dam.AccesoAdatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/*import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;*/

public class Lectura {
	File archivo = null;
	FileReader fr = null;
	BufferedReader br = null;
	String linea;
	int cont;

	public void cargarFicheroDoc(Biblioteca biblioteca) throws IOException {
		String[] palabras;
		linea = null;
		cont = 0;
		try {
			archivo = new File("Ficheros\\libros.doc");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			linea = br.readLine();
			while (linea != null) {
				palabras = linea.split("/");
				Libro l1 = new Libro();
				l1.setTitulo(palabras[0]);
				l1.setAutor(palabras[1]);
				l1.setFechapubli(palabras[2]);
				l1.setGenero(palabras[3]);
				l1.setEdicion(Integer.parseInt(palabras[4]));
				l1.setEditorial(palabras[5]);
				l1.setNcopias(Integer.parseInt(palabras[6]));
				biblioteca.getArraylibros().add(cont, l1);
				cont++;
				linea = br.readLine();

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

	public void cargarFicheroCsv(Biblioteca biblioteca) {
		String[] palabras;
		linea = null;
		cont = 0;
		ArrayList<Libro> LibrosBiblio = biblioteca.getArraylibros();
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
				LibrosBiblio.add(cont, l1);

				cont++;
				linea = br.readLine();

			}
			biblioteca.setArraylibros(LibrosBiblio);

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

	public void cargarFicheroTxt(Biblioteca biblioteca) {
		String[] palabras;
		linea = null;
		cont = 0;

		try {
			archivo = new File("Ficheros\\libros.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			linea = br.readLine();
			while (linea != null) {
				palabras = linea.split("/");
				Libro l1 = new Libro();
				l1.setTitulo(palabras[0]);
				l1.setAutor(palabras[1]);
				l1.setFechapubli(palabras[2]);
				l1.setGenero(palabras[3]);
				l1.setEdicion(Integer.parseInt(palabras[4]));
				l1.setEditorial(palabras[5]);
				l1.setNcopias(Integer.parseInt(palabras[6]));
				biblioteca.getArraylibros().add(cont, l1);
				cont++;
				linea = br.readLine();

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

	public void Leer() {

	}

}
