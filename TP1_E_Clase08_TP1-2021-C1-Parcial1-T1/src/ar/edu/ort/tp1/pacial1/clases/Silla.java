package ar.edu.ort.tp1.pacial1.clases;

public class Silla extends Mueble {

	private static final String SILLA = "Silla";
	private long alto;
	private MaterialSilla materialSilla;

	public Silla(String modelo, float costoBase, float porcentajeGanancia, long alto, MaterialSilla materialSilla) {
		super(modelo, costoBase, porcentajeGanancia);
		this.alto = alto;
		this.materialSilla = materialSilla;
	}

	public float calcularPrecioCosto() {

		return this.getCostoBase() + 
				materialSilla.getMultiplicadorValor() * this.alto;
	}

	@Override
	protected String getTipoMueble() {
		return SILLA;
	}

}
