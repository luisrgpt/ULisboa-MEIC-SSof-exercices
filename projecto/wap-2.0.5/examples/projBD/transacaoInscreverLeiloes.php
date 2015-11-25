
<html>
<body>
<?php

    // Inicia session, funções auxiliares, conexão à BD
	include 'connection.php';

	// Verifica a autenticação
	include 'authentication.php';	

	if ($_SERVER["REQUEST_METHOD"] == "POST") {
		$leiloes = $_POST['inscreverLeiloes'];
	}


	if(empty($leiloes)){
		echo("Nao foi selecionado nenhum leilão!");
	}else{
		try{
			$connection->beginTransaction();
			foreach($leiloes as $lid){
				$sql = "INSERT INTO concorrente (pessoa,leilao) VALUES (:nif,:lid)";
				$parameters = array(":nif"=>$nif,":lid"=>$lid);
				secure_query( $connection, $sql, $parameters);
			}
			$connection->commit();
			echo("Inscrição feita com sucesso!");	
		} catch (Exception $e) {
			$connection->rollBack();
			echo("Inscrição falhou! Todas as suas inscrições feitas na pagina anterior foram anuladas! Erro: ");
			echo $e->getMessage();
		}
	}

	include ('buttons.php'); 
	
?>


</body>
</html>
