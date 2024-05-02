package Fila;

public class FilaString {
	
	private class No {
		String dado;
		No prox;
	}

	No ini, fim;

	public void init() {
		ini = fim = null;
	}
	
	public boolean isEmpty() {
		return (ini==null && fim==null);
	}
	public void enqueue(String elem) {
		No novo = new No();
		novo.dado = elem;
		novo.prox = null;
		
		if(isEmpty()) {
			ini = novo;
		}else {
			fim.prox = novo;
		}
		fim = novo;
		
	}
	public String first() {
		return (ini.dado);  
	}
	
	public String dequeue() {
		String valor = ini.dado;
		
		ini = ini.prox;
		if(ini == null) {
			fim = null;
		}
		return(valor);
	}
}
