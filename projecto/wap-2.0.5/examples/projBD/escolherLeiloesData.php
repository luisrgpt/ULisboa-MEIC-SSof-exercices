<html>
<body>
<?php

    // Inicia session, funções auxiliares, conexão à BD
	include 'connection.php';

	// Verifica a autenticação
	include 'authentication.php';	

	if ($_SERVER["REQUEST_METHOD"] == "POST") {
		//$data = test_input($_POST["formDate"]);
		//Vulnerability inserted here on purpose!
		$data = $_POST["formDate"];
	}

	$data = $_POST["formDate"];
	try {

		// vai buscar os leiloes que comecam na data selecionada e que ainda nao estamos inscritos
		$sql = "SELECT * FROM leilao l, leilaor lr 
			WHERE l.nif=lr.nif and 
			l.dia=lr.dia and 
			l.nrleilaonodia=lr.nrleilaonodia and 
			lr.dia=\"" . $data . "\" and 
			datediff(current_date,date_add(lr.dia,Interval lr.nrdias day))<=0 and
			lr.lid NOT IN (SELECT concorrente.leilao FROM concorrente WHERE concorrente.pessoa= :nif );";
		
		$parameters=array(":nif"=>$nif);
		//$result = secure_query( $connection, $sql, $parameters);
		$result = mysql_query($connection, $sql); //Vulnerable on purpose to test wap!!!

		if($result->rowCount() == 0){
			echo("Nao existem Leilões em que se possa inscrever nesta data. (Causa possível: Já se inscreveu em todos) </br>");
		}else{
			?>
			Lista de Leilões que se iniciam na data selecionada disponíveis para inscrição:</br>
			<form name="formInscrever" method="POST" action="transacaoInscreverLeiloes.php"> 
			<table border="1">
			<tr><td>Inscrever</td>
				<td>ID</td>
				<td>nif</td>
				<td>diahora</td>
				<td>NrDoDia</td>
				<td>nome</td>
				<td>tipo</td>
				<td>valor base</td></tr>
			<?php
			foreach($result as $row){
				echo("<tr><td>");
				echo("<input type=\"checkbox\" name=\"inscreverLeiloes[]\" value=\"" . $row["lid"] . "\" />"); echo("</td><td>");
				echo($row["lid"]); echo("</td><td>");
				echo($row["nif"]); echo("</td><td>");
				echo($row["dia"]); echo("</td><td>");
				echo($row["nrleilaonodia"]); echo("</td><td>");
				echo(utf8_encode($row["nome"])); echo("</td><td>");
				echo($row["tipo"]); echo("</td><td>");
				echo($row["valorbase"]); echo("</td></tr>");
			}
			?>
			</table>
			<p><input type="submit" value="Efectuar inscrição" /></p>
			</form>
	<?php
	}
	}catch (Exception $e){
		echo $e->getMessage();
	}


	include ('buttons.php'); 

	?>

</body>
</html>
