package clases;

public class Pelota extends Juguete implements Mostrable{
	
	private static final String LA_SUPERFICIE_NO_PUEDE_SER_NULA = "La superficie no puede ser nula";
	private static final String MSG_PELOTA = "La pelota cuesta %.2f pesos, es del tipo %s ademas es de la marca %s y tiene un id %d\n";
	private TipoDePelota tipoPelota;
	
	
	public Pelota(int id, String marca, TipoDePelota tipoPelota, double precio) throws RuntimeException {
		super(id, marca, precio);
		setTipoPelota(tipoPelota);
	}

	
	private TipoDePelota getTipoPelota() {
		return tipoPelota;
	}
	
	
	private void setTipoPelota(TipoDePelota tipoPelota) throws RuntimeException{
		if (tipoPelota == null) {
			throw new RuntimeException(LA_SUPERFICIE_NO_PUEDE_SER_NULA);
		}
			this.tipoPelota = tipoPelota;
	}


	@Override
	public void mostrar() {
		System.out.printf(MSG_PELOTA, this.getPrecio(), this.getTipoPelota(), this.getMarca() ,this.getId());
		
	}
	
	
	
}
