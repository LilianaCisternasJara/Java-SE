import java.util.Scanner;

public class sueldosLiquidosFor {

	public static void main(String[] args) {
		int op, contOperaciones, contMenores, contMayores;
		float sLiquido, desc, sBruto, acumSueldos;
				
				Scanner leer = new Scanner(System.in);
				
				contOperaciones = 0;
				acumSueldos = 0;
				contMayores = 0;
				contMenores = 0;
				
				op = 0;
				
			for(int cont = 1; cont<=2; cont++) {
				System.out.println("Menú");
				System.out.println("Presione 1 para calcular sueldo");
				System.out.println("Presione 2 para salir");
				
				op = leer.nextInt();
				
				switch (op) {
				case 1: System.out.println("Ingrese sueldo bruto");
				sBruto = leer.nextInt();
				System.out.println("Ingrese porcentaje de descuento");
				desc = leer.nextFloat();
				
				sLiquido = sBruto * (1 - (desc/100));
				System.out.println("El sueldo líquido es " + " $ " + sLiquido);
				
				contOperaciones = contOperaciones + 1;
				acumSueldos = acumSueldos + sLiquido;
				
				if(sLiquido<450000) {
					contMenores = contMenores + 1;
				}
				else {
					contMayores = contMayores + 1;
				}
				break;
				
				case 2: System.out.println("Operaciones realizadas " + contOperaciones);
				System.out.println("Total sueldos líquidos calculados: " + acumSueldos);
				System.out.println("Sueldos líquidos menores a $450000: " + contMenores);
				System.out.println("Sueldos líquidos mayores o iguales a $450000: " + contMayores);
				System.out.println("Programa finalizado");
				break;
				default: System.out.println("Opción inválida, presione 1 o 2");
				}
			}

	}

}
