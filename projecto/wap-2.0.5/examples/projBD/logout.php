<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<body>
<?php
try{
	session_start();
	$username = $_SESSION['username'];
	session_destroy();

	echo ("<p>Sessão da Pessoa $username terminada</p>");
} catch (Exception $e) {
	echo $e->getMessage();
}


?>

<a href="login.htm"><button>Voltar à página de login</button></a>	

	
</body>
</html>
