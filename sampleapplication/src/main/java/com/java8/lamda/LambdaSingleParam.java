package com.java8.lamda;


public class LambdaSingleParam {
    public static void main(String[] args) {


        messageShow messageShow = (s) -> {
            return "hello" + s;
        };
        System.out.println( messageShow.displayMessage("vishnu"));
    }
}
@FunctionalInterface
interface messageShow
        {
            public String displayMessage(String s);

        }