package com.java8.interfaces;

 interface I {
   default public void show()
    {
        System.out.println("inside i");
    }
}
 interface J
{
   default public void show()
   {
       System.out.println("inside j");
   }
}
class P 
{
    public void show()
    {
        System.out.println("inside p");
    }
}
//public class InterfaceSample extends P implements  I,J
//{
//here the interface exends one class and implement 2 clasees and we call the method common
//output will be of something which defined under class because class has more prioriy than default
//    public static void main(String[] args) {
//        InterfaceSample interfaceSample=new InterfaceSample();
//        interfaceSample.show();
//
//    }
//}
public class InterfaceSample
{

//    we can create static method inside interface and call that method using class name
    public static void show()
    {
        System.out.println("inside p");
    }

    public static void main(String[] args) {
        InterfaceSample.show();

    }
}