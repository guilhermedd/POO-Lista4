package Ex2;

public class PilhaVaziaException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	public PilhaVaziaException() {
//
//	}
	public PilhaVaziaException(String msg) {
		super(msg);
		System.out.println("Pilha vazia");
	}
}
