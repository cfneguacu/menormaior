package menormaior;

public class MenorMaior {

	public static void main(String[] args) {
		
		int vetor[] = new int[] {-5,2,-9,2,100,5,9,11,7,4,20};
		/* aqui ja declarei o o vetor com os valores mas vc pode usar um laço 
		 * para atribuir será o mesmo efeito.como abaixo para visualG
		 * 
		 * var:vetor:Vetor[1...10]de inteiro
		 * i:inteiro
		 * maior:inteiro
		 * menor:inteiro
		 *para i = 0 ate tamanho do vetor faça
		 * leia vetor[i]
		 * i<-i+1 
		 * fimpara
		 * 
		 */
		
		int menor = vetor[0];
		int maior = vetor[0];
		
		for(int i=0;i<vetor.length;i++) { // para i = 0 ate tamanho do vetor faça
			
			if(maior<vetor[i]) { // = Se (maior < vetor[i]) entao
				maior = vetor[i]; 
			}else if(menor>vetor[i]) { //Senao Se (menor > vetor[i]);
				menor = vetor[i];
			}// fimse 
			

		}// fimpara
		
		System.out.println("Maior "+maior); // escrevaL ("Maior",maior)
		System.out.println("Menor "+menor); // escrevaL ("Menor",menor)
}
}
