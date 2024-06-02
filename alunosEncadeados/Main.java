package alunosEncadeados;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		listaAlunos lista = new listaAlunos();
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		do {
			System.out.println("O que você deseja fazer?");
			System.out.println("1 - Cadastrar aluno");
			System.out.println("2 - Atender aluno");
			System.out.println("3 - consultar média de um aluno");
			System.out.println("4 - ver  alunos tem na lista");
			System.out.println("5 - sair");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				Alunos a = new Alunos();
				System.out.println("Digite o nome do aluno");
				a.setNome(sc.next());
				System.out.println("Digite o rm do aluno");
				a.setRm(sc.nextInt());
				System.out.println("Digite a media do aluno");
				a.setMedia(sc.nextDouble());
				lista.add(a);
				break;
			case 2:
				String aluno;
				lista.show();
				System.out.println("Digite o nome aluno será atendido");
				aluno = sc.next();
				if(lista.remove(aluno)) {
				System.out.println("Aluno removido com sucesso");
				}else {
					System.out.println("Aluno nao pode ser removido ");
				}
				break;
			case 3:
				System.out.println("Informe o rm do aluno");
				int rm = sc.nextInt();
				System.out.println( lista.select(rm));
				break;
			case 4:
				lista.show();
				System.out.println("Quantidades de alunos na lista: " + lista.contaNos());
				System.out.println();
				break;
			case 5: 
				if(!lista.isEmpty()) {
					System.out.println("Ainda há alunos na fila");
					opcao = 1;
				}else {
					System.out.println("Saindo do programa...");
				}
				break;
			}
		} while (opcao != 5);
	}
}
