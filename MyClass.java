package br.com.proway.senior.teste;

import java.util.Arrays;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world!");
		
		String name = "Vanderlei";
		System.out.println();
		System.out.println("Primeiro nome: " + name); // Concatenação
		
		String nome, sobrenome; // crio duas variáveis e defino elas abaixo
		nome = "Vanderlei";
		sobrenome = "Kleinschmidt";
		
		System.out.println();
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome); // Nome e sobrenome em linhas separadas
		
		final String NOME4 = "Flamengo Campeão"; // Essa variável é final (por isso maiúscula) e não pode ser alterada
		System.out.println();
		System.out.println("Nome Final em letra maiúscula " + NOME4.toUpperCase() + "!!!");
		
		// Tipos Primitivos
		
		// 1. bytes (8 bit)
		
		byte a = 100;
		byte b = -50;
		System.out.println();
		System.out.println("Primeiro número: " + a + ", segundo número: " + b);
		
		// 2. short (16 bit)
		
		short s = 10000; // esse é o tamanho máximo
		short r = -20000; // esse é o tamanho máximo
		
		System.out.println();
		System.out.println("Short: " + "\ns = "+ s + "\nr = "+ r);
		
		// 3. int (32 bit)
		
		int c = 100000;
		int d = -2000000;
		
		System.out.println();
		System.out.println("Int: " + "\nc = "+ c + "\nd = "+ d);
		
		// 4. long (64 bit)
		
		long e = 1000000L;
		long f = -2000000L;
		
		System.out.println();
		System.out.println("Long: " + "\ne = "+ e + "\nf = "+ f);
		
		// 5. float (32 bit)
		
		float f1 = 234.5f;
		float f2 = -59.34f;
		
		System.out.println();
		System.out.println("Float: " + "\nf1 = "+ f1 + "\nf2 = "+ f2);
		
		// 6. double (64 bit)
		
		double d1 = 123.45;
		double d2 = -123.5;
		
		System.out.println();
		System.out.println("Double: " + "\nd1 = "+ d1 + "\nd2 = "+ d2);
		
		// 7. boolean (1 bit)
		
		boolean one = true;
		boolean zero = false;
		
		System.out.println();
		System.out.println("Boolean: " + "\none = "+ one + "\nzero = "+ zero);
		
		// 8. char (16 bit)
		
		char l1 = 'A';
		char l2 = 'b';
		
		System.out.println();
		System.out.println("Char: " + "\nl1 = "+ l1 + "\nl2 = "+ l2);
		
		// Tipos de dados não primitivos o compilador não entende de cara
		// Arrays
		// Conjunto fixo de elementos do mesmo tipo
		
		//Tipo[] nomeDaVariavel = new Tipo[tamanho];
		//Tipo[] nomeDaVAriavel = {'var1', 'var2', 'var3', 'var4'};
		
		char[] helloWorld = {'H', 'e', 'l', 'l', 'o'};
		System.out.println();
		System.out.println("Array 'helloWorld' = " + helloWorld);
		// O resultado da linha acima é: Array 'helloWorld' = [C@7a81197d
		// Para corrigir isso eu uso:
		System.out.println("Para corrigir isso eu converto pra String e uso o String.valueOf():");
		
		String charString = String.valueOf(helloWorld);
		System.out.println();		
		System.out.println("Array 'helloWorld' = " + charString);
		
		String[] alunoNome = new String[9];
		alunoNome = new String[]{"Arnaldo", "Branco", "Marcelo", "Nando", "Paulo", "Sérgio", "Tony", "Ciro", "André"};
		String charString1 = String.valueOf(alunoNome);
		System.out.println();
		System.out.println(charString1); // Para minha lista de alunos não funcionou o método acima
		
		System.out.println();
		System.out.println("Nomes: "+ Arrays.toString(alunoNome)); // Tive que usar essa solução
		
		// Arrays multidimensional
		// Construindo uma matriz de dimensão 5 x 5 (5 linhas e 5 colunas)

		System.out.println();
		char[][] matriz = new char[5][5];
		matriz[0][0] = 'a';
		matriz[0][1] = 'b';
		matriz[0][2] = 'c';
		matriz[0][3] = 'd';
		matriz[0][4] = 'e';
		matriz[1][0] = 'f';
		matriz[1][1] = 'g';
		matriz[1][2] = 'h';
		matriz[1][3] = 'i';
		matriz[1][4] = 'j';
		
		for(char[] linha: matriz) {
			for(char coluna: linha) {
				System.out.print(coluna); // Uso print e não println
				}
			System.out.print("\n");	// Uso print e não println
		}
				
		String[][] matriz1 = new String[5][5];
		for(byte i = 0; i < matriz1.length; i++) {
			int tamanho = matriz1[i].length;
			String[] linha1 = new String[tamanho];
			for(byte j = 0; j < linha1.length; j++) {
				String item = " item" + String.valueOf(i) + String.valueOf(j); // o espaço antes de item garante o espaço na matriz
				matriz1[i][j] = item;
			}
		}
		for(String[] linha1 : matriz1) {
			for(String coluna1 : linha1) {
				System.out.print(coluna1);
			}
			System.out.print("\n");
		}
//
		
		int i = 1;
		int j = 10;
		int res = i++;
		int resm = --j;
		System.out.println(res);
		System.out.println(resm);
		
		System.out.println();
		int k = 0;
		int l = 4;
		
		k += 2;
		l *= 2;
		
		System.out.println(k);
		System.out.println(l);

		System.out.println();
		
		String h = "AAA";
		h += "BBB";
		h += "\nCCC";
		System.out.println(h);
	}

}
