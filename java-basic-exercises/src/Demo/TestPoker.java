package Demo;

public class TestPoker {
    /**
     * 目标：斗地主游戏
     * 实现扑克牌的做牌、洗牌和发牌功能
     */
    public static void main(String[] args) {
        poker_start();
    }
    /**
     * 创建一个方法，实现斗地主游戏的做牌、洗牌和发牌功能
     */
    public static void poker_start() {
        //1、【做牌】：创建一个动态初始化的数组，存储54张牌
        String[] poker = new String[54];

        //2、准备四种花色，还有点数，再开始填充牌
        String[] colors = {"♦","♣","♥","♠"};
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

        //3、遍历点数、花色，开始填充牌
        //定义一个索引，用于记录牌在数组中的位置
        int index = 0;
        for (int i = 0; i < colors.length; i++) {
            //当前花色：colors[i]
            for (int j = 0; j < numbers.length; j++) {
                //当前点数：numbers[j]
                //将牌组合后添加到数组中
                poker[index++]=colors[i]+numbers[j];
            }
        }

        //4、把大小王添加到牌中
        poker[index++]="大王";
        poker[index]="小王";

        //5、【扑克展示】
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i]+"\t");
        }
        System.out.println();

        //6、【洗牌】方式一：使用二个随机数的方法对牌进行洗牌
        for (int i = 0; i < poker.length; i++) {
            //获取第一个索引随机数
            int index01 = (int)(Math.random()*(poker.length));
            //获取第二个索引随机数
            int index02 = (int)(Math.random()*(poker.length));
            //对牌进行交换
            String temp = poker[index01];
            poker[index01] = poker[index02];
            poker[index02] = temp;
        }
        //11、【发牌】
        for (int i = 0; i < poker.length; i++) {
            System.out.print(poker[i]+"\t");
        }
        System.out.println();
    }
}
