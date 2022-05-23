import java.util.Scanner;
import java.util.Iterator;
import java.util.Arrays;
public class consonantesVocales {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String palabra;
		int tamaño;
		int nvocales, nconsonantes;
		
		nvocales = 0;
		nconsonantes = 0;
		
		System.out.println("Ingresa una palabra");
		palabra = leer.next();
		System.out.println("La palabra ingresada es: " + palabra);
		tamaño = palabra.length();
		
		for (int i=0; i<tamaño; i++) {
			if(palabra.charAt(i) == 'a' ||
					palabra.charAt(i) == 'e' ||
					palabra.charAt(i) == 'i'  ||
					palabra.charAt(i) == 'o'  ||
					palabra.charAt(i) == 'u'
			){
				nvocales++;
			}
				
		else {
			nconsonantes++;
		}
				
			}
		System.out.println("La cantidad de vocales es: " + nvocales);
		System.out.println("La cantidad de consonantes es: " + nconsonantes);
	
		char vocales[] = new char[nvocales];
		char consonantes[] = new char [nconsonantes];
	}
}
		

