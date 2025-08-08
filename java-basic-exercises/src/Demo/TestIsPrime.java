package Demo;

public class TestIsPrime {
    /**
     * 目标：找出101-200之间的全部素数，并进行统计个数。
     * 何为素数：只能被1和自身整除的数字。
     */
    public static void main(String[] args) {
        int count = 0;
        //1、遍历101-200之间的所有数字
        for (int i=101;i<=200;i++){
            //2、每遍历到一个数字，判断这个数字是否是素数，是素数则输出。（独立判断素数的方法）
            if(isPrime(i)){
                System.out.println(i);
                count++;//统计素数个数
            }
        }
        System.out.println("素数个数："+count);//输出素数个数
    }

    /**
     * 该方法功能：判断一个数字是否为素数
     * @param n 待判断的正整数
     * @return true表示n是素数，false表示n不是素数
     */
    public static boolean isPrime(int n){
        //3、判断素数的方法：遍历2-n之间的所有数字
        for (int i=2;i<n;i++){
            //4、每遍历到一个数字，判断n是否被i整除，被i整除则不是素数，返回false。
            if(n%i==0){
                return false;
            }
        }
        //5、循环结束，n没有被2-n之间的数字整除，则n是素数，返回true。
        return true;
    }
}
