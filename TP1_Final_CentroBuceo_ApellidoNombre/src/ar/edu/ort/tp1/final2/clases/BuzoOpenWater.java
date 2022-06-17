package ar.edu.ort.tp1.final2.clases;

/**
 * Buzo con autorizacion para bajar hasta los 22 metros inclusive. nunca puede realizar buceos mas profundos
 *
 */
public class BuzoOpenWater extends Buzo {

	private static final int PROFUNDIDAD_MAXIMA_PERMITIDA = 22;

	public BuzoOpenWater(String nombre, String nacionalidad, int edad) throws Exception {
		super(nombre, nacionalidad, edad);

	}

	@Override
	public boolean habilitadoBuceoProfundo() {
		return false;
	}

	@Override
	public boolean habilitadoBuceoMedio() {
		return false;
	}

	@Override
	public boolean habilitado(int metros) {
		return PROFUNDIDAD_MAXIMA_PERMITIDA >= metros;
	}

}