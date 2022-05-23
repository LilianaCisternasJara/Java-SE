
public class suma100PrimerosNaturalesWhile {

	public static void main(String[] args) {
		int cont;
		int suma;
		
		cont = 1;
		suma = 0;
		
		while(cont<=100) {
			suma = suma + cont;
			cont = cont + 1;
		}
		System.out.println("La suma de los 100 primeros números naturales es: " + suma);

	}

}
