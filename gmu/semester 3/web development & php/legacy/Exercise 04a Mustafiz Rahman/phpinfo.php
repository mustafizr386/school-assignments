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
//phpinfo();
?>
