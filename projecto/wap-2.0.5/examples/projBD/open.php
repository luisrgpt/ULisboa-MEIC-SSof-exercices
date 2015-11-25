<html>
<body>
<?php

// Inicia session, funções auxiliares, conexão à BD
include 'connection.php';

// Verifica a autenticação
include 'authentication.php';	

//vizualiza os leilões em curso, apresentando os lances com maiores valores em
// cada leilão em que está inscrito e o tempo em falta para esse leilão fechar.

try{

	$sql = "(SELECT A.lid, A.dia, DATEDIFF(DATE_ADD(A.dia,INTERVAL A.nrdias DAY),CURRENT_DATE) AS fechaem, 
			A.nrleilaonodia, A.nif, X.nome, X.tipo, MAX(B.valor) AS valor, X.valorbase

	FROM leilaor A, leilao X , lance B

	WHERE 
	X.nif=A.nif AND
	X.nrleilaonodia=A.nrleilaonodia AND
	X.dia=A.dia AND
	A.lid=B.leilao AND 
	DATEDIFF(DATE_ADD(A.dia,INTERVAL A.nrdias DAY),CURRENT_DATE) >=0 AND
	A.lid in 
	(SELECT C.leilao FROM concorrente C 
	WHERE C.pessoa=:nif )

	GROUP BY A.lid) 

	UNION

	(SELECT A.lid, A.dia, DATEDIFF(DATE_ADD(A.dia,INTERVAL A.nrdias DAY),CURRENT_DATE) AS fechaem,
		A.nrleilaonodia, A.nif, X.nome, X.tipo, X.valorbase AS valor, X.valorbase

	FROM leilaor A, leilao X 

	WHERE 
	X.nif=A.nif AND
	X.nrleilaonodia=A.nrleilaonodia AND
	X.dia=A.dia AND 
	DATEDIFF(DATE_ADD(A.dia,INTERVAL A.nrdias DAY),CURRENT_DATE) >=0 AND
	A.lid IN 
	(SELECT C.leilao FROM concorrente C 
	WHERE C.pessoa=:nif )
	AND A.lid NOT IN
	(SELECT leilao FROM lance))
	;";
	$parameters = array(":nif"=>$nif);
	$result = secure_query($connection, $sql, $parameters);


// construo a tabela
	echo("<table border=\"1\">\n");
	echo("<tr><td>ID</td>
	<td>NIF</td>
	<td>Dia</td>
	<td>NrDoDia</td>
	<td>FechaEm</td>
	<td>Nome</td>
	<td>Tipo</td>
	<td>ValorCorrente</td>
	<td>EfectuarLance</td>
	</tr>\n");

// se $result for vazio, devolve uma tabela vazia
	foreach($result as $row){
		$fechado = false;
		echo("<tr><td>");
		echo($row["lid"]); echo("</td><td>");
		echo($row["nif"]); echo("</td><td>");
		echo($row["dia"]); echo("</td><td>");
		echo($row["nrleilaonodia"]); echo("</td><td>");
		echo($row["fechaem"]); echo("</td><td>");
		echo(utf8_encode( $row["nome"])); echo("</td><td>");
		echo($row["tipo"]); echo("</td><td>");
		echo(max($row["valor"],$row["valorbase"])); echo("</td><td>");
		
		echo( "<form action=\"bid.php\" method=\"post\">
		<input type=\"hidden\" name=\"lid\" value=\"" . $row["lid"] . "\" >
		<input type=\"submit\" value=\"LANCE\" />
		</form>  "); 
		echo("</td></tr>");
	}

// fecha a tabela
	echo("</table>\n");

} catch (Exception $e) {
	echo $e.getMessage();
}

include ('buttons.php'); 
	
?>
</body>
</html>