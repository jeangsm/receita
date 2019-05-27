package main;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.Bolo;
import main.Cardapio;
import main.Pastel;
import main.Receita;

public class CozinhaTest {
	private Cardapio caseiro;

	@Before
	public void inicializa() {
		caseiro = new Cardapio();
		caseiro.adiciona(new Bolo());
		caseiro.adiciona(new Pastel());
	}
	
	@Test
	public void testaSeReceitaEBolo() {
		List<Receita> receitas = caseiro.receitas();
		assertEquals("Bolo de chocolate", receitas.get(0).prato());
	}

	@Test
	public void testaSeReceitaEPastel() {
		List<Receita> receitas = caseiro.receitas();
		assertEquals("Pastel de Carne", receitas.get(1).prato());
	}
}
