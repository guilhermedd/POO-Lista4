package Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static Scanner s = new Scanner(System.in);
	private static SistemaProcessos sistemaProcessos = new SistemaProcessos ();
	private static Juiz juiz;
	private static Processo processo;
	private static final int numeroDeProcessos = 5;
	
	public static void main(String[] args) throws ProcessoSemJuizException {
		int opcao = 1;
		while(opcao != 0) {
			menu();
			System.out.println("Deseja continuar?"
					+ "\n(0) - N�o"
					+ "\n(1) - Sim");
			opcao = Integer.parseInt(s.nextLine());
		}
	}
	public static void menu() throws ProcessoSemJuizException {
		int opcao;
		System.out.println("---MENU---"
				+ "\n(0) - Cadastrar Juiz"
				+ "\n(1) - Cadastrar Processo"
				+ "\n(2) - Remover Processo"
				+ "\n(3) - Distribuir Processos"
				+ "\n(4) - Mostra Juizes");
		opcao = Integer.parseInt(s.nextLine());
		switch(opcao) {
			case 0:
				juiz = new Juiz(numeroDeProcessos);
				System.out.println("Digite o nome do juiz:");
				juiz.setNome(s.nextLine());
				sistemaProcessos.cadastrarJuiz(juiz);
				break;
			case 1:
				processo = new Processo();
				System.out.println("Crie uma ID para o processo:");
				processo.setId(Integer.parseInt(s.nextLine()));
				System.out.println("Digite o nome do processo:");
				processo.setNome(s.nextLine());
				sistemaProcessos.cadastrarProcesso(processo);
				break;
			case 2:
				System.out.println("Selecione um juiz:");
				mostraJuizes();
				int escolhaDeJuiz = Integer.parseInt(s.nextLine());
				try {
					sistemaProcessos.getJuizes().get(escolhaDeJuiz).getProcessos().remover();
				}catch(Exception e) {//caso o Juiz n�o tenha processos vai dar erro, isso tem que ser tratado
					System.err.println(e);
				}
				break;
			case 3:
			try {
				sistemaProcessos.distribuirProcessos();
			} catch (PilhaCheiaException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				break;
			case 4:
				mostraJuizes();
			default:
				break;
		}
	}
	public static void mostraJuizes() {
		if(sistemaProcessos.getJuizes().size() == 0) {
			System.out.println("Sem juizes");
		}else {
			for(int i = 0; i < sistemaProcessos.getJuizes().size(); i++) {
				System.out.println("("+i+") "+ sistemaProcessos.getJuizes().get(i).getNome());
				for(int j = 0; j < sistemaProcessos.getJuizes().get(i).getProcessos().getSize();j++) {
					System.out.println("\t"+sistemaProcessos.getJuizes().get(i).getProcessos().getElementos().get(j));
					//n�o sei como printar os processos
				}
			}
		}
	}
}
