package clases;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Pila;

public class Estante implements ContenedorInteligente <Juguete, Integer>{
	
	
	private Pila<Juguete> juguetes;

	public Estante(int profundidadEstanteria) {
		this.juguetes = new PilaNodos<Juguete>(profundidadEstanteria);
	}

	
	//Guardamos el elemento
	@Override
	public void guardar(Juguete elemento) {
		this.juguetes.push(elemento);
	}

	
	//Recuperamos por ID
	@Override
	public Juguete recuperarPorId(Integer id) {
		Juguete jugueteEncontrado = null;
		Juguete jugueteConsultado = null;

		Pila <Juguete> pilaAuxiliar = new PilaNodos<>();

		while (!this.juguetes.isEmpty() && jugueteEncontrado == null) {
			jugueteConsultado = this.juguetes.pop();
			if (jugueteConsultado.getId() == id) {
				jugueteEncontrado = jugueteConsultado;
			} else {
				pilaAuxiliar.push(jugueteConsultado);
			}
		}

		while (!pilaAuxiliar.isEmpty()) {
			this.juguetes.push(pilaAuxiliar.pop());
		}

		return jugueteEncontrado;
	}

}
