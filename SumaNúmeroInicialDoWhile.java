import java.util.Scanner;
public class SumaNúmeroInicialDoWhile {

	public static void main(String[] args) {
		
		int cont;
		int suma;
		int num;
		int x;
		
		suma = 0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingresa un número inicial:");
		num = leer.nextInt();
		
		x= (num - 1)  + 100;
		cont = num;
		
		do {
			cont = cont + 1;
			suma = suma + cont - 1;
		}
		while (cont<=x);
		
		System.out.println("La suma de los 100 números a partir del número ingresado es:" + suma);
		

	}

}
