package com.java8.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExercise {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<Person>();
        personList= Arrays.asList(new Person("vishnu","nair",24),
                new Person("prasson","dddddnair",84),
                new Person("vxp","aanaidfr",248));

        Collections.sort(personList,(p1,p2)->{
        return p1.lastName.compareTo(p2.lastName);
    });
//personList.forEach(person -> System.out.println(person.lastName));

Stream<Person> personSet=personList.stream().filter(person -> person.lastName.startsWith("n"));
personSet.forEach(person -> System.out.println(person.lastName));
}
}
