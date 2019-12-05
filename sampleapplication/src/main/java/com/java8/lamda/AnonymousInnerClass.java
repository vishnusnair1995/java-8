package com.java8.lamda;
//the below code can be modified as follows
//public class AnonymousInnerClass {
//    public static void main(String[] args) {
//        SampleImpl obj=new SampleImpl();
//        obj.show();
//
//
//    }
//
//
//}
//class SampleImpl implements a
//{
//    public void show()
//    {
//        System.out.println("hello");
//    }
//}
//
//interface a
//{
//    public void show();
//
//}

interface  a
{
 public void show();

}

public class AnonymousInnerClass
{
    public static void main(String[] args) {
        a obj=new a()
        {
            public void show()
            {
                System.out.println("hllo");
            }
        };
        obj.show();
    }

}