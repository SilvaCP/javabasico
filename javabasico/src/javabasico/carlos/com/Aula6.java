/**
 * Tipos primitivos e manipulação de dados.
 */
package javabasico.carlos.com;

public class Aula6 {
	public static void main(String[] args) {
		String valor = "30";
		Integer idade = Integer.parseInt(valor);
		System.out.println(idade);
		
		String valor2 = "1.80"; 
		float altura = Float.parseFloat(valor2);
		System.out.printf("Altura é %.4f \n",altura);
		
		System.out.println("Modifiquei essa linha de código, fiz isso in home.");
	}

}
