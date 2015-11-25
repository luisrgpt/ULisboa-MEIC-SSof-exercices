<html>
<body>
<?php
    // Inicia session, funções auxiliares, conexão à BD
	include 'connection.php';

	// Verifica a autenticação
	include 'authentication.php';	


	try{	
		//Vai buscar as datas dos leiloes em que se pode inscrever 
		$sql = "SELECT DISTINCT lr.dia 
		FROM leilao l, leilaor lr 
		WHERE l.nif=lr.nif and 
		l.dia=lr.dia and 
		l.nrleilaonodia=lr.nrleilaonodia and 
		datediff(current_date,date_add(lr.dia,Interval lr.nrdias day))<=0;";

		$result = $connection->query($sql);  // não precisa de query segura, pois não há input externo
	}catch (Exception $e){
		echo $e->getMessage();
	}
?>
	<form action="escolherLeiloesData.php" method="post"> 
	Escolha o dia de inicio dos leilões em que se pretende inscrever:</br>
	<p>
	<select name="formDate">
		<?php
		foreach($result as $row){
			echo("<option value=\"" . $row["dia"] . "\">" . $row["dia"] . "</option>");
		}
		?>	
	</select>	
	</p>
	<p><input type="submit" /></p>
	</form>
	

<?php include ('buttons.php'); ?>

</body>
</html>
