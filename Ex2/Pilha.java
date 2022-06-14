package Ex2;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {
	private int limite;
	private List<T> elementos = new ArrayList<T>(limite);
	
	public Pilha(int limite) {
		this.limite = limite;
	}
	
	public List<T> getElementos() {
		return elementos;
	}

	public void setElementos(List<T> elementos) {
		this.elementos = elementos;
	}

	public void inserir(T objeto) throws PilhaCheiaException{
		try {
			if(elementos.size() < 5) {
				elementos.add(objeto);
			}
		}catch(Exception e) {
			throw new PilhaCheiaException("Pilha cheia");
		}
	}

	public void remover() throws PilhaVaziaException{
		try {
			elementos.remove((elementos.size()-1));
		}catch(Exception e) {
			throw new PilhaVaziaException("Pilha vazia");
		}
	}

	public int getSize() {
		return elementos.size();
	}
}
