
public class matrizIdentidadEInversa {

	public static void main(String[] args){
		
		int ma[][] = {{0, 0, 1}, {0, 1, 0}, {1, 0, 0}};
		
		System.out.println("Matriz identidad");
		System.out.println();
		
		System.out.print(ma[0][0]);
		System.out.print(ma[0][1]);
		System.out.println(ma[0][2]);
		System.out.print(ma[1][0]);
		System.out.print(ma[1][1]);
		System.out.println(ma[1][2]);
		System.out.print(ma[2][0]);
		System.out.print(ma[2][1]);
		System.out.print(ma[2][2]);
		
		System.out.println();
		
		int mai[][] = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
		
		System.out.println();
		
		System.out.println("Matriz identidad inversa");
		System.out.println();
		
		System.out.print(ma[0][0]);
		System.out.print(ma[0][1]);
		System.out.println(ma[0][2]);
		System.out.print(ma[1][0]);
		System.out.print(ma[1][1]);
		System.out.println(ma[1][2]);
		System.out.print(ma[2][0]);
		System.out.print(ma[2][1]);
		System.out.print(ma[2][2]);
		
		
		
	}

}
