package exemplo2;

public class Lista2 {

	public static void main(String[] args) {
//		exemplo sobre lista linear encadeada, explicação sobre nó

		NoLista lista = new NoLista();
		lista.dado = 1;
		lista.prox = null;
//		quando a lista não tem um sucessor, o procimo endereço é nulo.

		System.out.println("Lista " + lista);
		System.out.println("dado: " + lista.dado);
		System.out.println("prox: " + lista.prox);

		NoLista novo = new NoLista();
		novo.dado = 2;
		novo.prox = null;
		lista.prox = novo;
		
		System.out.println("\n Depois da inserção do 2° nó");
		System.out.println("Lista " + lista);
		System.out.println("dado: " + lista.dado);
		System.out.println("prox: " + lista.prox);

		System.out.println("\n novo " + lista);
		System.out.println("dado: " + novo.dado);
		System.out.println("prox: " + novo.prox);
		
		
		NoLista novo2 = new NoLista();
		novo2.dado = 3;
		novo2.prox =lista;
		
		System.out.println("\n Depois da inserção do 3° nó");
		System.out.println("\n novo2 " + novo2);
		System.out.println("dado: " + novo2.dado);
		System.out.println("prox: " + novo2.prox); 
		
		
		System.out.println("\n Lista " + lista);
		System.out.println("dado: " + lista.dado);
		System.out.println("prox: " + lista.prox);

		System.out.println("\n novo " + novo);
		System.out.println("dado: " + novo.dado);
		System.out.println("prox: " + novo.prox);
		
		
	}

}
