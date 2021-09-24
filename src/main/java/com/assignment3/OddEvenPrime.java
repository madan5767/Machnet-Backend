package com.assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddEvenPrime {
    public static void main(String[] args){
        List<Integer> numberList = IntStream.rangeClosed(1, 50)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> oddNumbersList = new ArrayList<>();
        List<Integer> evenNumberList = new ArrayList<>();
        List<Integer> primeNumberList = new ArrayList<>();

        Consumer< List<Integer> > findOddNumber =list->
                list.stream()
                .filter(number ->number %2 !=0)
                .forEach(oddNumbersList::add);

        Consumer< List<Integer> > findEvenNumber =list->
                list.stream()
                .filter(number ->number %2 ==0)
                .forEach(evenNumberList::add);

        Consumer< List<Integer> > findPrimeNumber = list->
                list.stream()
                .filter(currNumber->IntStream.range(2,currNumber)
                        .noneMatch(incrementNumber-> currNumber % incrementNumber == 0 ))
                .filter(currNumber-> currNumber!= 1)
                .forEach(primeNumberList::add);

        Consumer< List<Integer> > displayList = System.out::println;

        findOddNumber.accept(numberList);
        findEvenNumber.accept(numberList);
        findPrimeNumber.accept(numberList);

//      Displaying Odd Number List
        System.out.print("Odd Number List: ");
        displayList.accept(oddNumbersList);
//      Displaying Even Number List
        System.out.print("Even Number List: ");
        displayList.accept(evenNumberList);
//      Displaying Prime Number List
        System.out.print("Prime Number List: ");
        displayList.accept(primeNumberList);
    }
}
