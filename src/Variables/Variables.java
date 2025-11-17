package Variables;

public class Variables {

	public static void main(String[] args) {
		// declarar dos variables tipo int (números enteros) 
		int num1 = 3;
		int num2 = 6;		
		// tipo string
		String saludo ="Hola estoy aprendiendo Java y soy un string";
		// tipo float (decimal simple)
		float decimalsimple = 3.14f;
		// tipo double (decimal complejo)
		double decimalcomplejo = 3.1415;
		
		// booleana (valores true o false)
		boolean isTrue = true;
		char caracter = 'A';

		
		//imprimir suma de enteros, saludo y producto de float por double
		System.out.println("La suma de num1 y num2 es igual a: "+(num1 + num2));
		System.out.println(saludo);
		System.out.println("El producto de decimalsimple por decimalcomplejo es: "+decimalsimple * decimalcomplejo);
		System.out.println("Si negamos la variable booleana isTrue obtenemos: "+ !isTrue); // la negamos
		System.out.println("'A' + 1 sería en ASCII: "+ (caracter+1)); // podemos sumar numeros a char porque significan un número en ASCII
		// pero podemos hacer casting con (char) para que castee 66 a un char y entonces sea 'B'
		System.out.println("'A' + 1 sería en modo char: "+ (char)(caracter+1));

			}

		}