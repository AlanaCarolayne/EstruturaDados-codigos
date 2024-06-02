package alunosEncadeados;

public class listaAlunos {
//	Aunos tem como atributos RM e Média
//	Lista construída mantendo ordem crescente de RM
//	Além dos métodos que foram implementados na ListaInt, elabore método select que consulta a lista retornando o valor da media do aluno selecionado pelo RM.

	private class NO {
		Alunos dado;
		NO prox;
	}

	NO lista = null;
//	fazendo isso, não precisa do init

	public boolean isEmpty() {
		boolean vazia;
		if (lista == null) {
			vazia = true;
		} else {
			vazia = false;
		}
		return vazia;
	}

	public void add(Alunos aluno) {
		NO novo = new NO();
		novo.dado = aluno;

		if (isEmpty()) {
			lista = novo;
			lista.prox = null;
		} else {
			if (  novo.dado.getRm()<lista.dado.getRm())  {
				novo.prox = lista;
				lista = novo;
			} else {
				NO aux = lista;
				boolean achou = false;
				while (aux.prox != null && !achou) {
					if (aux.prox.dado.getRm() < novo.dado.getRm()) {
						aux = aux.prox;
					} else {
						achou = true;
					}
				}
				novo.prox = aux.prox;
				aux.prox = novo;

			}
		}
	}

	public boolean remove(String aluno) {
		boolean achou = false;

		if (!isEmpty()) {
			if (lista.dado.getNome().equals(aluno)) {
				lista = lista.prox;
				achou = true;

			} else {
				NO aux = lista;
				while (aux.prox != null && !achou) {
					if(aux.dado.getNome().equals(aluno)) {
						aux = aux.prox;
					}else {
						achou= true;
					}
				}
				if(achou) {
					aux.prox = aux.prox.prox;
				}
			}

		}

		return achou;

	}
	
	public int contaNos() {
		NO aux = lista;
		int cont =0;
		while(aux!=null) {
			aux = aux.prox;
			cont++;
		}
		return cont;
	}
	public void show() {
		NO aux = lista;
		System.out.println("---------Lista de alunos------------");
		while(aux !=null) {
			System.out.println();
			System.out.println("Nome: " + aux.dado.getNome());
			System.out.println("RM: " + aux.dado.getRm());
			System.out.println("Média: " + aux.dado.getMedia());
			aux = aux.prox;
		}
	}
	
	public double select(int rm) {
		double media = 0;
		NO aux = lista;
		boolean achou = false;
		while(aux != null && !achou) {
		if(aux.dado.getRm() == rm) {
			media =	aux.dado.getMedia();
			achou = true;
		}else {
			aux = aux.prox;
		}
		}
		
		return media;
	}
}
