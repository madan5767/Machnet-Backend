package com.assignment2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumIntArray {
    int[] numbers = new int[50];

    public void setNumbers(){
        IntStream.range(1,51).forEach(i->{
            numbers[i-1]= i;
        });
    }

    public int getSumResult(){
        int result = Arrays
                .stream(numbers)
                .reduce(0, (subtotal, element) -> subtotal + element);
        return result;
    }

    public static void main(String args[]){
        SumIntArray sumArray = new SumIntArray();
        sumArray.setNumbers();
        System.out.println("Sum integer array containing numbers from 1 - 50: " +sumArray.getSumResult());
    }

}
