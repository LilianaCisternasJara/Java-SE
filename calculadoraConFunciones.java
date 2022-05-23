import java.util.Scanner;
public class calculadoraConFunciones {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		float x,y;
		int op;
		
		op = 0;
		System.out.println("Ingresa la operación que desees realizar:");
		System.out.println("1 sumar");
		System.out.println("2 restar");
		System.out.println("3 multiplicar");
		System.out.println("4 dividir");
		op = leer.nextInt();
		
		if (op == 1) {
			x=0;
			y=0;
			System.out.println("Ingrese el primer número:");
			x = leer.nextFloat();
			System.out.println("Ingresa el segundo número:");
			y = leer.nextFloat();
			sumar(x,y);
		}
		if (op == 2) {
			x=0;
			y=0;
			System.out.println("Ingresa el primer número:");
			x = leer.nextFloat();
			System.out.println("Ingresa el segundo número:");
			y = leer.nextFloat();
			restar(x,y);
			
		}
		if (op == 3) {
			x=0;
			y=0;
			System.out.println("Ingresa el primer número a multiplicar:");
			x = leer.nextFloat();
			System.out.println("Ingresa el segundo número a multiplicar:");
			y = leer.nextFloat();
			
			multiplicar(x,y);
			
		}
		if(op == 4) {
			x=0;
			y=0;
			System.out.println("Ingresa el primer número");
			x = leer.nextFloat();
			System.out.println("Ingresa el segundo número:");
			y = leer.nextFloat();
			dividir(x,y);
		}
		}




	public static void sumar(float x, float y) {
		float res;
		res = 0;
		res = x + y;
		System.out.println("El resulatdo de sumar " + x + " más " + y + " es: " +  res);
		
	}
	
	public static void restar (float x, float y) {
		float res;
		res = 0;
		res = x - y;
		System.out.println("El resultado de: " + x + " menos "+ y + " es "+ res);
	}
	
	public static void multiplicar (float x, float y) {
		float res;
		res = 0;
		res = x * y;
		System.out.println("El resultado de: " + x + " por "+ y + " es "+ res);
	
}
	public static void dividir (float x, float y) {
		float res;
		res = 0;
		res = x / y;
		if(y==0) {
			System.out.println("La división por 0 no está definida");
		}
		System.out.println("El resultado de: " + x + " dividido "+ y + " es "+ res);
	
}
	
}
