package com.java8.lamda;

interface A
        {
          public void show();
        }

public class LambdaDemo {
    public static void main(String[] args) {
        A obj;
        obj=new A() {
            public void show() {
                System.out.println("testinggg");
            }


        };
    }

}
