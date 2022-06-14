package Ex2;

public class PilhaCheiaException extends Exception{

	private static final long serialVersionUID = 1L;
	
//	public PilhaCheiaException() {
//
//	}
	public PilhaCheiaException(String msg) {
		super(msg);
		System.out.println("Pilha cheia");
	}

}
