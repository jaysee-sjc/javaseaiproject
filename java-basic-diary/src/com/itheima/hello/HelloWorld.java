package com.itheima.hello;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        //帮我写一个乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }


        int input;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.print("请输入 1-10 之间的数字：");
            input = sc.nextInt();
        } while (input < 1 || input > 10);


    }
}
