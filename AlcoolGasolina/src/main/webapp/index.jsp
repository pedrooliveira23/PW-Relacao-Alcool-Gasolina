<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Rela��o �lcool/Gasolina</title>


<link href="css/form.css" rel="stylesheet">
<script src="js/form.js"></script>

<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>

	<!--
    you can substitue the span of reauth email for a input with the email and
    include the remember me checkbox
    -->
	<div class="container">
		<div class="card card-container">
			<!-- <img class="profile-img-card" src="//lh3.googleusercontent.com/-6V8xOA6M7BA/AAAAAAAAAAI/AAAAAAAAAAA/rzlHcD0KYwo/photo.jpg?sz=120" alt="" /> -->
			<h2 class="text-center">Rela��o �lcool/Gasolina</h2>
			<br> <img id="profile-img" class="profile-img-card"
				src="images/logo.jpg" />
			<p id="profile-name" class="profile-name-card"></p>
			<form class="form-signin">
				<span id="reauth-email" class="reauth-email"></span> <input
					type="text" name="alcool" class="form-control"
					placeholder="Pre�o do Alcool" required autofocus> <input
					type="text" name="gasolina" class="form-control"
					placeholder="Pre�o da Gasolina" required>
				<button class="btn btn-lg btn-primary btn-block btn-signin"
					type="submit">Calcular</button>
				<br>
					<%
           	model.CalculadoraRelacao calculadora = (model.CalculadoraRelacao) request.getAttribute("calcular");

            if (calculadora.getPrecoAlcool() == 0 || calculadora.getPrecoGasolina() == 0) {
%>
					<h4>valores est�o zerados, coloque os pre�os!!!</h4>
					<%
            } else {
              %>
					<h4>Resultado: <%=calculadora.calcularResultado()%></h4>
					<%
            }
            %>
			</form>
			<!-- /form -->
		</div>
		<!-- /card-container -->
	</div>
	<!-- /container -->
</body>
</html>