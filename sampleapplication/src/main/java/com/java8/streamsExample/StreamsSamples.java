package com.java8.streamsExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSamples {
    public static void main(String[] args) {
        sumUsingStreams(Arrays.asList(1, 4, 4, 8));
        sumLambda(Arrays.asList(1, 4, 4, 8));
        cubeOfSumOfOddInList(Arrays.asList(1, 2, 3, 4, 5, 6));
        displayDistinctNumbers(Arrays.asList(1, 1, 2, 2));
        sortList(Arrays.asList(5, 7, 1, 2));
        sortStringBasrdOnLength(Arrays.asList("hai","kj","jhgfgf","jhjjj","j"));
        sortStringBasrdOnLengthDescending(Arrays.asList("hai","kj","jhgfgf","jhjjj","j"));


    }

    public static int sumOfNumbers(int a, int b) {
        return a + b;
    }

    public static void sumUsingStreams(List<Integer> numbers) {
        System.out.println("sum of number  ");
        System.out.println(numbers.stream().reduce(0, StreamsSamples::sumOfNumbers));
    }

    public static void sumLambda(List<Integer> numbers) {
        System.out.println("sum of number using lamda ");
        System.out.println(numbers.stream().reduce(0, (x, y) -> x + y));
    }

    public static void cubeOfSumOfOddInList(List<Integer> noList) {
        System.out.println("sum of cube of odd numbers using lamda ");
        System.out.println(noList.stream().filter(number -> number % 2 != 0).map(number -> number * number * number).reduce(0, Integer::sum));
    }

    public static void displayDistinctNumbers(List<Integer> numbers) {
        System.out.println("distinct");
        numbers.stream().distinct().forEach(System.out::println);
    }

    public static void sortList(List<Integer> integers) {
        System.out.println("sortedList");
        List<Integer> sampleList = integers.stream().sorted().collect(Collectors.toList());
        System.out.println(sampleList);
    }
    public static void sortStringBasrdOnLength(List<String> strings)
    {
        System.out.println("sortedString");
        strings.stream().sorted(Comparator.comparing(string -> string.length())).forEach(System.out ::println);

    }
    public static void sortStringBasrdOnLengthDescending(List<String> strings)
    {
        System.out.println("based on length descending");
        Comparator<String> reverseComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        };
        strings.stream().sorted(reverseComparator).forEach(System.out::println);
    }
}