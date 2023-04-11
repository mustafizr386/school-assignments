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


?>