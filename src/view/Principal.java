package view;
import model.PilhaInt;

public class Principal {

	public static void main(String[] args) {
		PilhaInt pi = new PilhaInt();
		
		int [] vetor = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, 6, 2, -9, 1, 5};
		int auxiliar;

		for (int i = 0; i < vetor.length; i++) {
			if (i >=0) {
				pi.push(i);
			} else {
				try {
					auxiliar = pi.pop() + pi.pop();
					pi.push(auxiliar);
					pi.push(i);
				} catch (Exception errpi){
					System.err.println(pi);
				}
			} 
		}
		System.out.println("Tamanho da pilha: " +pi.size());
	}

}
