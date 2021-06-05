package com.chapter08;

public class Homework06 {
    /**
     * 父类中this可以访问本类的成员，子类中的this先查找子类的成员如果没有继续向上查找父类的成员，看看是否可以访问
     * 如果不可以访问直接报错，如果没有继续向上查找父类如此往复，如果都没有直接报错。super直接跳过子类在父类中开始查找。
     * Father中的this可以访问Father的所有成员和Grand的name g1() super可以访问Grand的name g1()
     * Son中的this可以访问Son的所有成员 Father的id f1() super可以访问Father的id f1() Grand的name g1()
     */
}
