package ar.edu.ort.tp1.parcial1.clases;

import java.util.ArrayList;

public class Veterinaria implements Mostrable {

	private static final String TXT_INGRESO = "Ingresando a %s a la veterinaria \n";
	private static final String TXT_CANTIDADES = "Han sido ingresados: %d conejos, %d gatos y %d perros\n";
	// TODO A completar
	private String nombre;
	private Doctor doctor;
	private ArrayList<Mascota> animalesIngresados;
	private int cantConejos = 0;
	private int cantGatos = 0;
	private int cantPerros = 0;
	
	
	public Veterinaria(String nombre, Doctor doctor) {
		// TODO A completar
		this.nombre = nombre;
		this.doctor = doctor;
		this.animalesIngresados = new ArrayList <Mascota>();
	}

	
	
	public void admitirMascota(Mascota mascota) {
		// TODO A completar
		if(mascota != null) {
			animalesIngresados.add(mascota);
			//Usamos el printF porque tenemos una final para utilizar con el string.
			System.out.printf(TXT_INGRESO, mascota.getNombre()); 
		}
	}

	
	
	//Busca Mascota y la devuelve simo devuelve Null
	public Mascota buscarMascota(String nombreMascota) {
		// TODO A completar
		Mascota mascota = null;
		int idx = 0;
		while(mascota == null && idx < animalesIngresados.size() ) {
			if(animalesIngresados.get(idx).esTuNombre(nombreMascota)) {
				mascota = animalesIngresados.get(idx);
			};
			idx++;
		}
		return mascota;
	}
	

	public void vacunar() {
		// TODO A completar
		int cantVacunasDadas = 0;
		for (Mascota mascota : animalesIngresados) {
			if(!mascota.estaVacunado()) {
				cantVacunasDadas++;
				mascota.vacunar();
			}
		}
		System.out.println("Animales vacunados: " + cantVacunasDadas);
	}



	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("Veterinaria: " + this.nombre );
		System.out.println("Doctor de turno: " + this.doctor.getNombre());
		
		//Contamos las instancias de Animales, discriminando por tipo de Animal
		for ( Mascota mascota : animalesIngresados) {
			if(mascota instanceof Conejo) {
				cantConejos++;
			} else if (mascota instanceof Gato) {
				cantGatos++;
			} else if(mascota instanceof Perro) {
				cantPerros++;
			}
		}
		
		System.out.printf(TXT_CANTIDADES, cantConejos, cantGatos, cantPerros);
	}

}
