package Demo;

import java.util.Scanner;

/**
 * 健康计算器主类
 * 用于计算用户的BMI和BMR指数，并根据指数给出健康评估
 */
public class TestBmiBmr {
    public static void main(String[] args) {
        //目标：完成健康计算器
        //需求：请求用户输入（年龄、性别、体重、身高）
        System.out.println("请输入年龄：");
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println("请输入性别：");
        String sex=sc.next();
        System.out.println("请输入体重：");
        double weight=sc.nextDouble();
        System.out.println("请输入身高：");
        double height=sc.nextDouble();

        //计算BMI指数
        double bmi=getBmi(weight,height);
        System.out.println("BMI指数为："+bmi);

        //计算BMR指数
        double bmr=getBmr(age,sex,weight,height);
        System.out.println("BMR指数为："+bmr);

        //根据BMI指数判断体重状况
        if(bmi<18.5){
            System.out.println("过轻");
        }
        else if(bmi>=18.5&&bmi<24.9){
            System.out.println("正常");
        }
        else if(bmi>=24.9&&bmi<27){
            System.out.println("过重");
        }
        else if(bmi>=27&&bmi<30){
            System.out.println("肥胖");
        }
        else{
            System.out.println(" severely obese");
        }

        //根据BMR指数判断基础代谢状况
        if(bmr<1000){
            System.out.println("低");
        }
        else if(bmr>=1000&&bmr<2000){
            System.out.println("正常");
        }
        else{
            System.out.println("高");
        }
    }

    /**
     * 计算BMI指数
     * BMI = 体重(kg) / 身高²(m)
     * @param weight 体重（千克）
     * @param height 身高（米）
     * @return BMI指数
     */
    public static double getBmi(double weight,double height){
        return weight/(height*height);
    }

    /**
     * 计算BMR基础代谢率
     * 男性：BMR = 66 + (13.7 × 体重kg) + (5 × 身高cm) - (6.8 × 年龄years)
     * 女性：BMR = 655 + (9.6 × 体重kg) + (1.8 × 身高cm) - (4.7 × 年龄years)
     * @param age 年龄
     * @param sex 性别（"男"或"女"）
     * @param weight 体重（千克）
     * @param height 身高（米）
     * @return BMR基础代谢率
     */
    public static double getBmr(int age,String sex,double weight,double height){
        if(sex.equals("男")){
            return 66+13.7*weight+5*height-6.8*age;
        }else{
            return 655+9.6*weight+1.8*height-4.7*age;
        }
    }
}
