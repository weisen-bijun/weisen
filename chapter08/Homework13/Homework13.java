package com.chapter08.Homework13;

public class Homework13 {
    public static void main(String[] args) {
        Person p[] = {new Teacher("Jack",'男',45,20),
                    new Teacher("Smith",'男',35,10),
                    new Student("Marry",'男',18,"00023102"),
                    new Student("Danny",'男',16,"00023103")};
        Person temp;
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - 1 - i; j++) {
                if (p[i].getAge() < p[i + 1].getAge()){
                    temp = p[i];
                    p[i] = p[i + 1];
                    p[i+1] = p[i];
                }
            }
        }
        for (int i = 0; i < p.length; i++) {
            if (p[i] instanceof Student){
                Student s = (Student)p[i];
                System.out.println(s.details());
                s.Info(p[i]);
                System.out.println(s.play());
            }else{
                Teacher t = (Teacher) p[i];
                System.out.println(t.details());
                t.Info(p[i]);
                System.out.println(t.play());
            }
            System.out.println("-----------------");
        }
    }
}
