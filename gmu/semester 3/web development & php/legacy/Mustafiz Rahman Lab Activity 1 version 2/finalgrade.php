
 
 
 
 
<html>
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
<h3>GMU Email: <a href = "mailto: mrahma42@gmu.edu">mrahma42@gmu.edu</a><h3>
</div>


</div>

<div class="lab">
<h3> IT 207 Final Grade Determiner </h3>

<?php
$earnedParticipation = $_POST['earnedParticipation'];
$maxParticipation = $_POST['maxParticipation'];
$weightParticipation = $_POST['weightParticipation'];

$earnedQuiz = $_POST['earnedQuiz'];
$maxQuiz = $_POST['maxQuiz'];
$weightQuiz = $_POST['weightQuiz'];

$earnedLab = $_POST['earnedLab'];
$maxLab = $_POST['maxLab'];
$weightLab = $_POST['weightLab'];

$earnedPracticum = $_POST['earnedPracticum'];
$maxPracticum = $_POST['maxPracticum'];
$weightPracticum = $_POST['weightPracticum'];

$participationPercent = ((int)$earnedParticipation *100) / (int)$maxParticipation;
$quizPercent = ((int)$earnedQuiz *100) / (int)$maxQuiz;
$labPercent = ((int)$earnedLab *100) / (int)$maxLab;
$practicumPercent = ((int)$earnedPracticum *100) / (int)$maxPracticum;

$paricipationWeighted = ((float)$participationPercent/100) * (float)$weightParticipation ;
$quizWeighted = ((float)$quizPercent/100) * (float)$weightQuiz ;
$labWeighted = ((float)$labPercent/100) * (float)$weightLab ;
$practicumWeighted = ((float)$practicumPercent/100) * (float)$weightPracticum ;

echo "You earned a ". $participationPercent . "% for Participation, with a weighted value of ". $paricipationWeighted . "%<br><br>";

echo "You earned a ". $quizPercent . "% for quiz, with a weighted value of ". $quizWeighted . "%<br><br>";

echo "You earned a ". $labPercent . "% for lab, with a weighted value of ". $labWeighted . "%<br><br>";

echo "You earned a ". $practicumPercent . "% for practicum, with a weighted value of ". $practicumWeighted . "%<br><br>";

$finalGrade = $practicumWeighted + $labWeighted + $quizWeighted + $paricipationWeighted;
$gradeLetter = "F";
if($finalGrade >= 92)
{
$gradeLetter = "A";
}
elseif($finalGrade >= 90)
{
	$gradeLetter = "A-";
}
elseif($finalGrade >= 87)
{
	$gradeLetter = "B+";
}
elseif($finalGrade >= 83)
{
	$gradeLetter = "B";
}
elseif($finalGrade >= 80)
{
	$gradeLetter = "B-";
}
elseif($finalGrade >= 77)
{
	$gradeLetter = "C+";
}
elseif($finalGrade >= 73)
{
	$gradeLetter = "C";
}
elseif($finalGrade >= 70)
{
	$gradeLetter = "C-";
}
elseif($finalGrade >= 64)
{
	$gradeLetter = "D";
}
echo "<b>Your Final Grade is a " . $finalGrade . "%, which is an " . $gradeLetter . ".</b>";



?>

<form action="index.html" method="post">
 <input type="submit" value = "Return" />
 </form>



</div>


<div class="copyright">there is nothing that requires a copyright notice</div>


</body>

</html>

<!--thanks for making this one of my more liked classes to my least-->