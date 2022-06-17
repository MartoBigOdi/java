package ar.edu.ort.tp1.pacial1.clases;


public class Sillon extends Mueble {

	private static final String SILLON = "Sillon";
	private int cantCuerpos;
	private TelaSillon telaSillon;
	
	public Sillon(String modelo, float costoBase, 
			float porcentajeGanancia, int cantCuerpos, TelaSillon tela) {
		super(modelo, costoBase, porcentajeGanancia);
		this.cantCuerpos = cantCuerpos;
		this.telaSillon = tela;
	}

	@Override
	public float calcularPrecioCosto() {
		return (this.getCostoBase() * this.cantCuerpos 
				* telaSillon.getPorcentaje());

	}

	@Override
	protected String getTipoMueble() {
		return SILLON;
	}

}
