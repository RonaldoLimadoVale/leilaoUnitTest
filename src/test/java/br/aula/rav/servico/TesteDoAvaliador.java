package br.aula.rav.servico;

import org.junit.Test;

import br.aula.rav.dominio.Lance;
import br.aula.rav.dominio.Leilao;
import br.aula.rav.dominio.Usuario;
import br.aula.rav.servico.Avaliador;
import junit.framework.Assert;

public class TesteDoAvaliador {

	@SuppressWarnings("deprecation")
	@Test
	public void deveEntenderLancesEmOrdemCrescente() {
		// Parte 1 -> Cen�rio
		Usuario joao = new Usuario("Jo�o");
		Usuario jose = new Usuario("Jos�");
		Usuario maria = new Usuario("Maria");
		
		Leilao leilao = new Leilao("TV 60 polegadas");
		
		leilao.propoe(new Lance(joao, 3000));
		leilao.propoe(new Lance(jose, 3400));
		leilao.propoe(new Lance(maria, 3300));
		
		// Parte 2 -> A��o
		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);
		
		// Parte 3 -> Valida��o
		double maiorEsperado = 3400;
		double menorEsperado = 3000;
		
		Assert.assertEquals(maiorEsperado, avaliador.getMaiorLance(), 0.00001);
		Assert.assertEquals(menorEsperado, avaliador.getMenorLance(), 0.00001);
	}
}
