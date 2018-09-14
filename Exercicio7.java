public class Exercicio7{  
	public static int occorrenciadodigito(int numero, int k){
    		if ( (numero == 0) &&  (k == 0)) 
			return 1;
	         if ( (numero == 0) &&  (k != 0)) 
			return 0;	
		if ( numero%10 == k )
      			return 1 + occorrenciadodigito(numero/10, k);
    		else
        		return occorrenciadodigito(numero/10, k);		
  }
	
  public static void main(String args[]) {
   System.out.println( occorrenciadodigito(762021192, 2) );
	}

}
