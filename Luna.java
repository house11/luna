//che la gravità sulla luna è il 17% di quello della terra, scrivere un programma che calcoli il peso effettivo sulla luna di una //persona di 75 kg.
//esempio una persona che sulla terra pesa 100kg sulla luna ne pesa 17kg

class Luna {


  
  public static void main(String args[]){
    double pesoTerra = 75, pesoLuna=0.0;
  
    pesoLuna = (pesoTerra *17)/100;
    
    System.out.println("Una persona che sulla terra pesa kg"+ pesoTerra+" sulla luna pesa "+ pesoLuna );
  
  }
  
}
