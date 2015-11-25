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
		$valor = test_input($_POST["valor"]);
	}

// verificar os dados do lance a efectuar
$sql = "SELECT X.leilao, MAX(X.valor) AS valor FROM 
			((SELECT leilao, MAX(valor) AS valor FROM lance WHERE leilao=:lid GROUP BY leilao)
			UNION
			(SELECT lr.lid AS leilao, l.valorbase AS valor
			FROM leilao l, leilaor lr
			WHERE 	l.nif=lr.nif AND
					l.nrleilaonodia=lr.nrleilaonodia AND
					l.dia=lr.dia AND  
					lr.lid=:lid))
		AS X 
		GROUP BY X.leilao;";
$parameters = array(":lid" => $lid);
$result = secure_query( $connection, $sql, $parameters);
if ($result->rowCount() == 0) {
	echo("<p> Erro na Query:($sql) <p>");
	$connection = null;
	exit();
}
foreach ($result as $row) {
	$max = $row['valor'];
}
if ($max>=$valor) {
echo("<p> Valor actual ($max) maior ou igual do que o valor licitado ($valor) <p>");
	$connection = null;
}
else
{
	//efetuar o lance
	$sql = "INSERT INTO lance(pessoa,leilao,valor) values (:nif,:lid,:valor); ";
	$parameters = array(":nif" => $nif, ":lid" => $lid, ":valor" => $valor);
	$result = secure_query( $connection, $sql, $parameters);
	if ($result->rowCount() == 0) {
		echo("<p> Erro na Query:($sql) <p>");
	}
	else
	{
	echo("<p> Lance efectuado com sucesso! </p>\n");
	}
}

include ('buttons.php'); 

?>



</body>
</html>