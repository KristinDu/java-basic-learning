package com.xiaomi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String greeting = "Welcome to Core Java";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++) {
            System.out.print("=");
        }
        System.out.println();

        //实例化Person类对象,分别指向p1,p2
        Person p1 = new Person();
        Person p2 = new Person();
        //给对象中的属性name赋值
        p1.name = "Jack";
        //使用类名直接调用static属性country
        Person.country = "American";
        p1.speak();
        p2.name = "Rose";
        Person.country = "England";
        p2.speak();
    }
}
