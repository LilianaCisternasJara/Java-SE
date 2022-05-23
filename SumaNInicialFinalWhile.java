import java.util.Scanner;

public class SumaNInicialFinalWhile {

	public static void main(String[] args) {
		
		int cont;
		int suma;
		int num1;
		int num2;
		
		suma = 0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingresa un número inicial");
		num1 = leer.nextInt();
		
		System.out.println("Ingresa un número final");
		num2 = leer.nextInt();
		
		cont = num1;
		
		while (cont<=num2) {
			suma = suma + cont;
			cont = cont + 1;
		}

		System.out.println("La suma de " + num1 + " a " + num2 + " es " + suma);
	}

}
