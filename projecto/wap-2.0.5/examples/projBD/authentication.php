<?php

echo("<p>Valida Pin da Pessoa $username</p>\n");



	if(!$nif) {  // se o nif não está guardado na session, o utilizador ainda não se autenticou

		// obtem o pin da tabela pessoa
		$sql = "SELECT * FROM pessoa WHERE nif= :nif";
		$result = secure_query( $connection, $sql, array(":nif"=>$username));

		if ($result->rowCount() == 0) {
			echo("<p> Erro de autenticação! <p>");
			session_destroy();
			$connection = null;
			exit();
		}
		
		foreach($result as $row){
			$safepin = $row["pin"];
			$nif = $row["nif"];
		}

		if ($safepin != $pin ) {
			echo "<p> Pin Inválido! Exit!</p>\n";
			session_destroy();
			$connection = null;
			exit();
		}

	}

	echo "<p> Pin Valido! </p>\n";
	// passa variaveis para a sessao;
	$_SESSION['username'] = $username;
	$_SESSION['nif'] = $nif;

?>