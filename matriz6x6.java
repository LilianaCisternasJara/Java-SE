
public class matriz6x6 {

	public static void main(String[] args) {
		
		int ma[][] = new int [6][6];
		int suma;
		
		
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

	}

}
