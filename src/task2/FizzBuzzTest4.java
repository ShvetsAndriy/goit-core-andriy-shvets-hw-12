package task2;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class FizzBuzzTest4 {

    static int NUMBER = 30;
    static Queue<String> toPrinting = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) {

        NumberChecker4 A = new NumberChecker4(toPrinting, NUMBER);
        NumberChecker4 B = new NumberChecker4(toPrinting, NUMBER);
        NumberChecker4 C = new NumberChecker4(toPrinting, NUMBER);
        NumberChecker4 D = new NumberChecker4(toPrinting, NUMBER);
        A.start();
        B.start();
        C.start();
        D.start();

        for (int i = 1; i <= NUMBER; i++) {
            A.setNumber(i);
            A.fizz();
            B.buzz();
            C.fizzbuzz();
            D.number();
            while (true) {
                if (A.isProcessed() && B.isProcessed() && C.isProcessed() && D.isProcessed()) {
                    break;
                }
            }
        }
    }
}
