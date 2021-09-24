package com.assignment3;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamAPISorting {
    public static void main(String []args) {
        List<Integer> randNumberList= new Random().ints(100, 1,500).boxed().collect(Collectors.toList());
        List<Integer> reverseOrderList=randNumberList
                .stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Random Numbers List: "+randNumberList);
        System.out.println("Random Numbers on a descending order: "+reverseOrderList);
    }
}
