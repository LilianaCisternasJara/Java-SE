import java.util.Scanner;

public class MultiplicacionNumerosDoWhile {

	public static void main(String[] args) {
		int num;
		int producto;
		int cont;
		
		Scanner leer = new Scanner(System.in);
		
		cont = 0;
		producto = 1;
		
		do {
			cont = cont + 1;
			System.out.println("Ingrese un número " + cont);
			num = leer.nextInt();{
			
			producto = producto * num;
			}
		}
		while (cont<10); {
			System.out.println("El resultado del producto de los 10 números ingresados es: " + producto);
		}

	}

}
