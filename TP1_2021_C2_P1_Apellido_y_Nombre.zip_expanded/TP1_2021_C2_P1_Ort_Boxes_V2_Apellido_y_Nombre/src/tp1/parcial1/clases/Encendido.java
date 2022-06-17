package tp1.parcial1.clases;

public class Encendido extends Servicio implements CotizablePorMateriales {

	public Encendido(String descripcion, double porcentajeGanancia, String patente) {
		super(descripcion, porcentajeGanancia, patente);
	}

	@Override
	public double calcularCostoMateriales() {
		// TODO Auto-generated method stub
		double costo = CotizablePorMateriales.COSTOMATERIAL1 + CotizablePorMateriales.COSTOMATERIAL2;
		return costo;
	}

	@Override
	public double calcularPrecioCosto() {
		// TODO Auto-generated method stub
		return calcularCostoMateriales();
	}


}
