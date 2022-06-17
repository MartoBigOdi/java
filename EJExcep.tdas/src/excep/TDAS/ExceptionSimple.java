package excep.TDAS;

public class ExceptionSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int entero1 = 10;
		int entero2 = 0;

		/**
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
		 * excep.ExceptionSimple.main(ExceptionSimple.java:11)
		 */
		// System.out.println("El cociente es: "+ entero1 / entero2 );

		/**
		 * Try y Catch
		 */
		try {
			System.out.println("El cociente es: " + entero1 / entero2);

		} catch (Exception e) {
			System.out.println("Hubo un error pero no rompemos nada");
		}

		
		System.out.println("Seguimos compilando");
		
		
	}

}
