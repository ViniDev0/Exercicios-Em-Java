package caminhoes;

import java.util.Scanner;

public class CaminhoesApp {

	public static void main(String[] args) {
		
		CaminhaoBau caminhaoBau1 = new CaminhaoBau(9227, "Volvo 123", 2020, 2000, 'T', 10.0, 2.20, 3.50);
		CaminhaoBau caminhaoBau2 = new CaminhaoBau(2334, "WV Turbo", 2021, 1800, 'T', 12.0, 2.20, 3.50);
		CaminhaoBau caminhaoBau3 = new CaminhaoBau(5664, "WV T1000", 2022, 2000, 'T', 14.0, 2.20, 3.80);
		
		
		caminhaoBau1.carregabau(350);
		MostrarBau(caminhaoBau1);
		
		caminhaoBau2.carregabau(1000);
		MostrarBau(caminhaoBau2);
		
		caminhaoBau3.carregabau(2000);
		MostrarBau(caminhaoBau3);
		caminhaoBau3.descarregaBau(350);
		MostrarBau(caminhaoBau3);
		
		
		CaminhaoTanque caminhaoTanque1 = new CaminhaoTanque(988, "Iveco day", 2019, 3000, 'L', "Água");
		CaminhaoTanque caminhaoTanque2 = new CaminhaoTanque(334, "MB 2000", 2021, 2500, 'L', "Combustível");
		
		caminhaoTanque1.encheTanque();
		MostrarTanque(caminhaoTanque1);
		
		caminhaoTanque2.encheTanque();
		caminhaoTanque2.descarregaTanque(1000);
		caminhaoTanque2.abasteceTanque(350);
		MostrarTanque(caminhaoTanque2);
	}
	private static void MostrarBau(CaminhaoBau caminhao) {
		System.out.println("----------------------------------------------------");	
		System.out.println("Modelo              : " + caminhao.getModelo());
		System.out.println("Fabricação          : " + caminhao.getAnoFabricacao());
		System.out.println("Capacidade Total    : " + caminhao.getCapacidadeTotal());
		System.out.println("Unidade             : " + caminhao.getUnidade());
		System.out.println("Comprimento         : " + caminhao.getComprimento());
		System.out.println("Largura             : " + caminhao.getLargura());
		System.out.println("Altura              : " + caminhao.getAltura());
		System.out.println("Volume              : " + caminhao.calculaVolume());
		System.out.println("Carga Atual         : " + caminhao.cargaAtual);
		System.out.println("-----------------------------------------------------");
	}
	private static void MostrarTanque(CaminhaoTanque caminhao) {
		
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Modelo              : " + caminhao.getModelo());
		System.out.println("Fabricação          : " + caminhao.getAnoFabricacao());
		System.out.println("Capacidade Total    : " + caminhao.getCapacidadeTotal());
		System.out.println("Unidade             : " + caminhao.getUnidade());
		System.out.println("Tipo                : " + caminhao.getTipo());
		System.out.println("Carga Atual         : " + caminhao.cargaAtual);
		System.out.println("-----------------------------------------------------");
		
		
	}
}
