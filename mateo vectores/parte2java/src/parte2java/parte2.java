package parte2java;

import java.util.Scanner;

public class parte2 {
	public static void main(String[] args){
		
		// ---------------- PRINCIPAL
		Scanner scanner = new Scanner(System.in);
		
		// VARIABLES
		int opcion = 0;
		int flag = 0;
			
		do {
			do {
				System.out.print("\nQue operacion desea realizar?\n	1 - Suma\n	2 - Resta\n	3 - Multiplicacion de escalar por vector\n	4 - Productor escalar\n	5 - Producto vectorial\nOpcion: ");
				opcion = scanner.nextInt();
			} while(opcion < 1 || opcion > 5);
				
			switch(opcion) {
				case 1:
					//suma();
				break;
				case 2:
					//resta();
				break;
				case 3:
					//multiplicacion();
				break;
				case 4:
					//escalar();
				break;
				case 5:
					//vectorial();
				break;
			}
				
			// checkeo de retorno a operaciones
			do{
				System.out.print("\n\nQue desea hacer?\n     1 - Nueva operacion\n     2 - Salir\nOpcion: ");
				flag = scanner.nextInt();		
			}while(flag < 1 || flag > 2);
			
		} while(flag == 1);
	

		scanner.close();
	}
}

/*
		//---- FUNCIONES DE OPERACIONES ----
		// ----------------------------- SUMA
		public static int suma() {
			Scanner scanner = new Scanner(System.in);
			
			// Variables
			int primera_longitud = 0, segunda_longitud = 0;
			
			// Ingreso de datos
			System.out.println("Ingrese los dos tamanios de los vectores:");
			System.out.print("Ingrese el tamanio del primero: ");
			primera_longitud = scanner.nextInt();
			
			while(primera_longitud < 0) {
				System.out.print("Ingrese un valor positivo: ");
				primera_longitud = scanner.nextInt();
			}
			
			System.out.print("Ingrese el tamanio del segundo: ");
			segunda_longitud = scanner.nextInt();
			
			while(segunda_longitud < 0) {
				System.out.print("Ingrese un valor positivo: ");
				segunda_longitud = scanner.nextInt();
			}
			
			int primer_vector[];
			primer_vector = new int[primera_longitud];
			int segundo_vector[];
			segundo_vector = new int[segunda_longitud];
			
			for(int i=0; i<primer_vector.length; i++)
		    {
		        System.out.printf("Ingrese el valor %d: ", i+1);
		        primer_vector[i] = scanner.nextInt();
		    }
	
	
			scanner.close();
		}
*/	
