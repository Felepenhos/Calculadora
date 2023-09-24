package Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalculadoraTesteJunit {

	@Test
	public void SomarSendoUmDelesoNumeroZero(){
		CalculadoraSoma calc = new CalculadoraSoma();
		int soma = calc.somar(3,0);
		Assert.assertEquals(3,soma);
	}
	@Test
	public void SomarDoisNumerosPositivos(){
		CalculadoraSoma calc = new CalculadoraSoma();
		int soma = calc.somar(3,7);
		Assert.assertEquals(10,soma);
	}
	@Test
	public void SomarOsValoresDeleSendoOsDoisIgualAZero(){
		CalculadoraSoma calc = new CalculadoraSoma();
		int soma = calc.somar(0,0);
		Assert.assertEquals(0,soma);
	}
	@Test
	public void SomarOsDoisValoresSendoUmNegativo(){
		CalculadoraSoma calc = new CalculadoraSoma();
		int soma = calc.somar(-3,1);
		Assert.assertEquals(2,soma);
	
} 
	@Test
	public void SomarOsDoisValoresSendoOsDoisNegativos(){
		CalculadoraSoma calc = new CalculadoraSoma();
		int soma = calc.somar(-5,-2);
		Assert.assertEquals(-7,soma);
} 
	@Test
	public void SomarOsDoisValoresSendoOsSegundoNegativo(){
		CalculadoraSoma calc = new CalculadoraSoma();
		int soma = calc.somar(3,-1);
		Assert.assertEquals(-7,soma);
} 
	@Test
	public void SubtrairdDoisNumerosPositivos(){
		CalculadoraSub calc = new CalculadoraSub();
		int sub = calc.sub(12,6);
		Assert.assertEquals(6,sub);
} 
	@Test
	public void SubtrairSendoUmIgualAZero(){
		CalculadoraSub calc = new CalculadoraSub();
		int sub = calc.sub(10,0);
		Assert.assertEquals(10,sub);
} 
	@Test
	public void SubtrairSendoOsdoisIgualAZero(){
		CalculadoraSub calc = new CalculadoraSub();
		int sub = calc.sub(0,0);
		Assert.assertEquals(0,sub);
}
	@Test
	public void SubtrairSendoUmDelesNegativo(){
		CalculadoraSub calc = new CalculadoraSub();
		int sub = calc.sub(-7,3);
		Assert.assertEquals(4,sub);
} 
	@Test
	public void SubtrairSendoOsDoisNegativos(){
		CalculadoraSub calc = new CalculadoraSub();
		int sub = calc.sub(-15,-10);
		Assert.assertEquals(0,sub);
} 
	@Test
	public void SubtrairSendoOSegundoNegativo(){
		CalculadoraSub calc = new CalculadoraSub();
		int sub = calc.sub(3,-1);
		Assert.assertEquals(0,sub);
	
} 
	@Test
	public void MultiplicarComDoisValoresPositivos(){
		CalculadoraMulti calc = new CalculadoraMulti(); 
		int multi = calc.multi(50,5);
		Assert.assertEquals(250,multi);
	
} 
	@Test
	public void MultiplicarSendoUmValorIgualZero(){
		CalculadoraMulti calc = new CalculadoraMulti(); 
		int multi = calc.multi(50,0);
		Assert.assertEquals(0,multi);
} 
	@Test
	public void MultiplicarSendoOsDoisValoresZero(){
		CalculadoraMulti calc = new CalculadoraMulti(); 
		int multi = calc.multi(0,0);
		Assert.assertEquals(0,multi);
} 
	@Test
	public void MultiplicarSendoUmValorNegativo(){
		CalculadoraMulti calc = new CalculadoraMulti(); 
		int multi = calc.multi(-14,9);
		Assert.assertEquals(-126,multi);
} 
	@Test
	public void MultiplicarSendoOsDoisNegativos(){
		CalculadoraMulti calc = new CalculadoraMulti(); 
		int multi = calc.multi(-30,-25);
		Assert.assertEquals(-750,multi);
}
	@Test
	public void MultiplicarSendoOSegundoValorNegativo(){
		CalculadoraMulti calc = new CalculadoraMulti(); 
		int multi = calc.multi(3,-1);
		Assert.assertEquals(-3,multi);
} 
	@Test
	public void DividirSendoOsDoisValoresPositivos(){
		CalculadoraDivi calc = new CalculadoraDivi();
		int div = calc.divi(50,5);
		Assert.assertEquals(250,div);
} 
	@Test
	public void DividirSendoUmDelesZero(){
		CalculadoraDivi calc = new CalculadoraDivi();
		int div = calc.divi(5,0);
		Assert.assertEquals(0,div);
}
	@Test
	public void DividirSendoOsDoisValoresZero(){
		CalculadoraDivi calc = new CalculadoraDivi();
		int div = calc.divi(0,0);
		Assert.assertEquals(0,div);
} 
	@Test
	public void DividirSendoUmDelesSendoNegativo(){
		CalculadoraDivi calc = new CalculadoraDivi();
		int div = calc.divi(-14,2);
		Assert.assertEquals(0,div);
} 
	@Test
	public void DividirSendoOsDoisNegativos(){
		CalculadoraDivi calc = new CalculadoraDivi();
		int div = calc.divi(-30,-5);
		Assert.assertEquals(0,div);
} 
	@Test
	public void DividirSendoOSegundoValorNegativo(){
		CalculadoraDivi calc = new CalculadoraDivi();
		int div = calc.divi(-9,1);
		Assert.assertEquals(0,div);
} 
} 