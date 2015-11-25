	<html>
	<body>
		<?php

    // Inicia session, funções auxiliares, conexão à BD
	include 'connection.php';	

	// Carregamento das variáveis username e pin do form HTML através do metodo POST;
		if ($_SERVER["REQUEST_METHOD"] == "POST") {
			$username = test_input($_POST["username"]);
			$pin = test_input($_POST["pin"]);
		}

    // Verifica a autenticação
	include 'authentication.php';	


	// Apresenta os leilões
	$sql = "SELECT * FROM leilao l, leilaor lr WHERE l.nif=lr.nif and l.dia=lr.dia and l.nrleilaonodia=lr.nrleilaonodia 
	and datediff(current_date,date_add(lr.dia,Interval lr.nrdias day))<=0 ORDER BY lr.lid ASC;";

	$result = secure_query( $connection, $sql, array());
	echo (	"<h3>Escolha os leilões aos quais pretende concorrer</h3>");
	echo ("<form action=\"leilao.php\" method=\"post\">");

	echo("<table border=\"1\">\n");
	echo(	"<tr><td>ID</td>
				<td>Inscrever</td>
				<td>nif</td>
				<td>diahora</td>
				<td>NrDoDia</td>
				<td>nome</td>
				<td>tipo</td>
				<td>valorbase</td></tr>\n");

	foreach($result as $row) {
		echo("<tr><td>");
		echo($row["lid"]); echo("</td><td>");
		echo("<input type=\"checkbox\" name=\"inscreverLeiloes[]\" value=\"" . $row["lid"] . "\" />"); echo("</td><td>");
		echo($row["nif"]); echo("</td><td>");
		echo($row["dia"]); echo("</td><td>");
		echo($row["nrleilaonodia"]); echo("</td><td>");
		echo(utf8_encode( $row["nome"])); echo("</td><td>");
		echo($row["tipo"]); echo("</td><td>");
		echo($row["valorbase"]); echo("</td></tr>");
			}
	echo("</table>\n");
	?>
	<p><input type="submit" value="Efectuar inscrição" /></p>
	</form>

<?php include ('buttons.php'); ?>

</body>
</html>