package com.cmc.deber1.tests;
import com.cmc.deber1.entities.*;
import com.cmc.entities.*;
public class AdministradorPoliza {
	public static void main(String[] args) {
		Poliza pol1 = new Poliza();
		pol1.setNumero("ABC123");
		
		pol1.setCliente(new Cliente("Pedro Gutierrez", 23));
		pol1.getCliente().setDireccion(new Direccion("Gran Manzana", "Secunda", 80));
		pol1.getCliente().setTipoCliente(new TipoCliente(21242, "VIP"));
		pol1.setItem(new Item());
		pol1.getItem().setNombre("Mazda");
		pol1.getItem().setTipoItem("Auto");
		pol1.getItem().setChasis("Chasis1");
		
		Item item = pol1.obtenerItem(new Cliente("Hernesto Fernandez", 15));
		
		if(pol1.validarEdad()) {
			pol1.imprimir();
		}else System.out.print("No se puede emitir la póliza");
	
	}
}
