package com.java8.functionalbasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalBasicPrograming {

    public static void main(String[] args) {
        printCourses(Arrays.asList("java","microservice","oops","angular","kubernates","aws"));
        printCoursesatleast(Arrays.asList("java","microservice","oops","angular","kubernates","aws"));
        printCoursesFilterSpring(Arrays.asList("java","microservice","oops","angular","kubernates","aws","springboot","springmvc","springbatch"));
        printList( Arrays.asList(1,21,3));
        printListFunctionalApproach( Arrays.asList(1,21,48,14,3));
        printListFunctionalApproachFilter( Arrays.asList(1,21,48,14,3));
        printListLamdaList(Arrays.asList(1,4,5,9,6,8));
        printListOdd(Arrays.asList(1,2,3,4,5,6));
        printListOddSquares(Arrays.asList(1,2,3,4,5,6));
    }
    public static void print(int number)
    {
        System.out.println(number);
    }
    public static Boolean isEven(int number)
    {
        if(number%2==0)
        {
            return true;
        }
        return  false;
    }
    public static  void printList(List<Integer> list)
    {
        System.out.println("using for each");
        list.forEach((i)-> System.out.println(i));
    }
    public static void printListFunctionalApproach(List<Integer> list)
    {
        System.out.println("using functional approach");
        list.stream().forEach(FunctionalBasicPrograming::print);
    }

    public static void printListFunctionalApproachFilter(List<Integer> list)
    {
        System.out.println("fiteredd");
        list.stream().filter(FunctionalBasicPrograming::isEven).forEach(System.out::println);
    }
    public static void printListLamdaList(List <Integer> list)
    {

        System.out.println("fitered using lambda");
        list.stream().filter(number->number%2==0).forEach(System.out::println);
    }

    public static void printListOdd(List<Integer> list)
    {
        System.out.println("fitered odd");
        list.stream().filter(number -> number % 2!=0).forEach(System.out::println);
    }
    public static void printCourses(List<String> courses)
    {
        System.out.println("course list");
        courses.forEach(course-> System.out.println(course));
    }
    public static void printCoursesFilterSpring(List<String> courses)
    {
        System.out.println("course list with spring");
        courses.stream().filter(course-> course.contains("spring")).forEach(System.out::println);
    }
    public static void  printCoursesatleast(List<String> courses)
    {
        System.out.println("course list with 4 characters");
        courses.stream().filter(course-> course.length()>=4).forEach(System.out::println);
    }
    public static void printListOddSquares(List<Integer> integers)
    {
        System.out.println("squares");
        integers.stream().filter(number->number%2!=0).map(number->number*number).forEach(System.out::println);
    }
}