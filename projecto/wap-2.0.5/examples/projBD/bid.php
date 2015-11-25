<html>
<body>
	<?php

    // Inicia session, funções auxiliares, conexão à BD
	include 'connection.php';	

	// Verifica a autenticação
	include 'authentication.php';	

// Carregamento das variáveis username e pin do form HTML através do metodo POST;
	if ($_SERVER["REQUEST_METHOD"] == "POST") {
		$lid = test_input($_POST["lid"]);
	}


//efetuar um lance

echo("<p> Efectuar um lance para o leilão $lid </p>");

echo(
"<form action=\"bidconfirmed.php\" method=\"post\">
		<h3>Escolha o valor do lance</h3>
		<input type=\"hidden\" name=\"lid\" value=\"$lid\" >
		<p>Valor : <input type=\"number\" name=\"valor\" /></p>
		<p><input type=\"submit\" value=\"Lançar\" /></p>
	</form>"
 );

include ('buttons.php'); 

?>
</body>
</html>