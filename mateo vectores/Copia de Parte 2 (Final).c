
#include <stdio.h>

int i;

int main(){ //						Cambiar nombre a "parte2" 		¿Qué onda bb? ¿Cómo te trata la "vie"?
	
	int opcion, flag = 0;

		do{
			// Opciones y checkeo
			do{
				printf("\nQue operacion desea realizar?\n	1 - Suma\n	2 - Resta\n	3 - Multiplicacion de escalar por vector\n	4 - Productor escalar\n	5 - Producto vectorial\nOpcion: ");
				scanf("%d", &opcion);
			}while(opcion < 1 || opcion > 5);
			
			
			// Opciones de operaciones
			switch(opcion){
				case 1:				
				    suma();
				break;
					
				case 2:
					resta();
				break;
					
				case 3:
					multiplicacion();
				break;
					
				case 4:
					escalar();
				break;
					
				case 5:
					vectorial();
				break;
			}
				
			
			// checkeo de retorno a operaciones
			do{
				printf("\n\nQue desea hacer?\n     1 - Nueva operacion\n     2 - Salir\nOpcion: ");
				scanf("%d", &flag);
				
			}while(flag < 1 || flag > 2);
			
		}while(flag == 1);
		
	return 0;
}

// --------------- FUNCIONES DE LAS OPERACIONES ----------------
// -------------------------------------------------------- SUMA
int suma(){
	
	//-------------------Variables
		int primera_longitud = 0, segunda_longitud = 0;
	
	//------------------Ingreso de datos
		printf("\nIngrese los dos tamanios para los vectores:\n");
		printf("Ingrese el tamanio del primero: ");
		scanf("%d", &primera_longitud);
		
		while(primera_longitud < 0){
			printf("Ingrese un valor positivo: \n");
			scanf("%d", &primera_longitud);
		}
		
		printf("Ingrese el tamanio del segundo: ");
		scanf("%d", &segunda_longitud);
		
		while(segunda_longitud < 0){
			printf("Ingrese un valor positivo: \n");
			scanf("%d", &segunda_longitud);
		}
	
		int primer_vector[primera_longitud];
		int segundo_vector[segunda_longitud];
		int auxiliar[primera_longitud + segunda_longitud];
		
		/*
		p_primer_vector = &primer_vector;
		p_segundo_vector = &segundo_vector;
		p_auxiliar = &auxiliar;
		*/
		
		//---------------------Ingreso de valores
		printf("\nIngrese los valores para el primer vector:\n");
		for(i=0; i<primera_longitud; i++){
			printf("Ingrese el valor para la posicion %d: ", i+1);
			scanf("%d", &primer_vector[i]);
		}
		
		printf("\nIngrese los valores para el segundo vector:\n");
		for(i=0; i<segunda_longitud; i++){
			printf("Ingrese el valor para la posicion %d: ", i+1);
			scanf("%d", &segundo_vector[i]);
		}
		
	// -------------------------------------------------------------------	
		
	int longitud_aux = primera_longitud + segunda_longitud;	
    int *resultado = (int*) malloc(sizeof(int) * longitud_aux);

	//Determinamos la mayor longitud
    if(primera_longitud > segunda_longitud){
    	
		int mayor_longitud = primera_longitud;
		
		//Hacemos la suma. Si i en algun vector es nulo, se coloca en el resultado el valor del que si existe.
		for(i = 0; i < mayor_longitud; i++){
			
			if(i < segunda_longitud){
				resultado[i] = primer_vector[i] + segundo_vector[i];
			} else {
				resultado[i] = primer_vector[i];
			}
			
		}
		
		//Imprimimos el resultado
		printf("\nResultado: (");
	    for (i = 0; i < mayor_longitud; i++){
	    		printf(" %d ", resultado[i]);
		}
		printf(")");
		
    } else {
   		int mayor_longitud = segunda_longitud;
   		
   		for(i = 0; i < mayor_longitud; i++){
			
			if(i < primera_longitud){
				resultado[i] = primer_vector[i] + segundo_vector[i];
			} else {
				resultado[i] = segundo_vector[i];
			}
			
		}
		
		printf("\nResultado: (");
	    for (i = 0; i < mayor_longitud; i++){
	    		printf(" %d ", resultado[i]);
		}
		printf(")");
    }
    
    
    
    *primer_vector = *resultado;
    
    return *resultado;
    //free(resultado);
}


