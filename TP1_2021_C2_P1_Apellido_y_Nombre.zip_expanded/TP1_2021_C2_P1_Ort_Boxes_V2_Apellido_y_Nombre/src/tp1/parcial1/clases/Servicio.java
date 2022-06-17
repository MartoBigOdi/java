package tp1.parcial1.clases;

public abstract class Servicio implements Detallable {
	//TODO A completar
	private String descripcion;
	private double porcentajeGanancia;
	private String patente;


	public Servicio(String descripcion, double porcentajeGanancia, String patente) {
		this.descripcion = descripcion;
		this.porcentajeGanancia = porcentajeGanancia;
		this.patente = patente;
	}
	
	
	protected String getPatente() {
		return this.patente;
	}
	
	
	public abstract double calcularPrecioCosto();

	
	public double calcularPrecioVenta() {
		double costo = this.calcularPrecioCosto();
		return costo+(this.porcentajeGanancia*costo/100);
	}
	
	
	
	@Override
	public void detallar() {
		System.out.println("Servicio de: " + getClass().getSimpleName() + "\nPatente: " 
				+ getPatente() + " Precio Venta Servicio: " + calcularPrecioVenta());
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}

}
