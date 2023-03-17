package ejercicio2;

import ejercicio1.Trabajador;
import ejercicio1.TrabajadorOnline;
import ejercicio1.TrabajadorPresencial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrabajadorD trabajadorD = new TrabajadorD("Bill","Ali",13);
		TrabajadorOnline trabajadorOnline = new TrabajadorOnline("Juan","Vera",15,5);
		TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("Luis","Lopez",50,20);
		System.out.println("El sueldo del trabajador es: " + trabajadorD.calcularSueldo(13));
		System.out.println("El sueldo del trabajador online es: " + trabajadorOnline.calcularSueldo(13));
		System.out.println("El sueldo del trabajador presencial es: " + trabajadorPresencial.calcularSueldo(13));

		System.out.println("Calculo de la prima: " + calcularPrima(trabajadorD));

	}

	@SuppressWarnings("Deprecated")
	private static boolean calcularPrima(TrabajadorD trabajadorD) {
		return trabajadorD.prima();
	}


}
