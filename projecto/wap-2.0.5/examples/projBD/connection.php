<?php

	// configura unicode
	echo ("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");	

	// inicia sessão para passar variaveis entre ficheiros php
	session_start();
	$username = $_SESSION['username'];
	$nif = $_SESSION['nif'];

	// Função para limpar os dados de entrada
	function test_input($data) {
		$data = trim($data);
		$data = stripslashes($data);
		$data = htmlspecialchars($data);
		return $data;
	}

	// função para query segura
	function secure_query( $db, $statement, $parameters )	{
		try{
			$res=$db->prepare($statement);
			foreach ($parameters as $key => &$value) {
				$res->bindParam($key, $value);		
			}
			$res->execute();
			return $res;
		} catch (Exception $e) {
			echo $e->getMessage();
		}
	}

	// Variáveis de conexão à BD
	$host="db.ist.utl.pt"; // o MySQL esta disponivel nesta maquina
	$user="ist177016"; // -> substituir pelo nome de utilizador
	$password="cucs1790"; // -> substituir pela password dada pelo mysql_reset
	$dbname = $user; // a BD tem nome identico ao utilizador
	echo("<p>Projeto Base de Dados Parte II</p>\n");

	try{
	$connection = new PDO("mysql:host=" . $host. ";dbname=" . $dbname, $user, $password,
	array(PDO::ATTR_ERRMODE => PDO::ERRMODE_WARNING));
	echo("<p>Connected to MySQL database $dbname on $host as user $user</p>\n");
} catch (Exception $e) {
echo $e->getMessage();
}

?>