// -------------------------------------------------------- RESTA
int resta(){
	
	//-------------------Variables
		int primera_longitud = 0, segunda_longitud = 0;
	
	//------------------Ingreso de datos
		printf("\nIngrese los dos tamanios para los vectores:\n");
		printf("Ingrese el tamanio del primero: ");
		scanf("%d", &primera_longitud);
		
		while(primera_longitud < 0){
			printf("Ingrese un valor positivo: \n");
			scanf("%d", &primera_longitud);
		}
		
		printf("Ingrese el tamanio del segundo: ");
		scanf("%d", &segunda_longitud);
		
		while(segunda_longitud < 0){
			printf("Ingrese un valor positivo: \n");
			scanf("%d", &segunda_longitud);
		}
	
		int primer_vector[primera_longitud];
		int segundo_vector[segunda_longitud];
		int auxiliar[primera_longitud + segunda_longitud];
		
		/*
		p_primer_vector = &primer_vector;
		p_segundo_vector = &segundo_vector;
		p_auxiliar = &auxiliar;
		*/
		
		//---------------------Ingreso de valores
		printf("\nIngrese los valores para el primer vector:\n");
		for(i=0; i<primera_longitud; i++){
			printf("Ingrese el valor para la posicion %d: ", i+1);
			scanf("%d", &primer_vector[i]);
		}
		
		printf("\nIngrese los valores para el segundo vector:\n");
		for(i=0; i<segunda_longitud; i++){
			printf("Ingrese el valor para la posicion %d: ", i+1);
			scanf("%d", &segundo_vector[i]);
		}
		
	// -------------------------------------------------------------------	
		
	int longitud_aux = primera_longitud + segunda_longitud;	
    int *resultado = (int*) malloc(sizeof(int) * longitud_aux);

	//Determinamos la mayor longitud
    if(primera_longitud > segunda_longitud){
    	
		int mayor_longitud = primera_longitud;
		
		//Hacemos la suma. Si i en algun vector es nulo, se coloca en el resultado el valor del que si existe.
		for(i = 0; i < mayor_longitud; i++){
			
			if(i < segunda_longitud){
				resultado[i] = primer_vector[i] - segundo_vector[i];
			} else {
				resultado[i] = primer_vector[i];
			}
			
		}
		
		//Imprimimos el resultado		
		printf("\nResultado: (");
	    for (i = 0; i < mayor_longitud; i++){
	    		printf(" %d ", resultado[i]);
		}
		printf(")");
		
		
    } else {
   		int mayor_longitud = segunda_longitud;
   		
   		for(i = 0; i < mayor_longitud; i++){
			
			if(i < primera_longitud){
				resultado[i] = primer_vector[i] - segundo_vector[i];
			} else {
				resultado[i] = segundo_vector[i];
			}
			
		}
		
		printf("\nResultado: (");
	    for (i = 0; i < mayor_longitud; i++){
	    		printf(" %d ", resultado[i]);
		}
		printf(")");
    }
    
    
    
    *primer_vector = *resultado;
    
    return *resultado;
    //free(resultado);
}


