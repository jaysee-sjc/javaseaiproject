package com.itheima.scanner;

import java.util.Scanner;

public class scannerDemo01 {
    public static void main(String[] args) {
        scanner();
    }
    public static void scanner(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age=sc.nextInt();
        System.out.println("请输入姓名");
        String name=sc.next();
        System.out.println("你的年龄为"+ age);
        System.out.println("你的姓名为"+ name);
        int a=10;
        System.out.println("连接符" + a);//连接符10
        System.out.println(a + 5);//15
        System.out.println("连接符" + a + 'a');//连接符10a
        System.out.println(a + 'a' + "连接符");//107连接符
    }
}
