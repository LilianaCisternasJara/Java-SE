import java.util.Scanner;

public class Ingresar10Impares {

	public static void main(String[] args) {
		int cont;
		int num;
		int resto;
		
		cont = 1;
		
		Scanner leer = new Scanner(System.in);
		
		while(cont<=10) {
			System.out.println("Ingrese un número impar");
			num = leer.nextInt();
			resto = num%2;
			
			if(resto == 1) {
				System.out.println("El número " + cont+ " ha sido ingresado");
				cont = cont + 1;
			}
			else {
				System.out.println("El número ingresado es par, inténtalo nuevamente");
			}
		}

	}

}
