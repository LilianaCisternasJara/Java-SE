import java.util.Scanner;

public class CantidadImparesDoWhile {

	public static void main(String[] args) {
		int cont;
		int num;
		int nImpares;
		int resto;
		
		Scanner leer = new Scanner(System.in);
		
		cont = 1;
		nImpares = 0;
		
		
		
		do {
			System.out.println("Ingresa un número: " + cont);
			num = leer.nextInt();
			resto = num%2;
			if (resto == 1) {
				nImpares = nImpares + 1;
			}
			cont = cont + 1;
		}
			while (cont<=100);
			System.out.println("La cantidad de números impares es: " + nImpares);
		}

	
		}
	
