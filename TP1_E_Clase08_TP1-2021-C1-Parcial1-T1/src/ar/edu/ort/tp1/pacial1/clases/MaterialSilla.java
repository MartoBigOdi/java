package ar.edu.ort.tp1.pacial1.clases;

public enum MaterialSilla {
	MADERA(0.7f), METAL(0.3f), PLASTICO(0.2f);

	private float multiplicadorValor;

	private MaterialSilla(float multiplicadorValor) {
		this.multiplicadorValor = multiplicadorValor;
	}

	public float getMultiplicadorValor() {
		return multiplicadorValor;
	}
}
