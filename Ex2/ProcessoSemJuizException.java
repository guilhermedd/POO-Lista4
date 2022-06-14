package Ex2;

public class ProcessoSemJuizException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProcessoSemJuizException() {
		
	}
	public ProcessoSemJuizException(String msg) {
		super(msg);
		System.out.println("Processo sem juiz");
	}
}
