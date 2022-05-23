import java.util.Scanner;

public class Ingresar10ImparesFor {

	public static void main(String[] args) {
		int num;
		int resto;
		
		Scanner leer = new Scanner(System.in);
		
		
		for(int cont = 1; cont<=10; cont++) {
			System.out.println("Ingresa un número impar");
			num = leer.nextInt();
			
			resto = num%2;
			
			if(resto == 1) {
				System.out.println("El número ingresado es impar");
			}
			else {
				System.out.println("El número ingresado no es impar, inténtalo nuevamente");
				cont = cont + 1;
			}
			
			
		}
		

	}

}
