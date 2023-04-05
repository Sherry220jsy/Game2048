
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        chessboard c=new chessboard();
        keyOperator k=new keyOperator();
        System.out.println("欢迎来到2048小游戏~");
        System.out.println("1.开始游戏");
        System.out.println("2.退出游戏");
        Scanner s = new Scanner(System.in);
        String x1 = s.nextLine();
        if(x1.equals("1"))
        {
            System.out.println("开始游戏前我们先了解一下游戏规则把！");
            System.out.println("1.查看游戏规则");
            System.out.println("2.游戏高手不需要");
            String x2 = s.nextLine();
            if(x2.equals("1")){
                System.out.println("玩家可以选择上下左右四个方向（上：w   下：s   左：a    右： d ） ");
                System.out.println("玩家选择的方向上若有相同的数字则合并");
                System.out.println("合并所得的所有新生成数字想加即为该步的有效得分");
                System.out.println("棋盘被数字填满，无法进行有效移动，判负，游戏结束");
                System.out.println("棋盘上出现2048，判胜，游戏结束");
                System.out.println("了解完规则就可以开始游戏咯！(请输入o，游戏正式开始)");
                while (true)
                {
                    if (k.echoInput(c)==true) {
                        if (c.SpawnBlock()==false) break;
                    }
                    c.Display();
                }
            }else{
                System.out.println("游戏高手准备好啦吗?我相信这个小游戏一定难不倒你，加油！(请输入o，游戏正式开始)");
                while (true)
                {
                    if (k.echoInput(c)==true) {
                        if (c.SpawnBlock()==false) break;
                    }
                    c.Display();
                }
            }
        }
        System.out.println("你死了");
    }
}
