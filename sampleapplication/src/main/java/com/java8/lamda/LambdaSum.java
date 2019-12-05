package com.java8.lamda;

public class LambdaSum {
    public static void main(String[] args) {

        summable result=(int a,int b)-> {
          return  a + b;
        };
        System.out.println(result.sum(5,6));
    }
}

interface summable
{
    public int sum(int a,int b);
}


