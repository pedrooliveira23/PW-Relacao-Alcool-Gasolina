package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CalculadoraRelacao;

@WebServlet(value = "/AlcoolGasolina")
public class Controlador extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String paramAlcool = req.getParameter("alcool");
		Double alcool = paramAlcool == null ? 0.0 : Double
				.parseDouble(paramAlcool);

		String paramGasolina = req.getParameter("gasolina");
		Double gasolina = paramGasolina == null ? 0.0 : Double
				.parseDouble(paramGasolina);

		CalculadoraRelacao calc = new CalculadoraRelacao(alcool, gasolina);
		calc.calcularRelacao();
		calc.calcularResultado();

		req.setAttribute("calcular", calc); // Passando um objeto para o JSP.

		// Chamar o JSP apenas para mostrar o resultado.
		req.getRequestDispatcher("AlcoolGasolina/index.jsp").forward(req, resp);
	}

}
