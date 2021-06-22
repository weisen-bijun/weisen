package com.chapter10.Homework05;

public class A {
    private String name;

    public A(String name) {
        this.name = name;
    }
    public void b(){
        class B {
            private String name;

            public B(String name) {
                this.name = name;
            }

            public void show(){
                System.out.println(name);
                System.out.println(A.this.name);
            }
        }
        B he = new B("呵呵呵");
        he.show();

    }

}
class Test{
    public static void main(String[] args) {
        A ha = new A("哈哈哈");
        ha.b();
    }
}
