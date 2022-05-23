import java.util.Scanner;

public class TablasDeMultiplicar {

	public static void main(String[] args) {
		
		int cont;
		int num;
		int res;
		cont = 0;
		num= 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un número:");
		num = leer.nextInt();
		
		while (cont<11){
			res = num*cont;
			
			 System.out.println("El resultado es: " + res);
			
			
			cont= cont + 1;

			
			 }

	}

}
