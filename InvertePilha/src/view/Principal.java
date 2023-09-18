package view;

import model.PilhaInt;

public class Principal {

	public static void main(String[] args) throws Exception {
		PilhaInt pOriginal = new PilhaInt();
		PilhaInt pAux = new PilhaInt();
		int[] vet = {14, 26, 38, 15, 5, 39, 11, 25, 22, 20, 17, 1};
		
		for (int i = 0; i < vet.length ; i++) {
			pOriginal.push(vet[i]);
		}
		
		int tamanho = pOriginal.size();
		
		for(int i = 0 ; i < tamanho ; i++ ) {
			int aux = pOriginal.pop();
			for( int j = 0; j < tamanho - i - 1 ; j++) {
				pAux.push(pOriginal.pop());
			}
			pOriginal.push(aux);
			while(!pAux.isEmpty()) {
				pOriginal.push(pAux.pop());
			}
		}
		
		System.out.println("Pilha invertida = " );
		while(!pOriginal.isEmpty()) {
			System.out.println(pOriginal.pop());
		}

	}

}
