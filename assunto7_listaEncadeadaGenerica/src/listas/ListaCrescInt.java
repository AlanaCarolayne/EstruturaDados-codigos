package listas;

public class ListaCrescInt {

	private class NO {
		int dado;
		NO prox;
	}

	NO lista = null;

	public boolean isEmpty() {
		return (lista == null);

	}

	public void add(int elem) {
		NO novo = new NO();
		novo.dado = elem;
		if (isEmpty()) {
			lista = novo;
			novo.prox = null;
		} else if (novo.dado < lista.dado) {
			novo.prox = lista;
			lista = novo;
		} else {
			NO aux = lista;
			boolean achou = false;

			while (aux.prox != null && !achou) {   
				if (aux.prox.dado < novo.dado) {
					aux = aux.prox;
				} else {
					achou = true;
				}
			}
			novo.prox = aux.prox;
			aux.prox = novo;

		}

	}
	
	public void show() {
		NO aux = lista;
		System.out.println("---------------------LISTA----------------------------------------");
		while(aux !=null) {
			System.out.print(aux.dado + "\t");
			aux = aux.prox;
		}
		
		System.out.println();
	}

}
