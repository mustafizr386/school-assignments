<?php
$testfloat = 3.14;
$floattostring = 1.33;
settype($floattostring,"string");
echo "testfloat: ";
echo gettype($testfloat);
echo ", " . $testfloat . "<br>";
echo "floattostring: ";
echo gettype($floattostring);
echo ", " . $floattostring . "<br>";

//--------------------------------
echo "<br>" . "start of 4b-------------------------------" . "<br>". "<br>";

$lakesarraytype1 = array("Lake_Superior", "Lake_Michigan", "Lake_Ontario", "Lake_Erie", "Lake_Huron");
$lakesarraytype2[] = "Lake_Superior";
$lakesarraytype2[] = "Lake_Michigan";
$lakesarraytype2[] = "Lake_Ontario";
$lakesarraytype2[] = "Lake_Erie";
$lakesarraytype2[] = "Lake_Huron";

print_r($lakesarraytype1);
echo "<br>";
print_r($lakesarraytype2);
echo "<br>" . "different printing method" . "<br>" ;
echo $lakesarraytype2[0] . "<br>" . $lakesarraytype2[1] . "<br>" . $lakesarraytype2[2] . "<br>" . $lakesarraytype2[3] . "<br>" . $lakesarraytype2[4] . "<br>";

//--------------------------------
echo "<br>" . "start of 4c-------------------------------" . "<br>". "<br>";

$bankdeposit = 12.75;
echo "current balance is: $" . $bankdeposit . "<br>";
echo "depositing $1.00" . "<br>";
$bankdeposit++;
echo "current balance is: $" . $bankdeposit . "<br>";
echo "depositing another $1.00" . "<br>";
++$bankdeposit;
echo "current balance is: $" . $bankdeposit . "<br>";

//--------------------------------
echo "<br>" . "start of 5a-------------------------------" . "<br>". "<br>";

$month = (int) date("m");
$year = (int) date("Y");
$daysinmonth = (int)cal_days_in_month(CAL_GREGORIAN, $month, $year);

echo "there are " . $daysinmonth . " days this month" . "<br>";

if ($daysinmonth == 31)
{
	echo "this month is a leap month" . "<br>";
}
else
{
	echo "this month isn't a leap month" . "<br>";
}

//--------------------------------
echo "<br>" . "start of 5b-------------------------------" . "<br>". "<br>";

function printmodnum($a, $b)
{
	echo $a . " % " . $b . " = " . $a % $b . "<br>";
}

function returnmodnum($a, $b)
{
	return $a % $b;
}

printmodnum(542, 61);

echo "the returned value of 982 % 43 is " . returnmodnum(982,43). "<br>"; 

?>