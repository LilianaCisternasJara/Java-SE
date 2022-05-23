import java.util.Scanner;

public class CharNombre {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int num;
		char letra;
		num = 0;
		
		
		System.out.println("Ingresa el número de letras de tú palabra");
		num = leer.nextInt();
		char arr[] = new char[num];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Ingresa letra: " + (i + 1));
			letra = leer.next().charAt(0);
			arr[i] = letra;
		}
		System.out.println();
		
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
	}

}
