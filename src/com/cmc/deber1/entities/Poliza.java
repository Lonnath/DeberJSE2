package com.cmc.deber1.entities;

import com.cmc.entities.Cliente;

public class Poliza {
	private String numero;
	private Cliente cliente;
	private Item item;

	// GETTERS AND SETTERS

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	// METODOS

	public void imprimir() {
		System.out.println("Numero Poliza: " + this.numero + "\nNombre Cliente: " + this.cliente.getNombre()
				+ "\nEdad: " + this.cliente.getEdad() + "\nDireccion: "
				+ this.cliente.getDireccion().getCallePrincipal() + " "
				+ this.cliente.getDireccion().getCalleSecundaria() + " " + this.cliente.getDireccion().getNumero()
				+ "\nTipo Cliente: " + this.cliente.getTipoCliente().getNombre() + " Codigo: "
				+ this.cliente.getTipoCliente().getCodigo());
	}

	/*
	 * METODO obtenerItem que imprime un item 
	 * public void obtenerItem(Cliente c) {
	 * if (c.getNombre().equals(this.cliente.getNombre()) && this.cliente.getEdad() == c.getEdad()){
	 * this.item.imprimir();
	 * }
	 * 
	 */
	public Item obtenerItem(Cliente c) {
		  		if(c.getNombre().equals(this.cliente.getNombre()) && this.cliente.getEdad() == c.getEdad()) 
		  			return this.item; 
		  
		  		return null; 
		  }
	

	public boolean validarEdad() {
		if (this.cliente.getEdad() > 17)
			return true;

		return false;
	}
}
