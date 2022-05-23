import java.util.Scanner;

public class SignoZodiacalSwitch {

	public static void main(String[] args) {
		int dia;
		int mes;
		int año;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese número de día en el que nació: ");
		dia = leer.nextInt();
		
		System.out.println("Ingrese número de mes de su nacimiento: ");
		mes = leer.nextInt();
		
		System.out.println("Ingrese su año de nacimiento: ");
		año = leer.nextInt();
		
		switch (mes) {
			case 1:
				if (dia>=1 && dia<=19) {
					System.out.println("Capricornio");
				}
				else if (dia>=20 && dia<=31) {
					System.out.println("Acuario");
				}
				else {
					System.out.println("Dato inválido");
				}				
				break;
				
			case 2: 
				if (dia>=1 && dia<=18) {
					System.out.println("Acuario");
				}
				else if (dia>=19 && dia<=28) {
					System.out.println("Piscis");
				}
				else {
					System.out.println("Dato inválido");
				}
				break;
			case 3:
				if(dia>=1 && dia<=20) {
					System.out.println("Piscis");
				}
				else if (dia>=21 && dia<=31) {
					System.out.println("Aries");
				}
				else {
					System.out.println("Dato inválido");
				}
				break;
			case 4:
				if (dia>=1 && dia<=19) {
					System.out.println("Aries");
				}
				else if (dia>=20 && dia<=30) {
					System.out.println("Tauro");
				}
				else {
					System.out.println("Dato inválido");
				}
				break;
			case 5:
				if (dia>=1 && dia<=21) {
					System.out.println("Tauro");
				}
				else if (dia>=22 && dia<=31) {
					System.out.println("Géminis");
				}
				else {
					System.out.println("Dato inválido");
				}
				break;
			case 6:
				if (dia>=1 && dia<=20) {
					System.out.println("Géminis");
				}
				else if (dia>=21 && dia<=30) {
					System.out.println("Cáncer");
				}
				else {
					System.out.println("Dato inválido");
				}
				break;
			case 7:
				if(dia>=1 && dia<=22) {
					System.out.println("Cáncer");
				}
				else if (dia>=23 && dia<=31) {
					System.out.println("Leo");
				}
				else {
					System.out.println("Dato inválido");
				}
				break;
			case 8:
				if(dia>=1 && dia<=22) {
					System.out.println("Leo");
				}
				else if (dia>=23 && dia<=31) {
					System.out.println("Virgo");
				}
				else {
					System.out.println("Dato inválido");
				}
				break;
			case 9:
				if (dia>=1 && dia<=22) {
					System.out.println("Virgo");
				}
				else if (dia>=23 && dia<=30) {
					System.out.println("Libra");
				}
				else {
					System.out.println("Dato inválido");
				}
				break;
			case 10:
				if (dia>=1 && dia<=22) {
					System.out.println("Libra");
				}
				else if (dia>=23 && dia<=31) {
					System.out.println("Escorpio");
				}
				else {
					System.out.println("Dato inválido");
				}
				break;
			case 11:
				if (dia>=1 && dia<=21) {
					System.out.println("Escorpio");
				}
				else if (dia>=22 && dia<=30) {
					System.out.println("Sagitario");
				}
				else {
					System.out.println("Dato inválido");
				}
				break;
			case 12:
				if (dia>=1 && dia<=21) {
					System.out.println("Sagitario");
				}
				else if (dia>=22 && dia<=31) {
					System.out.println("Capricornio");
				}
				else {
					System.out.println("Dato inválido");
				}
				break;
					}
		
		
		
		

	}

}
