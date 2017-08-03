//Visualizzare, pollice per pollice,  una lista di conversione da pollici a metri fino a 100 pollici. Inserire una riga vuota ogni 10 pollici. 
//Considerate che un metro equivale a 39,37 pollici.

class Pollice{

	
	public static void main(String[] args) {
	double pollici = 39.37;
	int a=10;
		

		for(int i =1 ; i<=100 ; i++){

			System.out.println( i + " m    equivale a : "+(pollici*i));
			if(i==a){	a=a+10;	System.out.println(); }

		}
		
	}
}
