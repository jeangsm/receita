package main;

import java.util.ArrayList;
import java.util.List;

public class Cozinha {
	private List<Receita> receitas;
	
	public Cozinha() {
		receitas = new ArrayList<>();
	}
	
	public void adiciona(Receita receita) {
		receitas.add(receita);
	}
	
	public List<Receita> receitas() {
		return receitas;
	}
}
