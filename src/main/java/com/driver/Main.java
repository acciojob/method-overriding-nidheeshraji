package com.driver;

public class Main {
    static class A {
        String meth() {
            return "Invoking method from class A";
        }
    }

    static class B extends A {

        String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] arg) {
        B obj1 = new B();
        System.out.println(obj1.meth());
        B obj = new B();
        System.out.println(obj.meth());

    }
}