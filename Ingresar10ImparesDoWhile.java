import java.util.Scanner;

public class Ingresar10ImparesDoWhile {

	public static void main(String[] args) {
		
		int cont;
		int num;
		int resto;
		
		cont = 1;
		
		Scanner leer = new Scanner(System.in);
		
		do {
			System.out.println("Ingresa un número impar");
			num = leer.nextInt();
			resto = num%2;
			
			if(resto == 1) {
				System.out.println("El número " + cont + " ha sido ingresado");
				cont = cont + 1;
			}
			else {
				System.out.println("El número ingresado no esimpar");
			}
		}
			while (cont<=10);

	}

}
