
public class matriz6x6Inversa {

	public static void main(String[] args) {
		
		int ma[][] = new int [6][6];
		int suma;
		
		System.out.println("Diagonal");
		System.out.println();
		
		
		for (int fila = 0; fila<6; fila++) {
			for(int columna = 0; columna<6; columna++) {
				suma = fila + columna;
				
				if(suma == 5) {
					ma[fila][columna] = 1;
				}
				else{
					ma[fila][columna] = 0;
					
				}
				System.out.print(ma[fila][columna]);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Diagonal inversa");
		System.out.println();
		
		for (int fila = 0; fila<6; fila++) {
			for(int columna = 0; columna<6; columna++) {
				if(fila==columna) {
					ma[fila][columna] = 1;
				}
				else {
					ma[fila][columna] = 0;
				}
				System.out.print(ma[fila][columna]);
			}
			System.out.println();
		}
		

	}

}
