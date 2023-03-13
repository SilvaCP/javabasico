/**
 * Operadores Aritméticos e Class Math
 */

package javabasico.carlos.com;

public class Aula7 {
	public static void main(String[] args) {

//		int n1 = 3;
//		int n2 = 5;
//		
//		float media = (n1 + n2)/2;
//		
//		System.out.println("A média é igual à: " + media);

//		int numero = 5;
//  	int valor = 5 + numero++;
//		System.out.println("Resultado do pós-incremento " + numero); //Resultado = 5  
//		System.out.println(valor); //Resultado = 10
//		int valor = 5 + ++numero; 	//Resultado 
//		System.out.println("Resultado do pré-incremento " + numero); //Resultado = 6	
//		System.out.println(valor);	//Resultado = 11

		/*
		 * int numero2 = 10; //int valor2 = 4 + numero--;
		 * System.out.println("Número2 = " + numero2); int valor2 = 4 + --numero2;
		 * System.out.println("Resultado do número2 pós o pré-incremento " + numero2);
		 * System.out.println("Resultado do valor2 " + valor2);
		 */

//		int x = 4;
//		x += 2; // x = x + 2
//		x *= 2;	// x = x * 2
//		System.out.println(x); 

//		float v = 8.3f;
//		int ar = (int)Math.floor(v);	// Arredondamento para baixo.
//		System.out.println(ar);

//		float v = 8.3f;
//		int ar = (int)Math.ceil(v);		// Arredondamento para cima.
//		System.out.println(ar);

//		float v = 8.5f;
//		int ar = (int)Math.round(v);
//		System.out.println(ar);

		double aleatorio = Math.random(); // Mostra um número aleatório.
//		System.out.println(aleatorio);		
		int num = (int) (15 + aleatorio * (20 - 15)); // Gera um número aleatório entre 15 e 60.
		System.out.println(num);

	}

}
