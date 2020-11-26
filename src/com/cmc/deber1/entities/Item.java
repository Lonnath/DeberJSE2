package com.cmc.deber1.entities;

public class Item {

	// ATRIBUTOS

	private String tipoItem;
	private String nombre;
	private String chasis;

	// CONSTRUCTORS

	public Item() {

	}

	public Item(String tipoItem, String nombre, String chasis) {

		this.tipoItem = tipoItem;
		this.nombre = nombre;
		this.chasis = chasis;
	}

	// GETTERS AND SETTERS

	public String getTipoItem() {
		return tipoItem;
	}

	public void setTipoItem(String tipoItem) {
		this.tipoItem = tipoItem;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	// METODOS

	public void imprimir() {
		System.out.println("Tipo Item: " + this.tipoItem + "\nNombre: " + this.nombre + "\nChasis: " + this.chasis);
	}

	public int obtenerConstante(String tipoItem) {
		int tmpo = 0;

		if (tipoItem.equals("Auto"))
			tmpo = 10;

		if (tipoItem.equals("Camion"))
			tmpo = 30;

		return tmpo;
	}
}
