package exercicio2;

import java.util.Scanner;

import Fila.FilaInt;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FilaInt fila = new FilaInt();
		int opcao;
		do {
			System.out.println(" 1 - Submeter processo");
			System.out.println(" 2 - Executar processo (ocupa tempo processador)");
			System.out.println(" 3-  Shutdown");
			opcao = sc.nextInt();
			switch(opcao) {
			case 1:
				System.out.print("Informe PID do processo: ");
				int pid= sc.nextInt();
				fila.enqueue(pid);
				break;
			case 2:
				if (!fila.isEmpty()) {
					pid = fila.dequeue();
					System.out.println("Processo " + pid + " esta em excucao");
					System.out.print("Processo " + pid + " concluiu (1-sim): ");
					int resp = sc.nextInt();
					if (resp == 1)
						System.out.println("Processo " + pid + " foi concluido");
					else {
						System.out.println("Processo voltou para a fila");
						fila.enqueue(pid);
					}
				}
				else
					System.out.println("Nao ha processos na fila");
				break;
			case 3:
				if (! fila.isEmpty()) {
					System.out.print("Deseja encerrar todos os processos? (1-sim): ");
					int resp = sc.nextInt();
					if (resp == 1) {
						while (!fila.isEmpty()) {
							System.out.println("Encerrado o processo :"+ fila.dequeue());
						}
					}
					else
						opcao = 0;
				}		
				break;
			default:
				System.out.println("Opcao invalida");
			}
		}while(opcao!=3);
		
		System.out.println("Shutdown...");
		
		sc.close();

	}

}
