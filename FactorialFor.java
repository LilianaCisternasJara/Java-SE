import java.util.Scanner;

public class FactorialFor {

	public static void main(String[] args) {
		int num;
		int factorial;
		
Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingresa un número");
		num = leer.nextInt();
		
		if(num<0) {
			System.out.println("Ingresa un número mayor o igual a 0");
		}
		else {
			factorial = 1;
			
			for(int cont = 1; cont<=num; cont++) {
				 
				factorial = factorial * cont;
			}
			System.out.println("El factorial del número " + num + " es " + factorial);
		}

	}

}
