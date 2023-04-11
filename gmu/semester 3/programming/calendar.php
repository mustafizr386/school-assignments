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

<div class= entry>
Student Name:
<input type="text" value="name" name="name"/>
Student Email:
<input type="text" value="example@email.com" name="email"/>
<input type="submit" />
<input type="submit" value="Clear" />

</div>
<h1>
Office Hours Setup Form
</h1>

<?php
echo "<div id=\"year\">".date("F Y") ."</div>";

$start = 8-(date("j") % 7 - (date("w")+1));
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
			echo "<div class=\"col" . strval($y) . " row". strval($x)."\">".($pos+1 - $start) ."</div>";
			$pos++;
		}
		
	}
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