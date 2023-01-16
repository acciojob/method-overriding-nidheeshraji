package com.driver;


class A{
    String meth(){
        return "Invoking method from class A" ;
    }
}
class B extends A{

    String meth() {
        return "Method is overridden in Extendend class B";
    }

}
public class Main {
    public static void main(String[] arg) {
        B obj1=new B();
        System.out.println(obj1.meth());
        B obj = new B();
        System.out.println(obj.meth());

    }
}