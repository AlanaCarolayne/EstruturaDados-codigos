package exercicio4;

import java.util.Scanner;

import aula1104.FilaInt;

public class processos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FilaInt fila = new FilaInt();
		fila.init();
		int opcao;
		do {
			System.out.println("1 -> submeter processo");
			System.out.println("2 -> executar processo (ocupa tempo processador");
			System.out.println("3 -> Shutdown");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o PID do processo");
				int pid = sc.nextInt();
				fila.enqueue(pid);
				break;

			case 2:
				if (!fila.isEmpty()) {
					pid = fila.dequeue();
					System.out.println("O processo que esta em execucao: " + pid);
					System.out.println("O processo" + pid + " foi finalizado? (1 ->sim): ");
					int x = sc.nextInt();
					if (x == 1) {
						System.out.println("O processo  " + pid + " foi concluido");
					} else {
						System.out.println("processo voltou para a fila");
						fila.enqueue(pid);
					}

				} else {
					System.out.println("Não há processos a serem executados");

				}
				break;
			case 3:
				if (!fila.isEmpty()) {
					System.out.println("Deseja encerrar todos os processos? (1 ->sim): ");
					int x = sc.nextInt();
					if (x == 1) {
						while (!fila.isEmpty()) {
							System.out.println("encerrando o processo: " + fila.dequeue());
						}
					}
				} else {
					opcao = 0;
				}
				break;

			default:
				System.out.println("Opcao invalida");
			}

		} while (opcao != 3);
		
		System.out.println("Shutdown");

		sc.close();

	}

}
