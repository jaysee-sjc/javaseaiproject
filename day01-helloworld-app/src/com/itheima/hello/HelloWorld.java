package com.itheima.hello;

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
    }
}
