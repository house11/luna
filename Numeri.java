//Scrivere un programma che utilizzi il ciclo for e visualizzi sulla stessa riga la progressione dei numeri da 1 a 10 e poi la progressione inversa.

class Numeri
{

	public static void main(String[] args) {
		
		System.out.print("Inizio :");
		for (int i=1; i<=10 ;i++ ) {
			
			System.out.print( i);
		}
		for (int i=10; i>=1 ;i-- ) {
			
			System.out.print( i);
		}
	}
}
