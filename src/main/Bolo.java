package main;

public class Bolo implements Receita {
	
	@Override
	public String receita() {
		return "Misturar os ingredientes; bater no liquidificador; colocar no forno por 1h";
	}

	@Override
	public String prato() {
		return "Bolo de chocolate";
	}
}
