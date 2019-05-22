package main;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
	private List<Receita> receitas;
	
	public Cardapio() {
		receitas = new ArrayList<>();
	}
	
	public void adiciona(Receita receita) {
		receitas.add(receita);
	}
	
	public List<Receita> receitas() {
		return receitas;
	}
}
