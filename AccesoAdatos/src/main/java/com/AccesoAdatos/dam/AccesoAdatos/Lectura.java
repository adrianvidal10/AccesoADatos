package com.AccesoAdatos.dam.AccesoAdatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Lectura {
	File archivo = null;
	FileReader fr = null;
	BufferedReader br = null;
	Biblioteca biblioteca = new Biblioteca();
	String linea;
	int cont;

	public void cargarFicheroXml() throws IOException {
		archivo = new File("Ficheros\\libros.xml");
		fr = new FileReader(archivo);
		br = new BufferedReader(fr);
		linea = null;
		cont = 0;
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
					Libro l2 = new Libro();
					l2.setTitulo(eElement.getElementsByTagName("titulo").item(0).getTextContent());
					l2.setAutor(eElement.getElementsByTagName("autor").item(0).getTextContent());
					l2.setFechapubli(eElement.getElementsByTagName("fecha").item(0).getTextContent());
					l2.setGenero(eElement.getElementsByTagName("genero").item(0).getTextContent());
					l2.setEdicion(Integer.parseInt(eElement.getElementsByTagName("edicion").item(0).getTextContent()));
					l2.setEditorial(eElement.getElementsByTagName("editorial").item(0).getTextContent());
					l2.setNcopias(Integer.parseInt(eElement.getElementsByTagName("ncopias").item(0).getTextContent()));
					biblioteca.getArraylibros().add(cont, l2);
					cont++;
				}
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

	public void cargarFicheroCsv() {
		String[] palabras;
		linea = null;
		cont = 0;
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

	public void cargarFicheroTxt() {
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

}
