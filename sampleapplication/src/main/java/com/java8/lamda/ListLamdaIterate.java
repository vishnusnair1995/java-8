package com.java8.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListLamdaIterate {
    public static void main(String[] args) {
        List<String > nameList=new ArrayList<>();
        nameList= Arrays.asList("vshn","kj","jh");
        nameList.forEach(i-> System.out.println(i));

    }
}
