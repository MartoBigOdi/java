package tp1.parcial1.clases;

public class Alineacion extends Servicio implements CotizablePorManoObra {
	
	private int cantHoras;
	private boolean balanceo;

	public Alineacion(String descripcion, double porcentajeGanancia, String patente, int cantHoras, boolean balanceo) {
		super(descripcion, porcentajeGanancia, patente);
		this.cantHoras = cantHoras;
		this.balanceo = balanceo;
	}

	private static final double EXTRABALANCEO = 500;
	
/*	todo completar */
	

	@Override
	public double calcularCostoHoras() {
		// TODO Auto-generated method stub
		return CotizablePorManoObra.COSTOHORA * this.cantHoras;
	}
	

	@Override
	public double calcularPrecioCosto() {
		// TODO Auto-generated method stub
		double total = this.calcularCostoHoras();
		//Ternario que suma si el balanceo es true.
		return this.balanceo ? total + Alineacion.EXTRABALANCEO : total;
	}
	


}
