package Demo;

import java.util.Scanner;

public class TestHuaRong {
    /**
     *目标：实现数字华容道的初始化和随机乱序。
     */
    public static void main(String[] args) {
        HuaRong(4);
    }
    /**
     * 数字华容道
     * @param n 数字华容道大小
     */
    public static void HuaRong(int n){
        //1、定义一个数组，存储数字华容道
        int[][] arr=new int[n][n];
        //2、遍历二维数组，并输入数字进行数字华容道初始化
        System.out.println("请输入数字华容道：");
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("原数字华容道为：");
        printArray(arr);
        //3、进行数字华容道乱序的处理
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //遍历数组当前位置：arr[i][j]
                //随机数的索引位置：num1,num2
                int num1=(int)(Math.random()*arr.length);
                int num2=(int)(Math.random()*arr[i].length);
                //将当前位置的元素，和随机数位置的元素进行交换
                //定义一个临时变量temp
                int temp=arr[num1][j];
                arr[num1][j]=arr[i][num2];
                arr[i][num2]=temp;
            }
        }
        System.out.println("乱序后的数字华容道为：");
        printArray(arr);
    }
    /**
     * 打印二维数组
     * @param arr
     */
    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
