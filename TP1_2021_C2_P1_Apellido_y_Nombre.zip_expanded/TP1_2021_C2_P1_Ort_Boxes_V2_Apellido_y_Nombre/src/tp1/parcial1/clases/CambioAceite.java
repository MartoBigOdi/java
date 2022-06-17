package tp1.parcial1.clases;

public class CambioAceite extends Servicio implements CotizablePorManoObra, CotizablePorMateriales {
	
	private int cantHoras;

	public CambioAceite(String descripcion, double porcentajeGanancia, String patente, int cantHoras) {
		super(descripcion, porcentajeGanancia, patente);
		this.cantHoras = cantHoras;
	}

	@Override
	public double calcularCostoMateriales() {
		double costo = CotizablePorMateriales.COSTOMATERIAL1 + CotizablePorMateriales.COSTOMATERIAL2;
		return costo;
	}

	@Override
	public double calcularCostoHoras() {
		// TODO Auto-generated method stub
		return CotizablePorManoObra.COSTOHORA * cantHoras;
	}

	@Override
	public double calcularPrecioCosto() {
		// TODO Auto-generated method stub
		return this.calcularCostoHoras() + this.calcularCostoMateriales();
	}


}
