import java.util.Scanner;

public class CantidadImparesFor {

	public static void main(String[] args) {
		int num;
		int nImpares;
		int resto;
		
		Scanner leer = new Scanner(System.in);
		
		nImpares = 0;
		for(int cont = 1; cont<=100; cont++) {
			System.out.println("Ingresa el número " + cont);
			num = leer.nextInt();
			resto = num%2;
			if(resto == 1) {
				nImpares++;
			}
		}
		
		System.out.println("La cantidad de números impares es: " + nImpares);
		
		

	}

}
