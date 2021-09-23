package com.assignment2;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumberCalculate {

    public PrimeNumberCalculate(){
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 3, 5, 7, 9, 11, 13),
                Arrays.asList(2 , 4, 6, 8, 10, 12, 14));

        List<Integer> all = list.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(all.stream()
                .filter(e -> isPrime(e))
                .collect(Collectors.toList()));
    }

    public Boolean isPrime(int number) {
        int primeCount = 0;

        if(number==1 || number==2){
            primeCount=1;
        }else {
            for (int i = 2; i < number; i++) {
                if ((number % i) == 0) {
                    primeCount += 1;
                }
            }
        }

        if (primeCount == 0) {
            return true;
        }else{
            return false;
        }
    }
        public static void main(String[] args) {
            PrimeNumberCalculate primeNumber = new PrimeNumberCalculate();
        }
}
