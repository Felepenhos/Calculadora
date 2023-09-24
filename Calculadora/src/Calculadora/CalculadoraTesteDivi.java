package Calculadora;

public class CalculadoraTesteDivi {
	public static void main(String[] args) {
	      CalculadoraDivi calc = new CalculadoraDivi(); 
	        int div = calc.divi(45,5 );
	        System.out.println(div);
	        
	    // 2 Divizão  sendo um deles o numero zero // 
	     div = calc.divi(5,0);
	     System.out.println(div);
	     
	     // 3 Divizãoos valores dele sendo os dois igual a zero 
	     div = calc.divi(0,0);
	     System.out.println(div);
	     // Todo numero zero que dividi é igual a zero
	     
	     
	     // 4 Divizão os dois valores sendo um deles negativo 
	      div = calc.divi(-14,2);
	     System.out.println(div);
	     // não tem como resultar um numero negativo na divisão 
	     
	     // 5 Diviizão os dois valores sendo os dois negativos 
	     
	      div = calc.divi(-30,-5);
	     System.out.println(div);
	  // não tem como resultar um numero negativo na divisão 
	   
	     // 6 	Multiplicar os dois valores sendo o segundo valor negativo
	     div = calc.divi(9,-1);
	    System.out.println(div);
	    
	    // não tem como resultar um numero negativo na divisão
}
} 