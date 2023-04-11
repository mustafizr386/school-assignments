﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN""http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head>  <link rel="stylesheet" type="text/css" href="../style.css" />	<link rel="stylesheet" type="text/css" href="style.css" /></head><body><div class="directory"><h2><a href="../homepage.html"> Hompage </a></h2><h2>Exercises</h2><ul><li><a href="../exercise1/index.html">Exercise 1</a></li><li><a href="../exercise2/index.html">Exercise 2</a></li><li><a href="../exercise3/index.html">Exercise 3</a></li><li><a href="../exercise4/index.html">Exercise 4</a></li><li><a href="../exercise5/index.html">Exercise 5</a></li><li><a href="../exercise6/index.html">Exercise 6</a></li><li><a href="../exercise7/index.html">Exercise 7</a></li><li><a href="../exercise8/index.html">Exercise 8</a></li><li><a href="../exercise9/index.html">Exercise 9</a></li><li><a href="../exercise10/index.html">Exercise 10</a></li></ul><h2>Images</h2><ul><li><a href="../images/imagedirectory.html">Image Directory</a></li></ul><h2>Lab Assigments</h2><ul><li><a href="../lab1/index.html">Lab 1</a></li><li><a href="../lab2/index.html">Lab 2</a></li><li><a href="../lab3/index.html">Lab 3</a></li><li><a href="../lab4/index.html">Lab 4</a></li></ul><h2>Practicum</h2><ul><li><a href="../practicum1/index.html">Lab 1</a></li><li><a href="../practicum2/index.html">Lab 2</a></li><li><a href="../practicum3/index.html">Lab 3</a></li></ul></div><div class="heading"><div class="classrelatedstuff"><h2> IT 207 DL3 (Fall 2021) </h2><h3> Daniel Garrison, Eswar Kamineni</h3><h3> George Mason University </h3></div><div class="nameandemail"><h2>Mustafiz Rahman</h2><h3>GMU Email: mrahma42@gmu.edu<h3></div></div><div class="lab"><?php$month = intval($_POST["month"]);$day = intval($_POST["day"]);$year = intval($_POST["year"]);if($month == "" || $day == "" || $year == ""){	header('Location: empty.html');}else if($month < 1 || $month > 12){	header('Location: invalid.php?error=month');}else if($year < 1970 || $year > 2038){	header('Location: invalid.php?error=year');}else if($day > cal_days_in_month(CAL_GREGORIAN, $month, $year)){	header('Location: invalid.php?error=day');}else{	$start = jddayofweek(gregoriantojd($month,1,$year),0) + 1;	$end = cal_days_in_month(CAL_GREGORIAN, $month, $year) + $start;	$pos = 1;	$days = array("Sunday","Monday","Tuesday","Wensday","Thursday", "Friday", "Saturday");	for($x=1; $x<=7; $x++)	{		for($y=1; $y<=7;$y++)		{			if($x == 1)			{				echo "<div class=\"col" . strval($y) . " row". strval($x)."\">". $days[$y-1] ."</div>";			}			else if($pos < $start || $pos >= $end)			{				echo "<div class=\"col" . strval($y) . " row". strval($x)."\"> </div>";				$pos++;			}			else			{				if(($pos+1 - $start) == $day)				{					echo "<div style = \"background-color: rgb(97, 97, 97);\" class=\"col" . strval($y) . " row". strval($x)."\">".($pos+1 - $start) ."</div>";				}				else				{					echo "<div class=\"col" . strval($y) . " row". strval($x)."\">".($pos+1 - $start) ."</div>";				}								$pos++;			}					}	}	for($x = 0; $x < 28; $x++)	{		echo "<br>";	}	$savefile = fopen("dates.txt", "a");	if(flock($savefile, LOCK_EX))	{		fwrite($savefile, $month. "/".$day."/".$year . "\n");		echo "write sucessful<br>";		echo "<a href = \"dates.txt\">View the dates stored in the text file</a>";		flock($savefile, LOCK_UN);		fclose($savefile);	}	else	{		echo "server busy, couldn't write to file.<br>";	}}?></div><div class="copyright">there is nothing that requires a copyright notice</div></body></html>