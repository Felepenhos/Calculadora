package Calculadora;

public class CalculadoraTesteSub {
	public static void main(String[] args) {
        CalculadoraSub calc = new CalculadoraSub(); 
        int sub = calc.sub(12,6 );
        System.out.println(sub);
        
    // 2 Subtrair sendo um deles o numero zero // 
     sub = calc.sub(10,0);
     System.out.println(sub);
     
     // 3 Subtrair os valores dele sendo os dois igual a zero 
     sub = calc.sub(0,0);
     System.out.println(sub);
     
     
     // 4 Subtrair os dois valores sendo um deles negativo 
      sub = calc.sub(-7,3);
     System.out.println(sub);
     
     // 5 Subtrair os dois valores sendo os dois negativos 
     
      sub = calc.sub(-15,-10);
     System.out.println(sub);
  
     // 6 Subtrair os dois valores sendo o segundo valor negativo
     sub = calc.sub(3,-1);
    System.out.println(sub);
     } 
}


