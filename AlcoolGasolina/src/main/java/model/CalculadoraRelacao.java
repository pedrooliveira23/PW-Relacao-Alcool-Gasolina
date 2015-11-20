package model;

public class CalculadoraRelacao {
	private double precoAlcool, precoGasolina, resultado;
	
	
	public CalculadoraRelacao (double precoAlcool, double precoGasolina) {
		this.setPrecoAlcool(precoAlcool);
		this.setPrecoGasolina(precoGasolina);
	}
	
	public void calcularRelacao () {
		setResultado(getPrecoAlcool() / getPrecoGasolina());
	}
	
	public String calcularResultado () {
		if (getResultado() < 0.7) {
			return "Abasteça com Alcool";
		}
		
		return "Abasteça com Gasolina";
	}

	public double getPrecoAlcool() {
		return precoAlcool;
	}

	public void setPrecoAlcool(double precoAlcool) {
		this.precoAlcool = precoAlcool;
	}

	public double getPrecoGasolina() {
		return precoGasolina;
	}

	public void setPrecoGasolina(double precoGasolina) {
		this.precoGasolina = precoGasolina;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

}
