package br.com.erickfreire.pesquisavalor;

import java.util.Scanner;

public class PesquisaValor {

	public static void main(String[] args) {
		int i;
		boolean acha;
		double vetorA[] = new double[10];
		double pesquisa;
		int resposta;
		Scanner entrada = new Scanner(System.in);
		
		for(i = 0; i <= 9; i++) {
			System.out.print("Digite um valor: ");
			vetorA[i] = entrada.nextDouble();
		}
		
		System.out.print("Deseja Pesquisar um valor? Digite 1 - Sim ou 2 - Para N?o");
		resposta = entrada.nextInt();
		
		while(resposta == 1) {
			System.out.print("\nQual o valor da pesquisa?\n");
			pesquisa = entrada.nextDouble();
			
			i = 1;
			acha = false;
			
			while((i <= 9) && (acha == false)) {
				if(pesquisa == vetorA[i]) {
					acha = true;
				} else {
					i = i + 1;
				}
			}
			
			if(acha == true) {
				System.out.printf("%nA pesquisa %.2f est? no indice: %d", pesquisa, i + 1);
			} else {
				System.out.print("Valor n?o localizado!");
			}
			
			System.out.print("\n\nDeseja Pesquisar um valor? Digite 1 - Sim ou 2 - Para N?o");
			resposta = entrada.nextInt();
		}
	}

}
