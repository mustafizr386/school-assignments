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

<form action="index.htm" method="post">
 <input type="submit" value = "Return" />
 </form>