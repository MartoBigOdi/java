package tp1.parcial1.clases;
import java.util.ArrayList;


public class TallerMecanico {

/*	todo completar */	
	private ArrayList<Servicio> serviciosEfectuados;
	private String nombre;
	private int cantAlineacion;
	private int cantCambiosAceite;
	private int cantEncendido;
	private double sumatoriaVentas;
	private static final String FORMATO_CANTIDADES = "Se efectuaron: %d cambios de aceite, %d encendido y %d alineacion\n";

	
	
	
	public TallerMecanico(String nombre) {
		//TODO A completar
		this.nombre = nombre;
		this.serviciosEfectuados = new ArrayList<Servicio>();
	}
	
	
	
	public boolean agregarServicio(Servicio nuevoServicio) { 
		boolean retorno = false;
		if(nuevoServicio != null) {
			retorno = this.serviciosEfectuados.add(nuevoServicio);
			contarTipoServicio(nuevoServicio);
			sumatoriaVentas += nuevoServicio.calcularPrecioVenta();
		}
		return retorno;
	}
	
	
	
	//Modularizamos el contador de tipos de servicio. Modularizamos el InstanceOf
	private void contarTipoServicio(Servicio nuevoServicio) {
		// TODO Auto-generated method stub
		if (nuevoServicio instanceof Alineacion) {
			cantAlineacion++;
		} else if (nuevoServicio instanceof CambioAceite) {
			cantCambiosAceite++;
		} else if( nuevoServicio instanceof Encendido) {
			cantEncendido++;
		}
	}
	
	
	

	public void listarServicios() {
		//TODO A completar
		System.out.println("Taller: " + this.nombre);
		System.out.printf(FORMATO_CANTIDADES, cantCambiosAceite, cantEncendido, cantAlineacion);
		System.out.println("EL importe total de Ventas es de: $" + sumatoriaVentas);
	}
}
