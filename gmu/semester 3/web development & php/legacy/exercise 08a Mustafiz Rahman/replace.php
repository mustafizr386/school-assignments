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
<h3> replacement output </h3>

	<?php
	$subject = explode(" ","create a two text field web form where one field allows the user to specify the text string to search for and the other field allows the user to specify the replacement string. The page should also show a sentence of your choosing that the search and replace will be performed on. Take the input from the from and using appropriate string functions perform the search and replace on the sentence and return the updated sentence to the user/browser.");
	$find = $_GET["find"];
	$replace = $_GET["replace"];
	$outputstring = "";

	foreach($subject as $x)
	{
		
		if($x == $find)
		{
			$outputstring = $outputstring . $replace . " ";
		}
		else
		{
			$outputstring = $outputstring . $x . " ";
		}
	}
	echo $outputstring;
	?>



</div>


<div class="copyright">there is nothing that requires a copyright notice</div>


</body>

</html>
