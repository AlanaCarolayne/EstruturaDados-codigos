package exercicio3;

import java.util.Scanner;

import aula1104.FilaInt;

public class main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	FilaInt fila = new FilaInt();
	fila.init();
	int opcao;
	do {
		System.out.println("1 -> inserir aluno na fila ");
		System.out.println("2 -> atender aluno");
		System.out.println("3 -> Encerrar atendimento");
		opcao = sc.nextInt();
		
		switch(opcao) {
		case 1: 
			System.out.println("Digite o rm do aluno");
			int rm = sc.nextInt();
			fila.enqueue(rm);
			break;
			
		case 2: 
			if(!fila.isEmpty()) {
				System.out.println("Aluno que sera atendido agora: " + fila.dequeue());
			}else {
				System.out.println("Não há alunos na fila");
			}
			break;
		case 3:
			if(fila.isEmpty()) {
				System.out.println("Atendimento encerrado");
			}else {
				System.out.println("Ainda ha alunos na fila ");
				opcao =0;
				
			}
			break;
			
		default: 
			System.out.println("Opcao invalida");
		}
		
		
	}while(opcao !=3);
	
	
	sc.close();
	
}
}
