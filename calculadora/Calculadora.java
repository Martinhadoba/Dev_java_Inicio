package com.dio.calculadora;

import java.util.Scanner;

class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float a,b;
		
		System.out.println ("Digite o primeiro n�mero");
		a = scan.nextInt();
		
		System.out.println ("Digite o segundo n�mero");
		b = scan.nextInt();
		
		float soma = soma (a,b);
		float subtracao = subtracao (a,b);
		float divisao = divisao(a,b);
		float multiplicacao = multiplicacao (a,b);	
		
		System.out.println("A soma dos n�meros �:" +soma);
		System.out.println("A subtra��o dos n�meros �:"+subtracao);
		System.out.println("A divis�o dos n�meros �:"+divisao);
		System.out.println("A multiplica��o dos n�meros �:" +multiplicacao);
	}
	


	public static float soma(float a, float b) {
		return a + b;
	}
	public static float subtracao(float a, float b) {
		return a - b;
	}
	
	public static float divisao(float a, float b) {
		return a / b;
	}
	public static float multiplicacao(float a, float b) {
		return a * b;
	}
	
}
