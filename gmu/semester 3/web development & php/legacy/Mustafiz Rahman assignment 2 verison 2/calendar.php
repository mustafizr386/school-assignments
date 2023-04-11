<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN"
"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <link rel="stylesheet" type="text/css" href="../style.css" />
  <link rel="stylesheet" type="text/css" href="style.css" />

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
<form>
<div class= entry>
Student Name:
<input type="text" value="name" name="name"/>
Student Email:
<input type="text" value="example@email.com" name="email"/>
<form>
<input type="submit" />
<input type="reset" value="Clear" />

</div>
<h1>
Office Hours Setup Form
</h1>

<?php
session_start();
$email = $_GET['email'];
if($email != "example@email.com" && $email != null)
{
	mail($email, "meeting scheduled", "you are to meet at the time you specified on the calendar", "mrahma42@gmu.edu");
	echo "email sucessfuly sent from mrahma42@gmu.edu"; 
	
}

echo "<div id=\"year\">".date("F Y") ."</div>";
if($_SESSION["monday"] == null || $_GET['days_mon'] != null)
{
	$mondayarr =$_GET['days_mon'];
	$_SESSION["monday"] = $mondayarr;
}
else
{
	$mondayarr = $_SESSION["monday"];
}
if($_SESSION["tuesday"] == null || $_GET['days_tues'] != null)
{
	$tuesdayarr=$_GET['days_tues'];
	$_SESSION["tuesday"] = $tuesdayarr;
}
else
{
	$tuesdayarr = $_SESSION["tuesday"];
}
if($_SESSION["wensday"] == null || $_GET['days_wens'] != null)
{
	$wensdayarr=$_GET['days_wens'];
	$_SESSION["wensday"] = $wensdayarr;
}
else
{
	$wensdayarr = $_SESSION["wensday"];
}
if($_SESSION["thursday"] == null || $_GET['days_thurs'] != null)
{
	$thursdayarr=$_GET['days_thurs'];
	$_SESSION["thursday"] = $thursdayarr;
}
else
{
	$thursdayarr = $_SESSION["thursday"];
}
if($_SESSION["friday"] == null || $_GET['days_fris'] != null)
{
	$fridayarr=$_GET['days_fris'];
	$_SESSION["friday"] = $fridayarr;
}
else
{
	$fridayarr = $_SESSION["friday"];
}







$buttons = array(null,$monday,$tuesday,$wensday,$thursday,$friday,null);

function makebutton($c,$z, $mondayarr, $tuesdayarr, $wensdayarr, $thursdayarr, $fridayarr)
{
	$temp = "";
	
	if($c%7 == 2)
	{
		
		foreach($mondayarr as $t)
		{
			if($_GET[$t.$z.$c] != null)
			{
				$temp = $temp . $t . " -- " . $_GET["name"]. "<br>";
			}
			else
			{
				$temp = $temp . "<input type=\"radio\" id=\"timet\" name=\"".$t.$z.$c."\" value=\"time\">" . $t . "<br>";
			}
		}
		return $temp;
	}
	else if ($c%7 == 3)
	{
		foreach($tuesdayarr as $t)
		{	
		if($_GET[$t.$z.$c] != null)
			{
				$temp = $temp . $t . " -- " . $_GET["name"]. "<br>";
			}
			else
			{
			$temp = $temp. "<input type=\"radio\" id=\"timet\" name=\"".$t.$z.$c."\" value=\"time\">" . $t . "<br>";
			}
		}
		return $temp;
	}
	else if ($c%7 == 4)
	{
		foreach($thursdayarr as $t)
		{
			if($_GET[$t.$z.$c] != null)
			{
				$temp = $temp . $t . " -- " . $_GET["name"]. "<br>";
			}
			else
			{
			$temp = $temp . "<input type=\"radio\" id=\"timet\" name=\"".$t.$z.$c."\" value=\"time\">" . $t . "<br>";
			}
		}
		return $temp;
	}
	else if ($c%7 == 5)
	{
		foreach($thursdayarr as $t)
		{
			if($_GET[$t.$z.$c] != null)
			{
				$temp = $temp . $t . " -- " . $_GET["name"]. "<br>";
			}
			else
			{
			$temp = $temp . "<input type=\"radio\" id=\"timet\" name=\"".$t.$z.$c."\" value=\"time\">" . $t . "<br>";
			}
		}
		return $temp;
	}
	else if ($c%7 == 6)
	{
		foreach($fridayarr as $t)
		{
			if($_GET[$t.$z.$c] != null)
			{
				$temp = $temp . $t . " -- " . $_GET["name"]. "<br>";
			}
			else
			{
			$temp = $temp . "<input type=\"radio\" id=\"timet\" name=\"".$t.$z.$c."\" value=\"time\">" . $t . "<br>";
			}
		}
		return $temp;
	}
}


$start = (8-(date("j") % 7 - (date("w")+1)))%7;
$end = $start + date("t");
$pos = 1;
$days = array("Sunday","Monday","Tuesday","Wensday","Thursday", "Friday", "Saturday");
for($x=1; $x<=7; $x++)
{
	for($y=1; $y<=7;$y++)
	{
		if($x == 1)
		{
			echo "<div class=\"col" . strval($y) . " row". strval($x)."\">". $days[$y-1] ."</div>";
		}
		else if($pos < $start || $pos >= $end)
		{
			echo "<div class=\"col" . strval($y) . " row". strval($x)."\"> </div>";
			$pos++;
		}
		else
		{
			
			echo "<div class=\"col" . strval($y) . " row". strval($x)."\">".($pos+1 - $start) . makebutton($y, $x, $mondayarr, $tuesdayarr, $wensdayarr, $thursdayarr, $fridayarr) ."</div>";

			
		
			$pos++;
		}
		
	}
}


?>
</form>

</div>


<div class="copyright">there is nothing that requires a copyright notice
<?php
date_default_timezone_set('EST');
echo "<br>looks like i'm also throwing the last modified date here as well " . date ("H:i:s F d Y ", getlastmod())
?>
</div>


</body>

</html>