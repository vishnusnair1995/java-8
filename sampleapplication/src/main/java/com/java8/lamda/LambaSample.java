package com.java8.lamda;

public class LambaSample {

    public static void main(String[] args) {
        Showable s = () -> {
            System.out.println("hello");
        };
        s.show();
    }
}


interface Showable
{
    public void show();

}