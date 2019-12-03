package com.AccesoAdatos.dam.AccesoAdatos;

public class Libro {
private int edicion;
private int ncopias;
private String titulo;
private String autor;
private String fechapubli;
private String genero;
private String editorial;
public int getEdicion() {
	return edicion;
}
public void setEdicion(int edicion) {
	this.edicion = edicion;
}
public int getNcopias() {
	return ncopias;
}
public void setNcopias(int ncopias) {
	this.ncopias = ncopias;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getFechapubli() {
	return fechapubli;
}
public void setFechapubli(String fechapubli) {
	this.fechapubli = fechapubli;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public String getEditorial() {
	return editorial;
}
public void setEditorial(String editorial) {
	this.editorial = editorial;
}
@Override
public String toString() {
	return "Libro [edicion=" + edicion + ", ncopias=" + ncopias + ", titulo=" + titulo + ", autor=" + autor
			+ ", fechapubli=" + fechapubli + ", genero=" + genero + ", editorial=" + editorial + "]";
}

}
