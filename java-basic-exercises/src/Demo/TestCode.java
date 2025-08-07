package Demo;

public class TestCode {
    /**
     * 目标：开发验证码
     * 实现一个可以随机生成指定位数的验证码（数字、大写字母、小写字母）
     */
    public static void main(String[] args) {
        //1.调用一个方法，获取一个指定位数的随机验证码
        System.out.println(getCode(4));
        System.out.println(getCode(6));
    }
    /**
     * 生成指定长度的验证码
     * 验证码由数字(0-9)、大写字母(A-Z)、小写字母(a-z)随机组成
     * @param n 验证码的位数，必须为正整数
     * @return 生成的验证码字符串
     */
    public static String getCode(int n) {
        //2.定义一个字符串变量，用于保存生成的验证码
        String code = "";
        //3.循环n次，每次生成一个随机字符
        for (int i = 0; i < n; i++) {
            //4.为当前位置随机生成一个随机字符（0-9、A-Z、a-z）。
            int index = (int)(Math.random()*3);//[0-2]
            //5.使用switch语句判断index，生成对应的字符
            //  数字0/大写字母1/小写字母2
            switch (index) {
                //6.如果当前位置是数字，则随机生成一个数字0-9，并将数字添加到code中
                case 0:
                    code += (int)(Math.random()*10);//[0,9]
                    break;
                //7.如果当前位置是大写字母，则随机生成一个大写字母A-Z，并添加到code中
                case 1:
                    code += (char)(Math.random()*26+'A');//[0,25]   'A'=65    'Z'=65+25
                    break;
                //8.如果当前位置是小写字母，则随机生成一个小写字母a-z，并添加到code中
                case 2:
                    code += (char)(Math.random()*26+'a');//[0,25]   'a'=97    'z'=97+25
                    break;
            }
        }
        return code;
    }
}
