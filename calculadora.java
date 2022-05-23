import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		int opcion;
		float num1;
		float num2;
		float res;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese la opción para la operación que desee realizar");
		opcion = leer.nextInt();
		System.out.println("Ingrese el primer número:");
		num1 = leer.nextFloat();
		System.out.println("Ingrese el segundo número:");
		num2 = leer.nextFloat();
		
		
		
			switch(opcion) {
			case 1:
				res = num1 + num2;
				System.out.println(num1 + " más " + num2 +  " es igual a " + res);
				break;
			case 2:
				res = num1 - num2;
				System.out.println(num1 + " menos " + num2 +  " es igual a " + res);
				break;
			case 3:
				if (num2 != 0) {
				res = num1 / num2;
				System.out.println(num1 + " dividido " + num2 + " es igual a " + res);
				}
				else {
					System.out.println("La división por 0 no está definida");
				}
				break;
			case 4:
				res = num1 * num2;
				System.out.println(num1 + " multiplicado " + num2 + " es igual a " + res);
				break;
			case 5:
				System.out.println("Opción inválida");
				break;
			default:
				System.out.println("Escoja una opción válida");
				
			}	
		}
	}


