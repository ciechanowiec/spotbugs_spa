package eu.ciechanowiec.spotbugs;

import java.math.BigDecimal;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Herman Ciechanowiec
 */
class SpotBugs {

    private static final double SAMPLE_DOUBLE = 0.1;
    private static final String STRING_LOCK = "LOCK";
    private static final Lock REENTRANT_LOCK = new ReentrantLock();
    private static int counter = 0;

    public static void main(String[] args) {
        /* * * * * * * * * * * * * * * * * * * *
         * DO NOT CHANGE ANYTHING IN THIS MAIN *
         * * * * * * * * * * * * * * * * * * * */

        /* TASK 1 */
        System.out.println("TASK 1");
        BigDecimal bigDecimal = produceBigDecimal();
        System.out.printf("Generated decimal: %s%n", bigDecimal.toString());

        /* TASK 2 */
        System.out.println("\nTASK 2");
        Thread thread = produceThread();
        System.out.println("Starting new thread...");
        thread.start();

        /* TASK 3 */
        System.out.println("\nTASK 3");
        int incrementedCounterByOne = incrementCounterByOne();
        System.out.printf("Incremented counter: %d%n", incrementedCounterByOne);

        /* TASK 4 */
        System.out.println("\nTASK 4");
        int incrementedCounterByTwo = incrementCounterByTwo();
        System.out.printf("Incremented counter: %d%n", incrementedCounterByTwo);

        /* TASK 5 */
        System.out.println("\nTASK 5");
        System.out.println("Terminating the program...");
        terminateProgram();
    }

    /* Correct the body of this method
     * to avoid the warning suggested by SpotBugs. */
    private static BigDecimal produceBigDecimal() {
        return new BigDecimal(SAMPLE_DOUBLE);
    }

    /* Correct the body of this method any way you like
     * to avoid the warning suggested by SpotBugs. */
    private static Thread produceThread() {
        return new Thread();
    }

    /* 1. Change the program to avoid the warning suggested by SpotBugs.
     * 2. Your implementation must be thread-safe.
     * 3. Do not change the method signature and retain its intended functionality. */
    private static int incrementCounterByOne() {
        synchronized (STRING_LOCK) {
            counter++;
        }
        return counter;
    }

    /* 1. Change the program to avoid the warning suggested by SpotBugs.
     * 2. Your implementation must be thread-safe.
     * 3. Do not change the method signature and retain its intended functionality.
     * 4. Make use of 'REENTRANT_LOCK' in the method body.  */
    private static int incrementCounterByTwo() {
        synchronized (REENTRANT_LOCK) {
            counter = counter + 2;
        }
        return counter;
    }

    /* Correct the body of this method
     * to avoid the warning suggested by SpotBugs.
     * Your implementation must terminate the program. */
    private static void terminateProgram() {
        System.exit(1);
    }
}		
