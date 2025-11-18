package Ejercicios;
import java.util.Scanner;


public class Para_Practicar {
	public static void main(String[] args) {
		System.out.println("--REPASO ARRAYS, CONDICIONALES, BUCLES, MATRICES.....--");
		Scanner lector = new Scanner(System.in);
		/*
		// Ejercicio 1
		System.out.println("--EJERCICIO 1: PARES O IMPARES--");
		int pares =0;
		int impares=0;
		int vueltas = 0;
		while (vueltas<5) { 
			System.out.println("Introduzca nuevo número: ");
			if (lector.hasNextInt()) { 
	            int num = lector.nextInt(); 
	            lector.nextLine();
            	if (num % 2==0) {
            		pares++;
            	}else {
            		impares++;
            	}
            	vueltas++;
	             
			} else {
				System.out.println("¡El número debe ser entero! Inténtelo de nuevo.");
		        lector.nextLine();
            }
	
		}
		
		System.out.println("Hay "+pares+" números pares y "+impares+" números impares.");
		System.out.println("\n--------------------------------------------------------------------------\n");
		
		System.out.println("--EJERCICIO 2: TEMPERATURA MEDIA--");
		double[] temperaturas = new double[7];
		double suma=0;
		for(int i=0; i<7; i++) {
			System.out.println("Introduzca nueva temperatura: ");
			if (lector.hasNextDouble()) { 
	            double cifra = lector.nextDouble(); 
	            lector.nextLine();        	
	            temperaturas[i]=cifra;
	            suma+=temperaturas[i];
			} else {
				System.out.println("¡Error! Introduzca un valor válido.");
		        lector.nextLine();
			}
		}
		
		double temperaturaMedia = suma/temperaturas.length;
		System.out.println("\nLa temperatura media es: "+temperaturaMedia);
		
		System.out.println("\n--------------------------------------------------------------------------\n");
		
		System.out.println("--EJERCICIO 3: MAYORES QUE 10--");
		int [][] matriz = {{5, 12, 8}, {15, 3, 20}, {7, 10, 18}};
		int contadorMayoresDiez = 0;
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[0].length; j++) {
				if (matriz[i][j]>10) {
					contadorMayoresDiez++;
				}
			}
		}
		System.out.println("Hay "+contadorMayoresDiez+" valores mayores que 10.");
		System.out.println("\n--------------------------------------------------------------------------\n");
		
		System.out.println("--EJERCICIO 4: EL VALIDADOR DE CONTRASEÑAS--");
		String contraseña ="";
		boolean esValida = false;
	
		do {
			boolean contieneDigito=false;
			System.out.println("Introduzca una contraseña: ");
			contraseña = lector.nextLine();
			
			for (int i = 0; i < contraseña.length(); i++) {
			    char caracter = contraseña.charAt(i); 
			    if (Character.isDigit(caracter)) { 
			        contieneDigito = true; 
			        break;                 
			    }
			}
			
			if (contraseña.length()<8) {
				System.out.println("La contraseña debe contener al menos 8 caracteres.");
			} else if (!contieneDigito) {
				System.out.println("La contraseña debe contener al menos un número.");
			} else if (contraseña.contains("secreto")) {
				System.out.println("La contraseña no debe contener la palabra secreto.");
			} else {
				esValida = true;
			}
			
		}
		while(!esValida);
		System.out.println("Contraseña creada.");
		
		System.out.println("\n--------------------------------------------------------------------------\n");
		
		System.out.println("--EJERCICIO 5: SUMA DE MATRICES--");
		int[][] matrizA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] matrizB = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
		int[][] matrizSuma = new int[3][3];
		for (int i=0; i<matrizA.length; i++) {
			for (int j=0; j<matrizA[0].length; j++) {
				matrizSuma[i][j]=matrizA[i][j]+matrizB[i][j];
			}
		}
		
		System.out.println(Arrays.deepToString(matrizSuma));
		System.out.println("\n--------------------------------------------------------------------------\n");
		*/
		
		System.out.println("--EJERCICIO 6: cálculo productos Almacén--");
		// 1. Declaración de la matriz 3x4 (Pisos x Estanterías)
        int[][] stockAlmacen = new int[3][4];
        int stockTotal = 0;
        int stockPisoCentral = 0;
        int stockEstanteria3 = 0;
        // 2. Rellenar la matriz y calcular el stock total
        for (int i = 0; i < 3; i++) { // Bucle para los pisos (filas)
            for (int j = 0; j < 4; j++) { // Bucle para las estanterías (columnas)
                // Rellenar con stock aleatorio (entre 10 y 50)
                stockAlmacen[i][j] = (int) (Math.random() * 41 + 10); 
                stockTotal += stockAlmacen[i][j];
                if (i == 1) {
                	stockPisoCentral += stockAlmacen[i][j];
				}
                if (j == 2) {
					stockEstanteria3 += stockAlmacen[i][j];	
                }
            }
        }
        
        // 3. Mostrar stock total
        System.out.println("--- Informe de Inventario ---");
        System.out.println("Stock Total en el almacén: " + stockTotal + " unidades.");
        System.out.println("Stock Total en el piso central: " + stockPisoCentral + " unidades.");
        System.out.println("Stock Total en la estantería 3: " + stockEstanteria3 + " unidades.");
        
		System.out.println("\n--------------------------------------------------------------------------\n");
        
		lector.close();
	}
}


