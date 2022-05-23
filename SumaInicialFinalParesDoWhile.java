import java.util.Scanner;

public class SumaInicialFinalParesDoWhile {

	public static void main(String[] args) {
		

		int cont;
		int suma;
		int num1;
		int num2;
		int resto;
		
		suma = 0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese un número inicial");
		num1 = leer.nextInt();
		System.out.println("Ingrese un número final");
		num2 = leer.nextInt();
		
		cont = num1;
		
		do {
			resto = cont%2;
			if (resto == 0) {
				suma = suma + cont;
			}
			cont++;
		}	
		while (cont<=num2);
		System.out.println("La suma de los números pares comprendidos entre los números ingresados es: " + suma);

	}

}
