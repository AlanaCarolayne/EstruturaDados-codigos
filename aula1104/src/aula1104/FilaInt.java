package aula1104;

public class FilaInt {
public final int N =3;
int dados[] = new int[N];
int ini, fim, cont;

public void init() {
	cont = ini = fim=0;
	
}
	public boolean isEmpty(){
		return (cont==0);
	}
	public boolean isFull() {
		return (cont ==N);
	}
	
	public void enqueue(int v) {
		if(isFull()) {
			System.out.println("Fila cheia");
		}else {
			dados[fim] = v;
			fim= (fim+1) %N;
			cont++;
			
		}
	}
	
	public int dequeue() {
		int v= dados[ini];
		ini = (ini+1) % N;
		cont--;
		return v;
	}
	
	public int first() {
		return (dados[ini]);
	}
	
}
