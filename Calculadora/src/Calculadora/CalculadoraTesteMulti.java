package Calculadora;

public class CalculadoraTesteMulti {
	public static void main(String[] args) {
        CalculadoraMulti calc = new CalculadoraMulti(); 
        int multi = calc.multi(50,5 );
        System.out.println(multi);
        
    // 2 Multiplicar sendo um deles o numero zero // 
     multi = calc.multi(20,0);
     System.out.println(multi);
     
     // 3 Multiplicar os valores dele sendo os dois igual a zero 
     multi = calc.multi(0,0);
     System.out.println(multi);
     
     
     // 4 Multiplicar os dois valores sendo um deles negativo 
      multi = calc.multi(-14,9);
     System.out.println(multi);
     
     // 5 Multiplicar os dois valores sendo os dois negativos 
     
      multi = calc.multi(-30,-25);
     System.out.println(multi);
     
     // 6 	Multiplicar os dois valores sendo o segundo valor negativo
     multi = calc.multi(3,-1);
    System.out.println(multi);
     }  
}

