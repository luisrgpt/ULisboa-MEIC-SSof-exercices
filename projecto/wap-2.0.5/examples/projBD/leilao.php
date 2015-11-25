<html>
<body>
	<?php

    // Inicia session, funções auxiliares, conexão à BD
	include 'connection.php';	

	// Verifica a autenticação
	include 'authentication.php';	

// Carregamento da variável lid do form HTML através do metodo POST;
	if ($_SERVER["REQUEST_METHOD"] == "POST") {
		$leiloes = $_POST['inscreverLeiloes'];
	}

try{

	if(empty($leiloes)){		
		echo("Nao foi seleccionado nenhum leilão!");
	} else {

	foreach ($leiloes as $lid) {
	// verifica que não esteja já inscrito 
		$sql = "SELECT * from concorrente WHERE pessoa=:nif AND leilao=:lid"; 
		$parameters = array( ":nif"=>$nif, ":lid"=>$lid	);
		$result = secure_query( $connection, $sql, $parameters );
		if (!($result->rowCount() == 0)) { 
			echo ("<p> Já está inscrito no leilão $lid ! <p>");
		} 
		else   // se não estiver inscrito, continua
		{     
			$sql = "INSERT INTO concorrente (pessoa,leilao) VALUES (:nif, :lid)";
			$parameters = array( ":nif"=>$nif, ":lid"=>$lid);
			$result = secure_query( $connection, $sql, $parameters );
			if ($result->rowCount() == 0) {
				echo("<p> Erro na Query:($sql) <p>");
				$connection = null;
				exit();
			}

			echo("<p> Pessoa ($username), nif ($nif) Registada no leilão ($lid)");
			
			echo ("	<form action=\"bid.php\" method=\"post\">
					<input type=\"hidden\" name=\"lid\" value=" . $lid . " >
					<input type=\"submit\" value=\"Fazer um lance\" />
					</form></p>  ");
		}	
	}
}
} catch (Exception $e) {
	echo $e->getMessage() ;
}	

include ('buttons.php'); 

?>


</body>
</html>