import java.util.Scanner;

public class MultiplicacionNumerosWhile {

	public static void main(String[] args) {
		int num;
		int producto;
		int cont;
		
		Scanner leer = new Scanner(System.in);
		
		cont = 0;
		producto = 1;
		
		while(cont<10) {
			cont = cont + 1;
			System.out.println("Ingrese un número: " + cont);
			num = leer.nextInt();
			producto = producto * num;
		}
		System.out.println("El resultado de multiplicar los 10 números ingresados es: " + producto);
		
		

	}

}
