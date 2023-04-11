<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Example</title>
</head>
<body>

<?php
	$Continents = array("North America", "South America", "Antarctica");
	//print_r($Continents);
	
	foreach ($Continents as $temp) {
		echo $temp, "<br />";
	}

	//$price = 5;
	//$quantity = 1;
	//$maxquantity = 40;
	
	//echo "<table>";
	//echo "<tr><th>Amount&nbsp;</th>";
	//echo "<th>Price</th></tr>";
	
	/*while ($quantity <= $maxquantity) {
		echo "<tr><td>";
		echo $quantity;
		echo "</td><td>";
		echo $quantity * $price;
		echo "</td></tr>";
		$quantity *= 2;
	}*/
	
	/*do {
		echo "<tr><td>";
		echo $quantity;
		echo "</td><td>";
		echo $quantity * $price;
		echo "</td></tr>";
		$quantity *= 2;	
	} while ($quantity <= $maxquantity) ;*/
	
	/*for ($quantity = 1; $quantity <= $maxquantity; $quantity *= 2) {
		echo "<tr><td>";
		echo $quantity;
		echo "</td><td>";
		echo $quantity * $price;
		echo "</td></tr>";	
	}
	
	echo "</table>";*/
?>

</body>
</html>