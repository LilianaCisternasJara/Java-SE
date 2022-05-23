
public class suma100PrimerosNatualresDoWhile {

	public static void main(String[] args) {
		int cont;
		int suma;
		cont = 0;
		suma = 0;
		
		do {
			cont = cont + 1;
			suma = suma + cont;
		}
		while(cont<100);
		System.out.println("La suma de los 100 primeros números naturales es: " + suma);
	}
}
