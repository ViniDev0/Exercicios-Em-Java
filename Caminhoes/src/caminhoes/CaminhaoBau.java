package caminhoes;

public class CaminhaoBau extends Caminhao {
	private double volume;
	private double comprimento;
	private double largura;
	private double altura;
	
	 
	
	public CaminhaoBau (int nrCaminhao, String modelo, 
			int anoFabricacao, int capacidadeTotal, 
			char unidade, double comprimento, 
			double largura, double altura) {
		
		super(nrCaminhao, modelo, anoFabricacao, capacidadeTotal, unidade);
		this.comprimento = comprimento;
		this.largura = largura;
		this.altura = altura;
	}
	
	public void carregabau(double qtdeQuilos) {
		final double CONVERSORTONELADA = 1000;
		double qtdeToneladas = qtdeQuilos / CONVERSORTONELADA;
		
		if (qtdeToneladas <= getCapacidadeTotal()) {
			
			this.cargaAtual += qtdeToneladas;
		}
	}
	
	public void descarregaBau(double qtdeQuilos) {
		final double CONVERSORTONELADA = 1000;
		double qtdeToneladas = qtdeQuilos / CONVERSORTONELADA;
		
		if (this.cargaAtual - qtdeToneladas >= 0) {
			this.cargaAtual -= qtdeToneladas;
		}
	}
	
	public double calculaVolume() {
		double comprimento = this.comprimento;
		double altura = this.altura;
		double largura = this.largura;
		double volume;
		
		volume = (comprimento * altura * largura);
		
		return this.volume = volume;
	}

	
	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getVolume() {
		return volume;
	}
	
	
}
