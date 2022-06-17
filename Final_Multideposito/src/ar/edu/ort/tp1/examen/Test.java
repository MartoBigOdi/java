package ar.edu.ort.tp1.examen;

import ar.edu.ort.tp1.examen.clases.Bolso;
import ar.edu.ort.tp1.examen.clases.Deposito;
import ar.edu.ort.tp1.examen.clases.Pelota;
import ar.edu.ort.tp1.examen.clases.Producto;
import ar.edu.ort.tp1.examen.clases.Raqueta;
import ar.edu.ort.tp1.examen.clases.Superficie;

public class Test {

	private static final int ONCE = 11;
	private static int id = 10;

	public static void main(String[] args) throws Exception {

		Deposito d = new Deposito(3);

		
		depositar(d);
	
		
		int unId = 55;
		System.out.println(d.productoDepositado(unId) ? "El producto id " + unId + " est� depositado"
				: "El producto id " + unId + " NO est� depositado");
		unId = 23;
		System.out.println(d.productoDepositado(unId) ? "El producto id " + unId + " est� depositado"
				: "El producto id " + unId + " NO est� depositado");

		retiros(d);
	}

	private static void retiros(Deposito d) {
		System.out.println("Se comienza a retirar elementos");
		System.out.println();
		retirar(d, 12);
		System.out.println();
		retirar(d, 13);
		System.out.println();
		retirar(d, 28);
		System.out.println();
		System.out.println("Fin del retiro de elementos");
	}

	private static void retirar(Deposito d, int id) {
		Producto p = d.retirarPorId(id);
		if (p != null) {
			System.out.println("Se retir� el producto id: " + id);
			p.mostrar();
		} else {
			System.out.println("No se pudo retirar producto id: " + id);
		}

	}

	private static void depositar(Deposito d) {

		System.out.println("Depositando productos");
		System.out.println();

		try {
			depositarBolso(d, id++, "Wilson", "Us Open");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		System.out.println();
		try {
			depositarRaqueta(d, id++, "Wilson", 100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		System.out.println();
		try {
			depositarPelota(d, id++, "Wilson", Superficie.POLVO_LADRILLO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		System.out.println();
		try {
			depositarBolso(d, id++, "", "Us Open 2");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		System.out.println();
		try {
			depositarRaqueta(d, 0, "Wilson", 105);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		System.out.println();
		try {
			depositarBolso(d, id++, "Wilson", "All Team");
		} catch (Exception e) {
			// TODO Auto-generated catch block
		
		}
		System.out.println();
		try {
			depositarRaqueta(d, id++, "Prince", 98);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			
		}
		System.out.println();
		try {
			depositarPelota(d, id++, "Wilson", Superficie.RAPIDA);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		System.out.println();
		try {
			depositarBolso(d, id++, "Wilson", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}
		System.out.println();
		try {
			depositarRaqueta(d, id++, "Wilson", 544);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		System.out.println();
		try {
			depositarPelota(d, id++, "Wilson", null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		System.out.println();
		for (int i = 0; i < ONCE; i++) {
			try {
				depositarPelota(d, id++, "Wimbledon", Superficie.CESPED);
			} catch (Exception e) {
				// TODO Auto-generated catch block
		
			}
			System.out.println();
		}
		try {
			depositarBolso(d, id++, "Wilson", "Australian Bag");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		System.out.println();
		System.out.println("Fin de los dep�sitos");
	}

	private static void depositarBolso(Deposito d, int id, String marca, String modelo) throws Exception {
		try {
			Producto producto = new Bolso(id, marca, modelo);
			d.depositar(producto);
			producto.mostrar();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

	
	
	private static void depositarRaqueta(Deposito d, int id, String marca, int tamanioAro) throws Exception {
		try {
			Producto producto = new Raqueta(id, marca, tamanioAro);
			d.depositar(producto);
			producto.mostrar();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

	
	
	private static void depositarPelota(Deposito d, int id, String marca, Superficie superficie) throws Exception {
		try {
			Producto producto = new Pelota(id, marca, superficie);
			d.depositar(producto);
			producto.mostrar();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

}
