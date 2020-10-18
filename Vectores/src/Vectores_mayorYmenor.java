import java.util.Scanner;

public class Vectores_mayorYmenor {
  
	//Atributos
	private Scanner teclado;
	private String[] nombres;
	private float[]  sueldos;
	
	
	public void cargar() {
		teclado = new Scanner(System.in);
		nombres = new String[5];
		sueldos = new float[5];
		for(int f=0; f<nombres.length; f++) {
			System.out.println("Ingrese el nombre del operario:");
			nombres[f] = teclado.next();
			System.out.println("Ingrese sueldo del operario");
			sueldos[f] = teclado.nextFloat();
		}
	}
	
	public void mayorSueldo() {
		float mayor;
		int pos;
		mayor = sueldos[0];
		pos=0;
		for(int f=0; f<nombres.length; f++) {
			if(sueldos[f] > mayor) {
				mayor = sueldos[f];
				pos=f;
			}
			
		}
		System.out.println("El empleado con sueldo mayor es:"+ nombres[pos] );
		System.out.println("Tiene el sueldo de: "+ mayor);
	}
	
	
	public static void main(String[] args) {
		Vectores_mayorYmenor vc = new Vectores_mayorYmenor();
		vc.cargar();
		vc.mayorSueldo();
		

	}

}
