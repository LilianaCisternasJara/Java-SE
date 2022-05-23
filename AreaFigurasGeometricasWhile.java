import java.util.Scanner;

public class AreaFigurasGeometricasWhile {

	public static void main(String[] args) {
		int op;
		float radio;
		float lado;
		float largo;
		float ancho;
		float area;
		float pi;
		
		Scanner leer = new Scanner(System.in);
		
		pi = 3.1416f;
		
		op = 0;
		
		while(op!=4) {
			System.out.println("Menú");
			System.out.println("Ingresa 1 para calcular el área de un círculo");
			System.out.println("Ingresa 2 para calcular el área de un cuadrado");
			System.out.println("Ingresa 3 para calcular el área de un rectángulo");
			System.out.println("Ingresa 4 para salir");
			
			op = leer.nextInt();
			
			switch(op) {
				case 1: System.out.println("Ingresa el radio de la circunferencia en cm");
					radio = leer.nextFloat();
					
					area = pi*radio*radio;
					
					System.out.println("El área del circulo es  " + area + " centímetros al cuadrado ");
					break;
					
				case 2: System.out.println("Ingresa la medida del lado en cm");
					lado = leer.nextFloat();
					
					area = lado * lado;
					
					System.out.println("El área del cuadrado es " + area + " centímetros al cuadrado");
					break;
				
				case 3: System.out.println("Ingresa la medida del largo del rectángulo en cm");
						
						largo = leer.nextFloat();
						
						System.out.println("Ingresa la medida del lado del rectángulo en cm");
						
						lado = leer.nextFloat();
						
						area = largo * lado;
						
						System.out.println("El área del rectángulo es " + area + " cm al cuadrado");
						break;
						
				case 4: 
					System.out.println("Saliste del programa");
					break;
				default:
					System.out.println("Opción inválida");
			}
		}

	}

}
