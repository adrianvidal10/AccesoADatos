package com.AccesoAdatos.dam.AccesoAdatos;



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/*import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import java.io.File;
*/

public class Escritura {
	Scanner sc = new Scanner(System.in);
	Libro libro = new Libro();

	public void mostrarLibros(Biblioteca biblioteca) {
		ArrayList<Libro> arraylibros = biblioteca.getArraylibros();
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

	public void introducirLibro(Biblioteca biblioteca) {
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

	public void generarFicheros(Biblioteca biblioteca) throws IOException {

		//generarFicheroXml(biblioteca);
		generarFicheroCsv(biblioteca);
		generarFicheroTxt(biblioteca);
		generarFicheroDoc(biblioteca);

	}

	public void generarFicheroDoc(Biblioteca biblioteca) throws IOException {
		FileWriter fichero = new FileWriter("Ficheros\\libros.doc");
		PrintWriter pw;
		pw = new PrintWriter(fichero);

		for (int i = 0; i < biblioteca.getArraylibros().size(); i++) {
			Libro l = biblioteca.getArraylibros().get(i);
			pw.print(l.getTitulo() + "/");
			pw.print(l.getAutor() + "/");
			pw.print(l.getFechapubli() + "/");
			pw.print(l.getGenero() + "/");
			pw.print(l.getEdicion() + "/");
			pw.print(l.getEditorial() + "/");
			pw.println(l.getNcopias());
		}
		pw.close();
	
	}

	public void generarFicheroTxt(Biblioteca biblioteca) throws IOException {
		FileWriter fichero = new FileWriter("Ficheros\\libros.txt");
		PrintWriter pw;
		pw = new PrintWriter(fichero);

		for (int i = 0; i < biblioteca.getArraylibros().size(); i++) {
			Libro l = biblioteca.getArraylibros().get(i);
			pw.print(l.getTitulo() + "/");
			pw.print(l.getAutor() + "/");
			pw.print(l.getFechapubli() + "/");
			pw.print(l.getGenero() + "/");
			pw.print(l.getEdicion() + "/");
			pw.print(l.getEditorial() + "/");
			pw.println(l.getNcopias());

		}
		pw.close();
	}

	public void generarFicheroCsv(Biblioteca biblioteca) throws IOException {
		FileWriter fichero = new FileWriter("Ficheros\\libros.csv");
		PrintWriter pw;
		pw = new PrintWriter(fichero);

		for (int i = 0; i < biblioteca.getArraylibros().size(); i++) {
			Libro l = biblioteca.getArraylibros().get(i);
			pw.println(l.getTitulo() + "," + l.getAutor() + "," + l.getFechapubli() + "," + l.getGenero() + ","
					+ l.getEdicion() + "," + l.getEditorial() + "," + l.getNcopias());

		}
		pw.close();
	}

	/*private void generarFicheroXml(Biblioteca biblioteca) {
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			// Elemento raíz
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("Libros");
			doc.appendChild(rootElement);
			for (int i = 0; i < biblioteca.getArraylibros().size(); i++) {
				Libro l = biblioteca.getArraylibros().get(i);
				Element libro = doc.createElement("Libro");
				rootElement.appendChild(libro);
				// Se agrega un atributo al nodo elemento y su valor
				Attr titulo = doc.createAttribute("Titulo");
				titulo.setValue(l.getTitulo());
				libro.setAttributeNode(titulo);
				Attr autor = doc.createAttribute("Autor");
				autor.setValue(l.getAutor());
				libro.setAttributeNode(autor);
				Attr fechaPubli = doc.createAttribute("FechaPubli");
				fechaPubli.setValue(l.getFechapubli());
				libro.setAttributeNode(fechaPubli);
				Attr genero = doc.createAttribute("Genero");
				genero.setValue(l.getGenero());
				libro.setAttributeNode(genero);
				Attr edicion = doc.createAttribute("Edicion");
				edicion.setValue(String.valueOf(l.getEdicion()));
				libro.setAttributeNode(edicion);
				Attr editorial = doc.createAttribute("Editorial");
				editorial.setValue(l.getEditorial());
				libro.setAttributeNode(editorial);
				Attr numeroCopias = doc.createAttribute("NumeroCopias");
				numeroCopias.setValue(String.valueOf(l.getNcopias()));
				libro.setAttributeNode(numeroCopias);
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource();
				StreamResult result = new StreamResult(new File("FicherosGenerados\\libros.xml"));
				transformer.transform(source, result);
			}
			// Se escribe el contenido del XML en un archivo

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}

	}*/
}
