package Demo;

import java.util.Scanner;

/**
 * 目标：计算器
 * 用于演示基本的四则运算功能
 */
public class TestCalc {
    public static void main(String[] args) {
        //创建对象并调用方法，完成计算器的使用
        Scanner sc= new Scanner(System.in);
        //请求用户输入数字和运算符
        System.out.println("请输入第一个数字：");
        double num1=sc.nextInt();
        System.out.println("请输入第二个数字：");
        double num2=sc.nextInt();
        System.out.println("请输入运算符：");
        String op= sc.next();
        //调用方法完成运算并显示结果
        System.out.println("运算结果为："+calc(num1,num2,op));
    }

    /**
     * 计算方法
     * 根据给定的运算符对两个数字进行四则运算
     * @param num1 第一个操作数
     * @param num2 第二个操作数
     * @param op 运算符（+、-、*、/）
     * @return 运算结果
     */
    public static double calc(double num1, double num2, String op) {
        //定义结果变量
        double result=0;
        //根据运算符进行运算
        switch (op) {
            case "+":
                result=num1+num2;
                break;
            case "-":
                result=num1-num2;
                break;
            case "*":
                result=num1*num2;
                break;
            case "/":
                result=num1/num2;
                break;
            default:
                System.out.println("运算符输入错误！");
        }
        //返回运算结果
        return result;
    }
}

