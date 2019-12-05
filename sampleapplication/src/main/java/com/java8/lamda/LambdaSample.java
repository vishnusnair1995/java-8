package com.java8.lamda;
//basically in lamda expression a block of code is assigned to a value
//        or variable and that variable is passed
//we encapsulaye a function to a variable


public class LambdaSample {


    public static void main(String[] args) {

     myLambda lamdasample= ()-> System.out.println("hello");
     addFunction addsample= (int a,int b)->  a+b;

    }


}
interface addFunction
{
    int sample(int a,int b);
}

interface  myLambda
{
    void lamdaTesting();
}