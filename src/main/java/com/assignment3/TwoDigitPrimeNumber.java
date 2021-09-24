package com.assignment3;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class TwoDigitPrimeNumber {

    public static void main(String[] args) {
        Supplier<Integer> randomTwoDigitPrime = ()->{
            int twoDigitPrimeNumber;
            while (true){
                int randomNumber = (int) ((Math.random() * (99 - 10)) + 10);
                if(IntStream.range(2,randomNumber).noneMatch(incrementNumber-> randomNumber % incrementNumber == 0 )){
                    twoDigitPrimeNumber = randomNumber;
                    break;
                }
            }

            return twoDigitPrimeNumber;
        };

        System.out.println("Two digit Random Prime Number is: "+randomTwoDigitPrime.get());
    }
}
