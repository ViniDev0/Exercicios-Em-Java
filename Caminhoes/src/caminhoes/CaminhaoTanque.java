package caminhoes;

public class CaminhaoTanque extends Caminhao {
	private String tipo;
	
	public CaminhaoTanque (int nrCaminhao, 
			String modelo, int anoFabricacao, 
			int capacidadeTotal, char unidade, String tipo) {
		super(nrCaminhao, modelo, anoFabricacao, capacidadeTotal, unidade);
		
		this.tipo = tipo;
	}
	
	public void encheTanque() {
		this.cargaAtual = this.getCapacidadeTotal();
	}
	
	public void esvaziaTanque() {
		this.cargaAtual = 0;
	}
	
	public void abasteceTanque(int qtdeLitros) {
		this.cargaAtual += qtdeLitros;
	}
	
	public void descarregaTanque(int qtdeLitros) {
		if (this.cargaAtual - qtdeLitros >= 0) {
			
			this.cargaAtual -= qtdeLitros;
		}
	}

	public String getTipo() {
		return tipo;
	}
	
	
}
