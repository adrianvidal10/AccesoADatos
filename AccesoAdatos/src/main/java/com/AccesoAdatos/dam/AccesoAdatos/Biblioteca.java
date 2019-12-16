package com.AccesoAdatos.dam.AccesoAdatos;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> arraylibros;

	public Biblioteca() {
		this.arraylibros = new ArrayList<Libro>();
	}

	public ArrayList<Libro> getArraylibros() {
		return this.arraylibros;
	}

	public void setArraylibros(ArrayList<Libro> arraylibros) {
		this.arraylibros = arraylibros;
	}
}
