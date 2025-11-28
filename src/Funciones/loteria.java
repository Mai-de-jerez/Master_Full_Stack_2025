package Funciones;
import java.util.Random;
import java.util.Scanner;

	public class loteria {
		/**
		 * 
		 * @param sc
		 * @return
		 */
		public static int menu(Scanner sc) {

			System.out.println("\n===== Lotería Primitiva =====");
	        System.out.println("1. Generar sorteo");
	        System.out.println("2. Participar (introducir mi apuesta)");
	        System.out.println("3. Jugar (comprobar aciertos)");
	        System.out.println("4. Salir");
	        System.out.print("Elige una opción: ");
	        
	        return sc.nextInt();
		
		}
		
		
		public static void generarSorteo(int[] sorteo) {		
			
			Random aleatorio = new Random();
			int num;
			for(int i= 0; i< sorteo.length; i++) {
				
				
				do {
					num = aleatorio.nextInt(8)+1;
	
				}while(repetido(sorteo, num));
				
				sorteo[i] = num;
				
			}
		
		}
	 	
		public static boolean repetido(int[] sorteo,int num) {
			
			boolean ok = false;
			for(int i = 0; i<sorteo.length; i++ ) {
				
				if(sorteo[i] == num){
					ok = true;
				}
				
			}
			
			return ok;
		}

		
		public static void imprimeSorteo(int[] sorteo) {
			
			for(int i=0; i<sorteo.length;i++) {
				
				System.out.print(" "+ sorteo[i]);
			}
			
			System.out.println("");
			
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] sorteo = new int[7];
			int[] jugada = new int[7];
			
			
			 int opcion;
			do {
				
	         opcion = menu(sc);
	         
	         switch (opcion) {
			case 1:
			
				generarSorteo(sorteo);
				imprimeSorteo(sorteo);
				break;

			default:
				break;
			}
	         
	         
			
			}while(opcion != 4);
	        
	        System.out.println("Fin del programa");
	        
	        
			// A terminar con Antonio
		}
			

	}