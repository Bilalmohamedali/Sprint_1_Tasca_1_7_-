package ejercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trabajador trabajador = new Trabajador("Bill","Ali",13);
		TrabajadorOnline trabajadorOnline = new TrabajadorOnline("Juan","Vera",15,5);
		TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("Luis","Lopez",50,20);
		System.out.println("El sueldo del trabajador es: " + trabajador.calcularSueldo(13));
		System.out.println("El sueldo del trabajador online es: " + trabajadorOnline.calcularSueldo(13));
		System.out.println("El sueldo del trabajador presencial es: " + trabajadorPresencial.calcularSueldo(13));

	}

}
