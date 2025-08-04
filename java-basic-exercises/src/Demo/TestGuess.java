package Demo;

import java.util.Random;
import java.util.Scanner;

/**
 * 目标：猜数字游戏
 * 实现一个1-100范围内的猜数字游戏
 */
public class TestGuess {
    public static void main(String[] args) {
        guess();
    }
    public static void guess(){
        //1、生成随机数：1-100的随机数
        //方式一：
        //math.random()返回【0-1】的随机数
        //(int)(Math.random()*100)==>[0-99]的随机数
        int number=(int)(Math.random()*100)+1;//[1-100]的随机数,注意；1-100的随机数，需要+1

        //方式二：
        Random random=new Random();//创建Random对象
        //nextInt(100)==>[0-99]的随机数
        int number2=random.nextInt(100)+1;//[1-100]的随机数

        //2、定义一个死循环让用户一直猜测，直到猜对为止
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("请输入1-100的数字：");
            int input=sc.nextInt();
            if(input==number){
                System.out.println("恭喜你，猜对了！");
                break;
            }
            else if(input>number){
                System.out.println("你输入的数字太大了！");
            }
            else{
                System.out.println("你输入的数字太小了！");
            }
        }
    }
}
