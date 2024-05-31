package br.com.projetoA3.Projeto_A3.model;

import org.junit.Test;

import org.junit.Assert;

public class CarroTeste {
	
	@Test
	public void ligarMotorTeste() {
		
		//Cenário
		String modelo1 = "Ford Ka";
		String modelo2 = "Nissan Kicks";
		String modelo3 = "Renault Logan";
		Carro m1 = new Carro("Ford", modelo1, 2019);
		Carro m2 = new Carro("Nissan", modelo2, 2022, true, 0);
		Carro m3 = new Carro("Renault", modelo3, 2017, true, 60);
		
		//Ação
		System.out.println(m1.situacaoMotor());
		System.out.println(m2.situacaoMotor());
		System.out.println(m3.situacaoMotor() + "\n");
		
		
		//Verificação
		Assert.assertEquals(m1.ligarMotor(), "O motor do " + modelo1 + " foi ligado agora.");
		Assert.assertEquals(m2.ligarMotor(),"O motor do " + modelo2 + " já estava ligado.");
		Assert.assertEquals(m3.ligarMotor(),"O motor do " + modelo3 + " já estava ligado.");
		
	}
	
	@Test
	public void desligarMotorTeste() {
		
		//Cenário
		String modelo1 = "Ford Ka";
		String modelo2 = "Nissan Kicks";
		String modelo3 = "Renault Logan";
		Carro m1 = new Carro("Ford", modelo1, 2019);
		Carro m2 = new Carro("Nissan", modelo2, 2022, true, 0);
		Carro m3 = new Carro("Renault", modelo3, 2017, true, 60);
		
		//Ação
		System.out.println("\n" + m1.situacaoMotor());
		System.out.println(m2.situacaoMotor());
		System.out.println(m3.situacaoMotor() + "\n");
		
		//Verificação
		Assert.assertEquals(m1.desligarMotor(), "O motor do " + modelo1 + " já estava desligado.");
		Assert.assertEquals(m2.desligarMotor(), "O motor do " + modelo2 + " foi desligado agora.");
		Assert.assertEquals(m3.desligarMotor(), "ATENÇÃO: O motor do " + modelo3 + " não foi desligado pois o carro está em movimento.");
		
	}
	
	@Test
	public void acelerarTeste() {
		
		//Cenário
		String modelo1 = "Ford Ka";
		String modelo2 = "Nissan Kicks";
		String modelo3 = "Renault Logan";
		Carro m1 = new Carro("Ford", modelo1, 2019);
		Carro m2 = new Carro("Nissan", modelo2, 2022, true, 0);
		Carro m3 = new Carro("Renault", modelo3, 2017, true, 60);
				
		//Ação
		System.out.println("\n" + m1.situacaoMotor());
		System.out.println(m2.situacaoMotor());
		System.out.println(m3.situacaoMotor() + "\n");
		
		//Verificação
		Assert.assertEquals(m1.acelerar(20), modelo1 + " --> ATENÇÃO: Não é possível acelerar com o motor desligado!");
		Assert.assertEquals(m2.acelerar(20), modelo2 + " --> ACELEROU!!! Velocidade atual: " + m2.getVelocidade() + " Km/h.");
		Assert.assertEquals(m3.acelerar(20), modelo3 + " --> ACELEROU!!! Velocidade atual: " + m3.getVelocidade() + " Km/h.");
	}
	
	@Test
	public void frearTeste() {
		
		//Cenário
		String modelo1 = "Ford Ka";
		String modelo2 = "Nissan Kicks";
		String modelo3 = "Renault Logan";
		Carro m1 = new Carro("Ford", modelo1, 2019);
		Carro m2 = new Carro("Nissan", modelo2, 2022, true, 0);
		Carro m3 = new Carro("Renault", modelo3, 2017, true, 60);
				
		//Ação
		System.out.println("\n" + m1.situacaoMotor());
		System.out.println(m2.situacaoMotor());
		System.out.println(m3.situacaoMotor() + "\n");
		
		//Verificação
		Assert.assertEquals(m1.frear(40), modelo1 + " --> ATENÇÃO: O motor está desligado! O carro já está parado!");
		Assert.assertEquals(m2.frear(40), modelo2 + " --> ATENÇÃO: O carro já está parado!");
		Assert.assertEquals(m3.frear(40), modelo3 + " --> FREOU!!! Velocidade atual: " + m3.getVelocidade() + " km/h.");
		
	}

}
