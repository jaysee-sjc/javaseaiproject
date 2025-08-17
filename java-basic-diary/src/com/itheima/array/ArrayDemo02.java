package com.itheima.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //目标：认识二维数组
        printArray();
        printArray2();
        printArray3();
    }
    public static void printArray()
    {
        //初始化二维数组（静态初始化）
        int[][] array = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        //访问：数组名称[行索引][列索引]
        System.out.println(array[0][0]);
        System.out.println(array[0][1]);
    }
    public static void printArray2()
    {
        //初始化二维数组（动态初始化）
        int[][] array = new int[3][3];
        array[0][0] = 1;
        array[0][1] = 2;
        //访问: 数组名称[行索引][列索引]
        System.out.println(array[0][0]);//1
        System.out.println(array[0][1]);//2
        //获取二维数组的长度
        System.out.println(array.length);//3
        System.out.println(array[0].length);//3
    }
    public static void printArray3()
    {
        //二维数组的遍历
        int[][] array={{1,2,3},
                      {4,5,6},
                     {7,8,9}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0;  j< array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
