package com.xiaomi;
/*
 *项目名：javafilecompile
 *文件名：Person
 *创建者：duyiying
 *创建时间： 22:29
 *描述：TODO
 */

public class Person {
    //实例变量name
    String name;
    //类变量country
    static String country;
    public void speak() {
        System.out.println(name + "..." + country);
    }
}
