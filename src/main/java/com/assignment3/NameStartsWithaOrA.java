package com.assignment3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NameStartsWithaOrA {
    public static void main(String[] args) {
        List<String> NameList = Arrays.asList("Madan", "Nischal", "Summit", "Dharma", "Ajay", "aishwarya", "Chorten", "Kushang", "Abiza", "amit");

        Predicate<String> startsWithaOrA = name -> (name.startsWith("A") || name.startsWith("a")) && name.length()<=5 ;

        List<String> nameStartsWithaOrA = NameList.stream()
                .filter(startsWithaOrA)
                .collect(Collectors.toList());

        System.out.println("Name that starts with “a” or “A” and contains length no more than 5: "+nameStartsWithaOrA);
    }
}
