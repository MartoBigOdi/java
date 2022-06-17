package ar.edu.ort.tp1.pacial1.clases;

public class Mesa extends Mueble {

	private static final String MESA = "Mesa";
	private static final float COEFICIENTE_SUPERFICIE = 0.2f;
	private long largo;
	private long ancho;
	private TipoMesa tipoMesa;

	public Mesa(String modelo, float costoBase, float porcentajeGanancia, long largo, long ancho, TipoMesa tipoMesa) {
		super(modelo, costoBase, porcentajeGanancia);
		this.largo = largo;
		this.ancho = ancho;
		this.tipoMesa = tipoMesa;
	}

	public float calcularPrecioCosto() {

		return (float) (this.getCostoBase() * tipoMesa.getMultiplicadorValor()
				+ COEFICIENTE_SUPERFICIE * this.largo * this.ancho);
	}

	@Override
	protected String getTipoMueble() {
		return MESA;
	}

}
