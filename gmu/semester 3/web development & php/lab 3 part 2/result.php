<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN"
"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <link rel="stylesheet" type="text/css" href="../style.css" />

</head>

<body>

<div class="directory">
<h2><a href="../homepage.html"> Hompage </a></h2>
<h2>Exercises</h2>
<ul>
<li><a href="../exercise1/index.html">Exercise 1</a></li>
<li><a href="../exercise2/index.html">Exercise 2</a></li>
<li><a href="../exercise3/index.html">Exercise 3</a></li>
<li><a href="../exercise4/index.html">Exercise 4</a></li>
<li><a href="../exercise5/index.html">Exercise 5</a></li>
<li><a href="../exercise6/index.html">Exercise 6</a></li>
<li><a href="../exercise7/index.html">Exercise 7</a></li>
<li><a href="../exercise8/index.html">Exercise 8</a></li>
<li><a href="../exercise9/index.html">Exercise 9</a></li>
<li><a href="../exercise10/index.html">Exercise 10</a></li>
</ul>

<h2>

Images
</h2>
<ul>
<li><a href="../images/imagedirectory.html">Image Directory</a></li>
</ul>

<h2>

Lab Assigments
</h2>
<ul>
<li><a href="../lab1/index.html">Lab 1</a></li>
<li><a href="../lab2/index.html">Lab 2</a></li>
<li><a href="../lab3/index.html">Lab 3</a></li>
</ul>
</div>


<div class="heading">
<div class="classrelatedstuff">
<h2> IT 207 DL3 (Fall 2021) </h2>
<h3> Daniel Garrison, Eswar Kamineni</h3>
<h3> George Mason University </h3>
</div>


<div class="nameandemail">
<h2>Mustafiz Rahman</h2>
<h3>GMU Email: mrahma42@gmu.edu<h3>
</div>


</div>

<div class="lab">


	<?php
	session_start();
	$firstname = $_POST["firstname"];
	$lastname = $_POST["lastname"];
	$email = $_POST["email"];
	$phone = $_POST["phone"];
	$address = $_POST["address"];
	$city = $_POST["city"];
	$state = $_POST["state"];
	$zip = $_POST["zip"];   
	$position = -1;
	$inputarr = array();
	
	if($state != null)
	{
		$position = $_SESSION["position"];
		if($firstname == "" || $lastname == "" || $email == "" || $phone == "" || $address == "" || $city == "" || $zip == "")
		{
			echo "You Must enter a value in each field. Click your browser's Back button to return to the form <br><br> <a href=\"add.html\"> Return to Directory </a>";
		}
		else if($position != -1)
		{
			$contacts = fopen("data.txt","w");
			$inputarr = $_SESSION["inputarr"];
			if(flock($contacts, LOCK_EX))
			{
				for($x = 0; $x < count($inputarr); $x++)
				{
					if($x == $position)
					{
						$temp = $firstname. "\n". $lastname. "\n". $email. "\n". $phone. "\n". $address. "\n". $city. "\n". $state. "\n". $zip. "\n";	
						fwrite($contacts, $temp);
						$x = $x+7;
					}
					else
					{
						$temp = $inputarr[$x]. "\n";
						fwrite($contacts, $temp);
					}
					
				}
				echo "contact was sucessfuly modified <br><br> <a href=\"index.html\"> Return to Directory </a>";
			}
			else
			{
				echo "server busy, please try again<br><br> <a href=\"index.html\"> Return to Directory </a>";
			}
			
			flock($contacts, LOCK_UN);
			fclose($contacts);
			
			$_SESSION["position"] = -1;
		}
		else
		{
			$inputdata = $firstname. "\n". $lastname. "\n". $email. "\n". $phone. "\n". $address. "\n". $city. "\n". $state. "\n". $zip. "\n";

			$contacts = fopen("data.txt","a");
			if(flock($contacts, LOCK_EX))
			{
				fwrite($contacts, $inputdata);
				echo "contact was sucessfuly added <br><br> <a href=\"index.html\"> Return to Directory </a>";
				
			}
			else
			{
				echo "server busy, please try again<br><br> <a href=\"add.html\"> Return to Directory </a>";
			}
			
			flock($contacts, LOCK_UN);
			fclose($contacts);
		}
		
	}
	else if($firstname == "" || $lastname == "" )
	{
		echo "You Must enter a value in each field. Click your browser's Back button to return to the form<br><br> <a href=\"index.html\"> Return to Directory </a>";
	}
	else
	{
		$arrpos = 0;
		$servererror = false;
		$contacts = fopen("data.txt","r");
		if(flock($contacts, LOCK_SH))
		{
			
			$temp = trim(fgets($contacts));
			while($temp != false)
			{
				array_push($inputarr, $temp);
				if(($arrpos == 0 || $arrpos % 8 == 0) && $temp == $firstname )
				{
					$temp =trim(fgets($contacts));
					array_push($inputarr, $temp);
					if($temp == $lastname)
					{
						$position = $arrpos;
					}
					$arrpos++;
				}
				$arrpos++;
				$temp = trim(fgets($contacts));
			}
			

		}
		else
		{
			echo "server busy, please try again<br><br> <a href=\"index.html\"> Return to Directory </a>";
			$servererror = true;
		}

		if($position != -1)
		{
			$_SESSION["firstname"]= $firstname;
			$_SESSION["lastname"]= $lastname;
			$_SESSION["email"]= $inputarr[$position +2];
			$_SESSION["phone"]= $inputarr[$position +3];
			$_SESSION["address"]= $inputarr[$position +4];
			$_SESSION["city"]= $inputarr[$position +5];
			$_SESSION["state"]= $inputarr[$position +6];
			$_SESSION["zip"]= $inputarr[$position +7];
			$_SESSION["position"] = $position;
			$_SESSION["inputarr"] = $inputarr;
			header("Location: update.php");
		}
		else if($servererror == false)
		{
			echo "name wasn't found <br><br> <a href=\"index.html\"> Return to Directory </a>";
		}
		flock($contacts, LOCK_UN);
		fclose($contacts);
	}
	
	?>


</div>


<div class="copyright">there is nothing that requires a copyright notice
<?php
date_default_timezone_set('EST');
echo "<br>looks like i'm also throwing the last modified date here as well " . date ("H:i:s F d Y ", getlastmod())
?>
</div>


</body>

</html>
