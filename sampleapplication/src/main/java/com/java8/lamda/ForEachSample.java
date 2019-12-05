package com.java8.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachSample {


    public List<Integer> showStudentList() {
        List<Integer> studentList = Arrays.asList(1, 2, 3, 4);
        for (int i : studentList) {
            System.out.println(i);
        }
        return studentList;
    }


    public List<Integer> showStudentList2() {
        List<Integer> studentList = Arrays.asList(1, 2, 3, 4);
        for (int i = 0; i < studentList.size(); i++)
            System.out.println(studentList.get(i));

        return studentList;
    }

    public List<Integer> showStudentList3() {
        List<Integer> studentList = Arrays.asList(1, 2, 3, 4);
        studentList.forEach(i-> System.out.println(i));
        return studentList;
    }

    public static void main(String[] args)
    {
    ForEachSample forEachSample=new ForEachSample();
    forEachSample.showStudentList();
    forEachSample.showStudentList2();
    forEachSample.showStudentList3();

    }
}