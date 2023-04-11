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
<li><a href="../lab4/index.html">Lab 4</a></li>
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
<h3> why even try </h3>
<p>
it's funny, you'd think that if you make what is requested then it'd be the job of a teacher to evaluate it. 
<br> It seems i've been mistaken all these years and that actually isn't the case, at least at mason in it 207
<br>You might think complaining on a past assignment is petty (i mean it objectively is), but what can i do? I guess all i can do is just sulk.
<br>Seriously though, what was done last assignment was messed up. I had everything done and just because i decided to not turn in the useless second submission i get a 0
<br> i figure i'm pushing my luck too much anyways, i mean who knows maybe i could get in trouble for just being disappointed in a class. I've seen more ridiculous things in my life.
<br> Especially at this this school. Don't take this as me being pissed, but instead as me being disappointed in spending 4 hours doing a worthless assignment. But i guess that's assuming this will ever be read.
<br> maybe this will just end up as a piece of memory for me to cringe at year later.
<br>anyways, make a comment down below on what you think.
</p>
<h1>Comments</h1>

	<?php
	$name = $_POST["name"];
	$email = $_POST["email"];
	$comment = $_POST["comment"];
	$inputarr = array();
	$ascending = false;
	$decending = false;
	$huh = false;

	if($_GET["ascending"] == 1)
	{
		$ascending = true;
	}

	if($_GET["decending"] == 1)
	{
		$decending = true;
	}
	$delete = $_POST["delete"];
	$data = array();

	$arrpos = 0;
	$servererror = false;
	$comments = fopen("comments.txt","r");
	if(flock($comments, LOCK_SH))
	{
		
		$temp = trim(fgets($comments));
		while($temp != false)
		{
			if(strcmp($temp,$name) == 0)
			{
				#what the hell??
				$huh = true;
				header('Location: failed.html');
			}
			array_push($data, array($temp,trim(fgets($comments)),trim(fgets($comments))));
			$temp = trim(fgets($comments));
		}
		
	}
	else
	{
		echo "server busy, please try again<br><br>";
		$servererror = true;
	}
	flock($comments, LOCK_UN);
	fclose($comments);	
	
	if($name != null && !$huh)
	{
		$comments = fopen("comments.txt","a");
		$inputarr = $_SESSION["inputarr"];
		$store = $name. "\n" . $email . "\n" . $comment . "\n";	

		if(flock($comments, LOCK_EX))
		{
			fwrite($comments, $store);
		}
		else
		{
			echo "server busy, please try again<br><br>";
		}
		
		flock($comments, LOCK_UN);
		fclose($comments);	
		$loc = 'Location: added.php?name=' . $name . '&email=' . $email . '&comment=' . $comment;
		header($loc);
	}
	
	if($delete > 0 && $delete <= count($data)+1)
	{
		$comments = fopen("comments.txt","w");
		ftruncate($comments, 0);
		$newdata = array();
		if(flock($comments, LOCK_EX))
		{
			for($x = 0; $x < count($data); $x++)
			{
				if($x != $delete - 1)
				{
					
					fwrite($comments, $data[$x][0] . "\n" . $data[$x][1] . "\n" . $data[$x][2] . "\n");
					array_push($newdata, array($data[$x][0], $data[$x][1], $data[$x][2]));
				}
			}
		}
		else
		{
			echo "server busy, please try again<br><br>";
		}
		$data = $newdata;
		flock($comments, LOCK_UN);
		fclose($comments);	
	}
	$temp = $data;
	
	if($ascending)
	{
		sort($temp);
	}
	
	if($decending)
	{
		rsort($temp);
	}

	$nupos = 0;
	for($x = 0; $x < count($temp); $x++)
	{
		echo "<hr>";
		while($data[$nupos] != $temp[$x])
		{
			$nupos++;
		}
		echo "<div style = \"position: absolute; padding-top: 10px;\"><b>". ($nupos + 1) . "<b></div>";
		echo "<div style = \"text-indent: 40px\"> <b>Name:</b> <a href= \"mailto:" . $temp[$x][1] . "\">". $temp[$x][0] . "</a></div>";
		echo "<div style = \"text-indent: 40px\"> <b>Comments:</b>" . $temp[$x][2] . "</div>";
		
		$nupos = 0;
	}
	echo "<hr>";
	

	
	flock($comments, LOCK_UN);
	fclose($comments);
	
	?>
<a href = "index.html"> Add New Comments </a>
<br>
<a href = "comment.php?ascending=1"> Sort Comment A-Z (by name)</a>
<br>
<a href = "comment.php?decending=1"> Sort Comment Z-A (by name)</a>
<br>
<form action="comment.php" method="post">
			
			Delete Comment Number: <input type="text" name="delete" size = "2" />
			
			<input type="submit" value="Delete" />
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
