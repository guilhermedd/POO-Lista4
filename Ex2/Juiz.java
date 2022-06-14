package Ex2;

public class Juiz {
	private String nome;
	private final int limiteDeProcessos = 5;
	private Pilha processos = new Pilha(limiteDeProcessos);
	
	public Juiz(int limite) {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pilha getProcessos() {
		return processos;
	}
	public void setProcessos(Pilha processos) {
		this.processos = processos;
	}
	
	public void cadastrarProcesso(Processo processo) throws PilhaCheiaException {
		try {
			processos.inserir(processo);
		} catch(Exception e) {
			System.err.println(e);
		}
	}
}
