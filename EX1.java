package ADO7;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class EX1 {
	
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	final String respostacorreta = "uma lingaguem dentro da tecnologia que ajuda a tornar a web divertida e util";
	
		ArrayList<String> alternativas = new ArrayList<String>();
		alternativas.add(respostacorreta);
		alternativas.add(" é um programa com uma xicara de café");
		alternativas.add(" é uma linguagem inútil");
		alternativas.add(" uma linguagem que nao ajuda a comprrender as outras linguagens");
		alternativas.add(" python é melhor ");
		
		
		Collections.shuffle(alternativas);
		
		
		
		boolean A = true;
		
		
	 
	
	do {

		
		
		System.out.println("o que é java ?:");
		System.out.println("1 - " + alternativas.get(0)); // resposta correta
		System.out.println("2 - " + alternativas.get(1));
		System.out.println("3 - " + alternativas.get(2));
		System.out.println("4 - " + alternativas.get(3));
		System.out.println("5 - " + alternativas.get(4));
		
		int respostas = entrada.nextInt();
		
		
		switch (alternativas.get(respostas - 1)){
				
				case respostacorreta:
					
					System.out.println("Resposta CORRETA !");
					
					break;
					default: System.out.println("Resposta invalida");
					
					
		
	
		}
	
	
	} while (A);
	
	  entrada.close();

		}
}

