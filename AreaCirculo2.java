import java.util.Scanner;
public class AreaCirculo2 {

	public static void main(String[] args) {
		float area;
		float radio;
		float pi;
		pi = 3.1416f;
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Ingrese el valor del radio en cm:");
		radio = leer.nextFloat();
		
		area = pi*radio*radio;
		
		System.out.println("El área del circulo es: " + area + " centímetros al cuadrado");
		

	}

}
