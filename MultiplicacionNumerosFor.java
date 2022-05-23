import java.util.Scanner;

public class MultiplicacionNumerosFor {

	public static void main(String[] args) {
		int num;
		int producto;
		
		Scanner leer = new Scanner(System.in);
		
		producto = 1;
		
		for(int cont = 1; cont<=10; cont++) {
			System.out.println("Ingresa un número: ");
			num = leer.nextInt();
			
			producto = producto * num;
			
		}
		System.out.println("El resultado de la multiplicación de los 10 números ingresados es: " + producto);

	}

}
