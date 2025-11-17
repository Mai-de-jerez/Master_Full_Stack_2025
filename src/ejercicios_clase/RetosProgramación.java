package ejercicios_clase;
import java.util.Random;
import java.util.Scanner;



public class RetosProgramación {

	public static void main(String[] args) {
		
		// RETO 1: ENTRADA-SALIDA DATOS POR CONSOLA
		
		// Ejercicio único
		
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Dime tu nombre:");
        String nombre = scanner.nextLine();
        System.out.println("En que año estamos:"); 
        int anio = scanner.nextInt();
        scanner.nextLine(); // vaciar el buffer
        System.out.println("Dime tu lenguaje de programación preferido:");
        String lenguaje = scanner.nextLine();
        System.out.println("Hola " + nombre + " en este año " + anio + " serás un/a gran programador/a en " + lenguaje);
       
        System.out.print("\n---------------------------------------------------------------------------\n");
        
        // RETO 2: CONDICIONALES
        
        // Ejercicio 1: 
        
 		System.out.println("Dime una edad entre 0 y 100 :");
 		int edad = scanner.nextInt();
 		int resto = 100 - edad;
 		if (edad<18) {
 			System.out.println("Eres menor de edad, te faltan " + resto + " años para llegar al siglo.");
 		}else{
 			System.out.println("Eres mayor de edad, te faltan " + resto + " años para llegar al siglo.");
 		}
 		
 		System.out.print("\n---------------------------------------------------------------------------\n");
 		
 		// Ejercicio 2:
 		
		System.out.println("Dime los bits de la consola :");
		int bits = scanner.nextInt();
		if (bits == 1) {
			System.out.println("Ese tipo de consolas se crearón entre 1972 y 1983.");
		} else if (bits == 4){
			System.out.println("Ese tipo de consolas se crearón entre 1976 y 1992.");
		} else if (bits == 8){
			System.out.println("Ese tipo de consolas se crearón entre 1983 y 1988.");
		} else if (bits == 16){
			System.out.println("Ese tipo de consolas se crearón entre 1987 y 2003.");
		} else if (bits == 32){
			System.out.println("Ese tipo de consolas se crearón entre 1993 y 2006.");
		} else if (bits == 128){
			System.out.println("Ese tipo de consolas se crearón entre 1998 hasta el dia de hoy");
	    } else {
	    	System.out.println("No existen consolas de "+ bits + " bits.");
	    }
		
		System.out.print("\n---------------------------------------------------------------------------\n");
		
		// Ejercicio 3: (usar switch case)	
		
		System.out.println("¿En qué año nació o nacerá? :");
		int nacimiento = scanner.nextInt();
		switch (nacimiento) {
	    // Caso de la Rata 
	    case 1984:
	    case 1996:
	    case 2008:
	    case 2020:
	        System.out.println("Tu signo es una Rata.");
	        break; 
	        
	    // Caso del Buey
	    case 1985:
	    case 1997:
	    case 2009:
	    case 2021:
	        System.out.println("Tu signo es un Buey.");
	        break;
	        
	    // Caso del Tigre
	    case 1986:
	    case 1998:
	    case 2010:
	    case 2022:
	        System.out.println("Tu signo es un Tigre.");
	        break;
	        
	    // Caso del Buey
	    case 1987:
	    case 1999:
	    case 2011:
	    case 2023:
	        System.out.println("Tu signo es un conejo.");
	        break;
	    
	        
	    // Caso del Dragón
	    case 1988:
	    case 2000:
	    case 2012:
	    case 2024:
	        System.out.println("Tu signo es un dragón.");
	        break;
	    
	        
	    // Caso de la Serpiente
	    case 1989:
	    case 2001:
	    case 2013:
	    case 2025:
	        System.out.println("Tu signo es una serpiente.");
	        break;
	        
	    // Caso del caballo
	    case 1990:
	    case 2002:
	    case 2014:
	    case 2026:
	        System.out.println("Tu signo es un caballo.");
	        break;
	        
	    // Caso de la cabra
	    case 1991:
	    case 2003:
	    case 2015:
	    case 2027:
	        System.out.println("Tu signo es una cabra.");
	        break;
	        
        // Caso del Mono
   	    case 1992:
   	    case 2004:
   	    case 2016:
   	    case 2028:
   	        System.out.println("Tu signo es un mono.");
   	        break;
   	        
		// Caso del Gallo
	    case 1993:
	    case 2005:
	    case 2017:
	    case 2029:
	        System.out.println("Tu signo es un gallo.");
	        break;
	        
	     // Caso del Perro
   	    case 1994:
   	    case 2006:
   	    case 2018:
   	    case 2030:
   	        System.out.println("Tu signo es un perro.");
   	        break;
   	        
   	    // Caso del Cerdo
   	    case 1995:
   	    case 2007:
   	    case 2019:
   	    case 2031:
   	        System.out.println("Tu signo es un cerdo.");
   	        break;        
    
	    default:
	        System.out.println("Año no listado o fuera de rango.");
	        break;
		}	    		
		
				 		
		System.out.print("\n---------------------------------------------------------------------------\n");
        
		// RETO 3 (PARTE 1): BUCLES
		
		// Ejercicio 1: Imprimir números del 0 al 10
		
		for (int i=0;i<=10;i++) {	 
		System.out.println(i);		
		}
		 
		System.out.print("\n---------------------------------------------------------------------------\n");
		
		// Ejercicio 2: Cuenta del 100 al 0 de diez en diez hacia atrás.
		
		for (int i=100;i>=0;i-=10) {
		System.out.println(i);	
		}
		System.out.println("Máquina hackeada");
		
		System.out.print("\n---------------------------------------------------------------------------\n");
        
		// Ejercicio 3: Realiza un algoritmo que simule una caja registradora de un supermercado, 
		// donde va pidiendo cantidades y las va sumando, 
		// cada vez que pongamos una cantidad por la terminal saldra la suma acumulada del total.
		// El programa dejara de pedir las cantidades de compra cuando insertemos un 0. 
		// En ese momento mostrara el total de la compra y nos pedira que le indiquemos con cuanto dinero nos pagan 
		// e indicara el cambio que debemos devolver.
         System.out.println("\n--CAJA REGISTRADORA--");
		 float total = 0.0f;
		 float monto; 
		 float pago;
		 float cambio;

		 do {
			 System.out.print("\nIntroduce la cantidad (0 para finalizar): ");
		     monto = scanner.nextFloat();
		     while (monto < 0) {
                System.out.print("\nLos montos no pueden ser negativos. Vuelve a intentarlo: ");
                monto = scanner.nextFloat(); 		                   
            }

            if (monto != 0) {
                total += monto;
                System.out.printf("\nSuma acumulada: %.2f\n", total);
            }
		                  
	     } while (monto != 0);
		
		 if (total == 0.0f) {
		     System.out.println("\nCompra vacía. ¡Hasta pronto!");
		     
		 } else {
			 System.out.printf("\nTotal a pagar: %.2f\n", total); 
			 		
			 do {
			     System.out.print("\nIntroduce la cantidad con la que pagarás: ");
			     pago = scanner.nextFloat();
			
			     if (pago < total) {
			         System.out.printf("\n¡Pago insuficiente! La cantidad ingresada (%.2f) es menor que el total (%.2f).\n", pago, total);
			         System.out.println("\nVuelve a ingresar una cantidad válida.");
			     }
			
			     
			 } while (pago < total); 
			 
			 cambio = pago - total;
			 System.out.printf("\n✔️ Pago Aceptado.\n");
			 System.out.printf("\nCambio a devolver: %.2f\n", cambio);
	        }
			 
			 System.out.print("\n---------------------------------------------------------------------------\n");
			 
		 
		 
		// Ejercicio 4: Dibujar una piramide de asteriscos cuya cantidad de filas dependan del número dado por el usuario

	    System.out.print("Introduce un número entero POSITIVO para la altura de la pirámide: ");
	    int altura = scanner.nextInt();
	    
	    while (altura <= 0) { 
	    	System.out.print("La altura debe ser un número positivo mayor que 0. Inténtalo de nuevo: ");
	    	altura = scanner.nextInt();
	        }	
	    
	    System.out.println();

	    String asteriscos = ""; 
	    int x = 1; 
	    
	    while (x <= altura) {
	    	
	        asteriscos += "*"; 
	        System.out.println(asteriscos);
	        
	        x++; 
	    }
	   
	    System.out.print("\n---------------------------------------------------------------------------\n");
	  		
        
        // Ejercicio 5: Crea un programa en Java que muestre el siguiente patrón usando **dos bucles `for` anidados**:
        // 1. Crea una clase llamada `PatronDel5al1`.
        // 2. Dentro del método `main`, utiliza un primer bucle `for` para controlar las filas, que empiece en 5 y termine en 1.
        // 3. Dentro de ese bucle, usa otro `for` que empiece en el valor de la fila y baje hasta 1.
        // 4. Después del bucle interno, imprime un salto de línea (`System.out.println()`).
        int filas = 5;
        for (int i = filas; i >= 1; i--) {
            
        	for (int j = i; j >= 1; j--) {
                
        		System.out.print(j);
            }  
            System.out.println();
        
        	}
        System.out.println("\n-------------------------------------------------------------\n");
        
        // RETO 3 (PARTE 2): BUCLES
        
        // Ejercicio 1: EL RECUENTO DEL LOTE
        // Walter White y Jesse Pinkman han cocinado **1000 pastillas de "mentaanfetamienta"** en su caravana.
        // Cada pastilla tiene una **calidad aleatoria entre 0 y 100**.
        // El “señor del pollo” (Gus Fring) solo acepta aquellas con **calidad mayor o igual que 90**.
        // Calcular cuántas pastillas tienen una calidad superior a 90.
        // Usa `Random` para generar números del 0 al 100.
        // Usa un `for` para simular las 1000 pastillas.
        // Usa un contador para las “buenas”.
        
        int pastillas =1000;
        int pastillasValidas = 0;
        for (int i = 1; i<= pastillas; i++) {
        	int calidad = random.nextInt(101);
        	if (calidad > 90) {
        		pastillasValidas++;
        	}
        }
        
        System.out.println("Pastillas totales: "+pastillas);
        System.out.println("De calidad superior: "+pastillasValidas);
        System.out.println("\n-------------------------------------------------------------\n");
        
        
        
        // Ejercicio 2: HASTA LOGRAR LA RECETA PERFECTA
        // Walter repite la cocción hasta que consiga **una pastilla con calidad 100**.
        // Genera números aleatorios entre 0 y 100.
        // Detén el bucle cuando salga 100.
        // Muestra cuántos intentos necesitó.
        
        int calidad = 0;
        int numintentos = 0;
        while (calidad != 100) {
        	calidad = random.nextInt(101);
        	numintentos++;     	
        }
        
        System.out.println("¡Perfecta! Calidad 100 obtenida tras "+numintentos+" intentos."); 
        System.out.println("\n-------------------------------------------------------------\n");
        
        
        // Ejercicio 3: LA PRODUCCIÓN NOCTURNA
        // Walter y Jesse producen pastillas hasta llegar a **1000 unidades buenas (≥90)**.
        // Muestra cuántas totales han hecho (incluyendo las malas).
        int pastillasbuenas = 0;
        int pastillastotales = 0;
        while (pastillasbuenas < 1000) {
        	pastillastotales++;
        	int calidadPastilla = random.nextInt(101);
        	if (calidadPastilla >= 90) {
        		pastillasbuenas++;
        	}
        }
        
        System.out.println("\nPara conseguir 1000 pastillas buenas, produjeron un total de "+pastillastotales);
        System.out.println("\n-------------------------------------------------------------\n");
        
        
        // Ejercicio 4: EL ANÁLISIS POR LOTES
        // Dividir la producción en 10 lotes de 100 pastillas y mostrar cuántas buenas hay en cada lote.
        int numLotes = 10;
        int pastillasPorLote = 100;
        System.out.println("--- ANÁLISIS POR LOTES ---");
        for (int i = 1; i <= numLotes; i++) {
        	int pastillasbuenasporlote = 0;
        	for (int j= 1; j<=pastillasPorLote; j++) {
        		int buenas = random.nextInt(101);
        		if (buenas >= 90) {
            		pastillasbuenasporlote++;
            	}  		     		
        	}
        	
        	System.out.println("\nLote " +i+ "-> "+pastillasbuenasporlote+" pastillas buenas."); 
        }
        
        System.out.println("\n-------------------------------------------------------------\n");
        
        
        
        // Ejercicio 5: PROMEDIO DE CALIDAD
        
        // Calcular el promedio total de calidad de las 1000 pastillas.
        
        int pastis =1000;
        double sumapromedios = 0.0;
        for (int i = 1; i<= pastis; i++) {
        	int calidades = random.nextInt(101);
        	sumapromedios += calidades;
        	
        }
        
        double calidadPromedio = sumapromedios /1000;
        System.out.printf("\nPromedio de calidad general: %.2f\n",calidadPromedio);
        System.out.println("\n-------------------------------------------------------------\n");
        
        
        // Ejercicio 6: LA INSPECCIÓN DE GUS FRING
        //  Genera pastillas hasta tener 500 buenas, pero cada vez que salgan 50 malas seguidas, muestra:
        // 🔥 Gus Fring sospecha del laboratorio...
        
        int pastisbuenas = 0;
        int pastistotales = 0;
        int malasConsecutivas = 0;
        
   
        while (pastisbuenas < 500) {
            pastistotales++; 
            int calidadPastis = random.nextInt(101);
            
            if (calidadPastis >= 90) {
                pastisbuenas++;
                malasConsecutivas = 0; // Reiniciamos porque significa que no llegó nunca a 50 la racha.
                
            } else {
                malasConsecutivas++; 
     
                if (malasConsecutivas == 50) {
                    System.out.println("\n🔥 Gus Fring sospecha del laboratorio... (Pastillas totales: " + pastistotales + ")");
       
                    malasConsecutivas = 0; // Otra vez se reinicia para volver a contar racha de malas consecutivas.
                }
            }
        }
  
        System.out.println("\n--- OBJETIVO CUMPLIDO ---");
        System.out.println("Total de pastillas buenas conseguidas: " + pastisbuenas);
        System.out.println("Total de pastillas producidas (buenas y malas): " + pastistotales);
        System.out.println("\n-------------------------------------------------------------\n");
        
        // RETO 3 (PARTE 2): BUCLES Y ARRAYS
        // EJERCICIO 1: Elliot vs Evil Corp
        
        System.out.println("\n--- Elliot vs Evil Corp ---\n");
        
        // Elliot ha interceptado una lista con los balances de *Evil Corp*.
        // Con el siguiente array: int[] balances = {12000, -50, 5000, 15000, 0, -300, 800, 22000, 9999, 100};
        // Muestra:
		//        	- Cuántas cuentas tienen saldo negativo.
		//        	- Cuántas tienen saldo superior a 10 000 $.
		//        	- El saldo medio.
        
        int[] balances = {12000, -50, 5000, 15000, 0, -300, 800, 22000, 9999, 100};
        int sumanegativos=0;
        int sumasuperior=0;
        double sumamedia=0;
        for (int i=0;i<balances.length;i++) {
        	sumamedia+=balances[i];
        	if(balances[i]<0) {
        		sumanegativos++;
        	}
        	if (balances[i]>10000) {
        		sumasuperior++;
        	}

        }
        double media = sumamedia/balances.length;
        System.out.println("Hay en total: "+sumanegativos+" saldos negativos y "+sumasuperior+" saldos superiores a 10000€.");
        System.out.println("El sueldo medio es:  "+media);
        System.out.println("\n-------------------------------------------------------------\n");
        
        // EJERCICIO 2: Backdoor Scanner
        
        System.out.println("\n--- Backdoor Scanner ---\n");
        // Darlene analiza si los servidores de Evil Corp están vulnerables.
        // Usa el siguiente array:  boolean[] vulnerables = {false, true, false, false, true, false, true, false};
        // Muestra: Cuántos servidores son vulnerables (`true`) Y en qué posiciones están.
        boolean[] vulnerables = {false, true, false, false, true, false, true, false};
        int sumavulnerables=0;
        
        for (int i=0;i<vulnerables.length;i++) {
        	if(vulnerables[i] == true) {
        		sumavulnerables++;
        		System.out.println("En la posición: "+i);
        		
        	}
     
        }
        System.out.println("\nHay "+sumavulnerables+" servidores vulnerables");	
  
        System.out.println("\n-------------------------------------------------------------\n");
        
        // EJERCICIO 3: Password Audit
        System.out.println("\n--Password Audit--\n");
        // Elliot encuentra las siguientes contraseñas antiguas de Evil Corp:
        // String[] passwords = {"admin123", "e@mpl3", "supersecure99", "pass", "root@2020"};
        // Cuántas contienen el carácter `@`.
        // Cuántas tienen más de 8 caracteres.
        // Cuántas terminan en un número.
        // Cuál es la más larga.	
        String[] passwords = {"admin123", "e@mpl3", "supersecure99", "pass", "root@2020"};
        int sumarrobas =0;
        int sumalargas=0;
        int sumanumeros=0;
        String masLarga = passwords[0]; // admin123 la más larga de momento
        
        for (int i=0; i<passwords.length;i++) {
        	if (passwords[i].contains("@")) {
        		sumarrobas++;
        	}
        	if (passwords[i].length() > 8) {
        		sumalargas++;
        	}
        	
        	int ultimoIndice = passwords[i].length() - 1;
        	
        	if (Character.isDigit(passwords[i].charAt(ultimoIndice))) {
        		sumanumeros++;
        	}
        	
        	if (passwords[i].length() > masLarga.length()) {
                masLarga = passwords[i];
            }
        	
        }
        System.out.println("Hay "+sumarrobas+ " contraseñas que contienen arrobas, "+sumalargas+" que contienen más de 8 caracteres, y "
        +sumanumeros+" que acaban en un número. \nLa contraseña más larga es: "+masLarga);
        scanner.close();
        
        System.out.println("\n-------------------------------------------------------------\n");
        
        // EJERCICIO 4: Hack the Gibson
        System.out.println("\n--Hack the Gibson--\n");
        // Simula los niveles de éxito de los ataques de Elliot con el siguiente array:
        int[] intentos = {82, 13, 45, 79, 90, 5, 33, 72, 18, 65, 40, 100, 29, 10, 67, 55, 88, 60, 14, 3};
        // Muestra: 
        // - El valor máximo y el mínimo.
        // - Cuántos intentos fueron “exitosos” (más de 70).
        // - Si todos son menores de 30, muestra “Mr Robot sospecha que estás desconectado”.
  
        int maximo = intentos[0]; 
        int minimo = intentos[0];
        int exitosos = 0;
        int contadormenoresde30 = 0;
		for(int i = 0; i<intentos.length;i++) {
			maximo = Math.max(intentos[i],maximo);
			minimo = Math.min(intentos[i],minimo);
			if (intentos[i] > 70) {
				exitosos++;
			}
			if (intentos[i] < 30) {
				contadormenoresde30++;
			}
		}
		
		
		System.out.println("\nEl máximo de intentos fueron "+maximo+" intentos, y el mínimo de intentos fueron "+minimo+" intentos.");
		System.out.println("\nEl número de intentos exitosos fueron: "+exitosos);
		if (contadormenoresde30==intentos.length) {
	    	System.out.println("\nMr Robot sospecha que estás desconectado.");
	    }
		
		System.out.println("\n-------------------------------------------------------------\n");
		
		// EJERCICIO 5: Logs del Servidor
		System.out.println("\n--Logs del Servidor--\n");
		// Angela revisa los registros de acceso de un servidor:
		String[] logs = {"OK", "ERROR", "OK", "OK", "ERROR", "OK", "ERROR", "ERROR", "OK", "OK"};
		// Cuenta:
		// - Cuántos accesos fueron `"OK"`.
		// - Cuántos `"ERROR"`.
		// - Si hay más errores que accesos correctos, muestra “Servidor en peligro”.
		int sumaOK = 0;
		int sumaERROR = 0;
		for(int i=0; i < logs.length;i++) {
			if (logs[i].equals("ERROR")) {
				sumaERROR++;
			} else {
				sumaOK++;
			}	
		}
		
		System.out.println("Hay "+sumaERROR+ " accesos fallidos y "+sumaOK+" accesos exitosos.");
		
		if(sumaERROR>sumaOK) {
			System.out.println("Servidor en peligro.");
		}
		System.out.println("\n-------------------------------------------------------------\n");
		
        
		// EJERCICIO 6: Temperaturas del Servidor
		System.out.println("\n--Temperaturas del Servidor--\n");
		// Durante un ataque, Elliot monitoriza las temperaturas del servidor:
		int[] temperaturas = {45, 49, 52, 57, 60, 59, 55, 48, 46, 50};
		// Calcula:
		// - La temperatura media.
		// - Cuántas mediciones superan los 55 °C.
		// - Si todas las temperaturas están por debajo de 60 °C, muestra “Sistema estable”; si alguna es 60 o más, 
		// muestra “¡Sobrecalentamiento detectado!”.
		double sumatemperaturas = 0;
		int masde55 = 0;
		int debajode60 = 0;
		for(int i =0; i < temperaturas.length;i++) {
			sumatemperaturas+=temperaturas[i];
			if (temperaturas[i]>55) {
				masde55++;
			}
			
			if (temperaturas[i]<60) {
				debajode60++;
			}
			
		}
		
		double mediatemperaturas = sumatemperaturas/temperaturas.length;
		System.out.println("\nLa temperatura media es: "+mediatemperaturas);
		System.out.println("\nHay "+masde55+ " mediciones que superan los 55 grados."); 
		if (debajode60 == temperaturas.length) {
			System.out.println("\nSistema estable.");
		} else {
			System.out.println("\n¡Sobrecalentamiento detectado!");
		}
		
		System.out.println("\n-------------------------------------------------------------\n");
		
		
        
        // EJERCICIO 7: DDoS Simulator
        System.out.println("\n--DDoS Simulator--");
        // Durante un ataque DDoS, se registran los siguientes tiempos de respuesta (en ms):
        int[] tiempos = {200, 540, 720, 150, 950, 330, 480, 510, 870, 610};
        // Muestra:
        // - La media, el máximo y el mínimo.
        // - Si más del 60 % supera los 500 ms, muestra “Servidor saturado”.
        // - Si menos del 10 % supera los 200 ms, muestra “Ataque fallido”.
        double totales =0;
        int max = tiempos[0]; 
        int min = tiempos[0];
        double sesentaPorCiento = tiempos.length * 0.6;
        double diezPorCiento = tiempos.length * 0.1;
        int masde500 = 0;
        int masde200 = 0;
        
        for (int i=0; i<tiempos.length;i++) {
        	totales += tiempos[i];
        	max = Math.max(tiempos[i],max);
			min = Math.min(tiempos[i],min);
			 
			if (tiempos[i]>500) {
				masde500++;
			}
			if (tiempos[i]>200) {
				masde200++;
			}
        	     	
        }
        
        if (masde200<diezPorCiento) {
        	System.out.println("\nAtaque fallido");
        }
        
        if (masde500>sesentaPorCiento) {
        	System.out.println("\nServidor saturado");
        }
        
        double mediatiempos = totales/tiempos.length;
        System.out.println("\nMedia: "+mediatiempos+"\nMínimo: "+min+"\nMáxima: "+max);
        
        
        
	}

}
