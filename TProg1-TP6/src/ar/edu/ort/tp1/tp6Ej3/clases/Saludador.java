package ar.edu.ort.tp1.tp6Ej3.clases;

import java.util.Scanner;



/**
 * Esta clase debe:
 * - Cargar uno o mas diccionarios (uno en cada idioma, al menos dos) para que pueda:
 *    -- Mostrar errores
 *    -- Dar la bienvenida
 *    -- Solicitar un nombre (para que el Saludador lo pida por teclado).
 *    -- Decirle que tiene un lindo nombre
 *    -- Mostrar un saludo de despedida usando el nombre pedido por teclado.
 * - Elegir un idioma
 * - Ejecutar una rutima que:
 *   -- Salude
 *   -- Pida el nombre
 *   -- Lo cargue por teclado
 *   -- Diga que es un lindo nombre
 *   -- Despedir usando el nombre
 */
public class Saludador {

	private Diccionario diccionario;
	private String idioma;
	private Scanner input;
	
	public Saludador(String idioma) {
		// TODO -- Completar
	}

	private void cargarDiccionario(Diccionario diccionario) {
		// TODO -Carga los diccionarios de los distintos idiomas
	}

	public void elegirIdioma(String idioma) throws RuntimeException {
		if (diccionario.idiomaValido(idioma)) {
			this.idioma = idioma;
		} else {
			throw new RuntimeException(diccionario.obtenerTermino(this.idioma, "IDIOMA_INVALIDO"));
		}
	}

	public void run() {
		// TODO - Usa lo definido en el resto de la clase
	}

}
