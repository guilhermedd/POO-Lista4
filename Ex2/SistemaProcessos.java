package Ex2;

import java.util.ArrayList;

public class SistemaProcessos {
	
	private ArrayList<Juiz> juizes = new ArrayList<Juiz>();
	private ArrayList<Processo> processos = new ArrayList<Processo>();
		
	public ArrayList<Juiz> getJuizes() {
		return juizes;
	}
	public void setJuizes(ArrayList<Juiz> juizes) {
		this.juizes = juizes;
	}
	public ArrayList<Processo> getProcesso(){
		return processos;
	}
	public void setProcesso(ArrayList<Processo> processos) {
		this.processos = processos;		
	}
	
	public void cadastrarProcesso(Processo processo) {
		processos.add(processo);
	}
	public void cadastrarJuiz(Juiz juiz) {
		juizes.add(juiz);
	}
	public void distribuirProcessos() throws PilhaCheiaException, ProcessoSemJuizException{
		int Njuizes = juizes.size();
		int Nprocessos = processos.size();
		int divisao = Nprocessos / Njuizes;
		try {
			for(int i = 0; i < Njuizes; i++) {
				for(int j = 0; j < divisao; j++) {
					try {
						juizes.get(i).getProcessos().inserir(processos.get(j));
					} catch (PilhaCheiaException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			if(Nprocessos % Njuizes != 0) {
				for(int i = 0; i < Njuizes;i++) {
					if(juizes.get(i).getProcessos().getSize() < 5) {
						try {
							juizes.get(i).getProcessos().inserir(processos.get(i));//como fazer?
						}catch(PilhaCheiaException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}catch(Exception e) {
			throw new ProcessoSemJuizException("Sem juiz");
		}
		
		
	}
}
