package Calculadora;

public class CalculadoraTesteSoma {
	public static void main(String[] args) {
        CalculadoraSoma calc = new CalculadoraSoma(); 
        int soma = calc.somar(3,7 );
        System.out.println(soma);
        
    // 2 somar sendo um deles o numero zero // 
     soma = calc.somar(3,0);
     System.out.println(soma);
     
     // 3 somar os valores dele sendo os dois igual a zero 
     soma = calc.somar(0,0);
     System.out.println(soma);
     
     
     // 4 somar os dois valores sendo um deles negativo 
      soma = calc.somar(-3,1);
     System.out.println(soma);
     
     // 5 somar os dois valores sendo os dois negativos 
     
      soma = calc.somar(-5,-2);
     System.out.println(soma);
     
      // 6 somar os dois valores sendo o segundo valor negativo
      soma = calc.somar(3,-1);
     System.out.println(soma);
     
     
     
     
    }
    
}
