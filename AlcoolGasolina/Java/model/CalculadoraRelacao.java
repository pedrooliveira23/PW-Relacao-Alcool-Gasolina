package model;

public class CalculadoraRelacao {
	private double precoAlcool, precoGasolina, resultado;
	
	public double getPrecoAlcool () {
		return precoAlcool;
	}
	
	public double getPrecoGasolina () {
		return precoGasolina;
	}
	
	public CalcularRelacao (double precoAlcool, double precoGasolina) {
		this.precoAlcool = precoAlcool;
		this.precoGasolisa = precoGasolina;
	}
	
	public void calcularRelacao () {
		resultado = precoAlcool / precoGasolina;
	}
	
	public String calcularResultado () {
		if (resultado < 0.7) {
			return "Abasteça com Alcool";
		}
		
		return "Abasteça com Gasolina";
	}

}
