package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public class FabricaDeMuebles implements Mostrable {

	private static final float CIEN = 100;
	private static final String MSG_VENTA_TOTAL = "La venta total fue: $%8.2f";
	private static final String CANTIDADES = "Se han fabricado: %d Mesas, %d Sillas y %d Sillones\n";
	private static final float CINCO = 5;
	private String nombre;
	private ArrayList<Mueble> mueblesFabricados;

	private Contadores contadores;
	private float sumatoria;

	private int contSillas;

	public FabricaDeMuebles(String nombre) {
		this.nombre = nombre;
		this.mueblesFabricados = new ArrayList<>();
		contadores = new Contadores();
		sumatoria = 0;
		contSillas = 0;
	}

	public boolean fabricar(Mueble m) {
		boolean retorno = false;

		if (m != null) {
//			fabricar
			System.out.println("Fabricando el mueble:");
			m.mostrar();
			retorno = this.mueblesFabricados.add(m);
			this.actualizarContadoresAcumulador(m);
		}

		return retorno;
	}

	private void actualizarContadoresAcumulador(Mueble m) {
		this.sumatoria += m.calcularPrecioVenta();

		if (m instanceof Silla) {
			contadores.contarSilla();
		} else if (m instanceof Mesa) {
			contadores.contarMesa();
		} else if (m instanceof Sillon) {
			contadores.contarSillon();
		}
	}

	public boolean fabricarT2(Mueble m) {
		boolean retorno = false;
		if (m != null && m.superaGanancia(CINCO)) {
//			fabricar
			m.mostrar();
			retorno = this.mueblesFabricados.add(m);
			contarTema2(m);
		} else {
			System.out.println("No se supero el % de ganancia mínimo");
		}

		return retorno;
	}

	private void contarTema2(Mueble m) {
		if (m instanceof Silla) {
			this.contSillas++;
		}
		this.sumatoria += m.calcularPrecioVenta();
	}

	public boolean seHaFabricado(String modelo) {
		boolean seHaFabricado = false;
		int i = 0;

		while (i < this.mueblesFabricados.size() && !seHaFabricado) {

			seHaFabricado = mueblesFabricados.get(i).modeloCorrecto(modelo);
			i++;
		}

		return seHaFabricado;
	}

	public boolean superoCosto(double costoMinimo) {
		boolean retorno = false;
		int i = 0;

		while (i < this.mueblesFabricados.size() && !retorno) {

			retorno = mueblesFabricados.get(i).superaCostoBase(costoMinimo);
			i++;
		}
		return retorno;
	}

	@Override
	public void mostrar() {
		System.out.println("Fábrica de muebles: " + this.nombre);

		System.out.printf(CANTIDADES, contadores.getContMesa(), contadores.getContSilla(), contadores.getContSillon());
		System.out.printf(MSG_VENTA_TOTAL, sumatoria);
	}

	public void mostrar2() {
		System.out.println("Fábrica de muebles: " + this.nombre);

		System.out.printf("% de sillas es: %12.2f",
				mueblesFabricados.size() != 0 ? CIEN * this.contSillas / this.mueblesFabricados.size() : 0);
		System.out.printf(MSG_VENTA_TOTAL, sumatoria);
	}

	private class Contadores {
		private int contMesa;
		private int contSilla;
		private int contSillon;

		public Contadores() {
			this.contMesa = 0;
			this.contSilla = 0;
			this.contSillon = 0;
		}

		public int getContMesa() {
			return contMesa;
		}

		public int getContSilla() {
			return contSilla;
		}

		public int getContSillon() {
			return contSillon;
		}

		public void contarSilla() {
			contSilla++;
		}

		public void contarSillon() {
			contSillon++;
		}

		public void contarMesa() {
			contMesa++;
		}
	}
}
