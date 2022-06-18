package ar.edu.ort.tp1.examen.clases;

public class Pelota extends Producto {
	
	private static final String LA_SUPERFICIE_NO_PUEDE_SER_NULA = "La superficie no puede ser nula";
	private static final String MSG_PELOTA = "La pelota para superficie %s es de la marca %s y tiene un id %d\n";
	
	//TODO Completar
	private Superficie superficie;

	public Pelota(int id, String marca, Superficie superficie) throws RuntimeException {
		super(id, marca);
		setSuperficie(superficie);
	}

	private void setSuperficie(Superficie superficie) throws RuntimeException {
		if (superficie == null) {
			throw new RuntimeException(LA_SUPERFICIE_NO_PUEDE_SER_NULA);
		}

		this.superficie = superficie;
	}

	@Override
	public void mostrar() {
		System.out.printf(MSG_PELOTA, superficie, getMarca(), getId());
	}
}