// ---------------------------------------------- MULTIPLICLACION
int multiplicacion(){
	
	//-------------------Variables
		int primera_longitud = 0, escalar = 0;
	
	//------------------Ingreso de datos
		printf("\nIngrese el tamanio del vector: ");
		scanf("%d", &primera_longitud);
		
		while(primera_longitud < 0){
			printf("\nIngrese un valor positivo: \n");
			scanf("%d", &primera_longitud);
		}
		
	int primer_vector[primera_longitud];
		
	//---------------------Ingreso de valores
	    printf("\nIngrese los valores para el vector:\n");
		for(i=0; i<primera_longitud; i++){
			printf("Ingrese el valor para la posicion %d: ", i+1);
			scanf("%d", &primer_vector[i]);
		}
		
		printf("\nIngrese el numero escalar: ");
		scanf("%d", &escalar);
		
		while(escalar < 0){
			printf("\nIngrese un valor positivo: \n");
			scanf("%d", &escalar);
		}

		
	// -------------------------------------------------------------------	
		
    int *resultado = (int*) malloc(sizeof(int) * primera_longitud);
    
    for(i=0; i<primera_longitud; i++){
        
        resultado[i] = primer_vector[i] * escalar;
        
    }
    
    printf("\nResultado: (");
    for (i = 0; i < primera_longitud; i++){
    		printf(" %d ", resultado[i]);
	}
	printf(")");
    
    
    *primer_vector = *resultado;
    
    return *resultado;
    //free(resultado);
}


// ------------------------------------------------------ ESCALAR
int escalar(){
	
	//-------------------Variables
		int primera_longitud = 0;
	
	//------------------Ingreso de datos
		printf("\nIngrese el tamanio de los vectores: ");
		scanf("%d", &primera_longitud);
		
		while(primera_longitud < 0){
			printf("\nIngrese un valor positivo: \n");
			scanf("%d", &primera_longitud);
		}
		
	int primer_vector[primera_longitud];
	int segundo_vector[primera_longitud];
		
	//---------------------Ingreso de valores
	    printf("\nIngrese los valores para el primer vector:\n");
		for(i=0; i<primera_longitud; i++){
			printf("Ingrese el valor para la posicion %d: ", i+1);
			scanf("%d", &primer_vector[i]);
		}
		
		printf("\nIngrese los valores para el segundo vector:\n");
		for(i=0; i<primera_longitud; i++){
			printf("Ingrese el valor para la posicion %d: ", i+1);
			scanf("%d", &segundo_vector[i]);
		}

		
	// -------------------------------------------------------------------	
		
    int *resultado = (int*) malloc(sizeof(int) * primera_longitud);
    
    for(i=0; i<primera_longitud; i++){
        
        resultado[i] = primer_vector[i] * segundo_vector[i];
        
    }

    
    printf("\nResultado: (");
	for (i = 0; i < primera_longitud; i++){
	    	printf(" %d ", resultado[i]);
	}
	printf(")");
    
    
    *primer_vector = *resultado;
    
    return *resultado;
    //free(resultado);
}


// ---------------------------------------------------- VECTORIAL
int vectorial(){
	
	//-------------------Variables
	int primera_longitud = 3;
				
	int primer_vector[primera_longitud];
	int segundo_vector[primera_longitud];
		
	//---------------------Ingreso de valores
	    printf("\nIngrese 3 valores para el primer vector:\n");
		for(i=0; i<primera_longitud; i++){
			printf("Ingrese el valor para la posicion %d: ", i+1);
			scanf("%d", &primer_vector[i]);
		}
		
		printf("\nIngrese 3 valores para el segundo vector:\n");
		for(i=0; i<primera_longitud; i++){
			printf("Ingrese el valor para la posicion %d: ", i+1);
			scanf("%d", &segundo_vector[i]);
		}

		
	// -------------------------------------------------------------------	
		
    int *resultado = (int*) malloc(sizeof(int) * primera_longitud);
    
    resultado[0] = (primer_vector[1] * segundo_vector[2]) - (primer_vector[2] * segundo_vector[1]);
	resultado[1] = (primer_vector[2] * segundo_vector[0]) - (primer_vector[0] * segundo_vector[2]);
	resultado[2] = (primer_vector[0] * segundo_vector[1]) - (primer_vector[1] * segundo_vector[0]);

    printf("\nResultado: (");
	for (i = 0; i < primera_longitud; i++){
	    	printf(" %d ", resultado[i]);
	}
	printf(")");
	
    *primer_vector = *resultado;
    
    return *resultado;
    //free(resultado);
}












