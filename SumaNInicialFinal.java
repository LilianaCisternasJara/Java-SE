import java.util.Scanner;
public class SumaNInicialFinal {

	public static void main(String[] args) {
		//while
		int cont;
		int suma;
		int num;
		int x;
		
		suma = 0;
		
		
		
		System.out.println("Ingresa un número inicial:");
		num = leer.nextInt();
		
		x = (num - 1) + 100;
		
		cont = num;
		
		while (cont<=x) {
			suma = suma + cont;
			cont = cont + 1;
		}
		
		System.out.println("la suma de los 100 números a partir del número ingresado es: " + suma);

	}

}
