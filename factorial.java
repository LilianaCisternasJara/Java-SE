package factorial;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int num;
		int factorial;
		int cont;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingresa un número");
		num = leer.nextInt();
		
		if(num<0) {
			System.out.println("Debes ingresar un número mayor o igual a 0");
		}
		else {
			cont = 1;
			factorial = 1;		
			
			while (cont<=num) {
				
				factorial = factorial * cont;
				cont = cont + 1;
				
			}
			System.out.println("El factorial del número " + num + " es " + factorial);
		}
	
	}

}
