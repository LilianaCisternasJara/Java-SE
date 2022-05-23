import java.util.Scanner;

public class SumaDesdeNumeroInicialFor {

	public static void main(String[] args) {
		
		int suma;
		int num;
		int x;
		
		suma = 0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingresa un número inicial:");
		num = leer.nextInt();
		
		x = (num - 1) + 100;
		
		for (int cont = num; cont<x + 1; cont++) {
			suma = suma + cont;
			
			
		}
		System.out.println("La suma de los 100 números a partir del número ingresado es: " + suma);

	}

}
