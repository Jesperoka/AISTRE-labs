echo "starting instrumentation"

java -cp target/aistr.jar nl.tudelft.instrumentation.Main --type=fuzzing --file=problems/Problem1/Problem1.java > instrumented/Problem1.java
echo "1 done"
java -cp target/aistr.jar nl.tudelft.instrumentation.Main --type=fuzzing --file=problems/Problem2/Problem2.java > instrumented/Problem2.java
echo "2 done"
java -cp target/aistr.jar nl.tudelft.instrumentation.Main --type=fuzzing --file=problems/Problem3/Problem3.java > instrumented/Problem3.java
echo "3 done"
java -cp target/aistr.jar nl.tudelft.instrumentation.Main --type=fuzzing --file=problems/Problem4/Problem4.java > instrumented/Problem4.java
echo "4 done"
java -cp target/aistr.jar nl.tudelft.instrumentation.Main --type=fuzzing --file=problems/Problem5/Problem5.java > instrumented/Problem5.java
echo "5 done"
java -cp target/aistr.jar nl.tudelft.instrumentation.Main --type=fuzzing --file=problems/Problem6/Problem6.java > instrumented/Problem6.java
echo "6 done"
java -cp target/aistr.jar nl.tudelft.instrumentation.Main --type=fuzzing --file=problems/Problem7/Problem7.java > instrumented/Problem7.java
echo "7 done"
java -cp target/aistr.jar nl.tudelft.instrumentation.Main --type=fuzzing --file=problems/Problem8/Problem8.java > instrumented/Problem8.java
echo "8 done"
java -cp target/aistr.jar nl.tudelft.instrumentation.Main --type=fuzzing --file=problems/Problem9/Problem9.java > instrumented/Problem9.java
echo "9 done"

java -cp target/aistr.jar nl.tudelft.instrumentation.Main --type=fuzzing --file=problems/Problem11/Problem11.java > instrumented/Problem11.java
echo "11 done"
java -cp target/aistr.jar nl.tudelft.instrumentation.Main --type=fuzzing --file=problems/Problem12/Problem12.java > instrumented/Problem12.java
echo "12 done"
java -cp target/aistr.jar nl.tudelft.instrumentation.Main --type=fuzzing --file=problems/Problem13/Problem13.java > instrumented/Problem13.java
echo "13 done"
java -cp target/aistr.jar nl.tudelft.instrumentation.Main --type=fuzzing --file=problems/Problem14/Problem14.java > instrumented/Problem14.java
echo "14 done"
java -cp target/aistr.jar nl.tudelft.instrumentation.Main --type=fuzzing --file=problems/Problem15/Problem15.java > instrumented/Problem15.java
echo "15 done"
java -cp target/aistr.jar nl.tudelft.instrumentation.Main --type=fuzzing --file=problems/Problem16/Problem16.java > instrumented/Problem16.java
echo "16 done"
java -cp target/aistr.jar nl.tudelft.instrumentation.Main --type=fuzzing --file=problems/Problem17/Problem17.java > instrumented/Problem17.java
echo "17 done"
java -cp target/aistr.jar nl.tudelft.instrumentation.Main --type=fuzzing --file=problems/Problem18/Problem18.java > instrumented/Problem18.java
echo "18 done"
java -cp target/aistr.jar nl.tudelft.instrumentation.Main --type=fuzzing --file=problems/Problem19/Problem19.java > instrumented/Problem19.java
echo "19 done"

echo "done"