import java.util.Scanner;

public class Vectores_paralelos {

	private Scanner teclado;
	private String[] nombres;
	private int[] edades;

	public void cargar() {

		teclado = new Scanner(System.in);
		nombres = new String[5];
		edades = new int[5];

		for (int f = 0; f < nombres.length; f++) {
			System.out.println("Ingrese nombre: ");
			nombres[f] = teclado.next();
			System.out.println("Ingrese edad: ");
			edades[f] = teclado.nextInt();

		}

	}

	public void mayoresEdad() {
		System.out.println("Personas mayores de de edad: ");
		for (int f = 0; f < nombres.length; f++) {
			if (edades[f] >= 18) {
				System.out.println("Los mayores de edad son: " + nombres[f]);
			}

		}

	}

	
	
	public static void main(String[] ar ) {
		Vectores_paralelos vt = new Vectores_paralelos();
		vt.cargar();
		vt.mayoresEdad();
	}
}
