package com.itheima.array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        //目标：认识使用数组，数组的定义，访问数组元素。
        randomCall();
    }
    public static void randomCall(){
        //1、定义一个数组，存储15个学生的姓名
        //静态初始化数组：创建数组对象，并初始化数组元素
        String[] names = {"小王","小李","小张","小赵","小钱","小孙","小李","小王","小王","小王","小王","小王","小王","小王","小王"};

        /**2、动态初始化数组：创建数组对象，不初始化数组元素
        String[] names2=new String[15];
        names2[0]="小王";
        names2[1]="小李";
         **/

        //3、随机获取一个索引，通过索引获取数组元素
        //Math.random():获取一个随机数[0.0,1.0)]
        //Math.random()*数组长度:获取一个随机索引[0,数组长度-1]
        int index=(int)(Math.random()*names.length);
        //4、通过索引获取数组元素：names[索引]
        System.out.println(names[index]);
    }
}
