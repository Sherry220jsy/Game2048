import java.util.Scanner;

public class keyOperator {

    public keyOperator() {
    }

    public static String readInput()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("请求输入：");
        String in=s.nextLine();
        //System.out.println(in);
        return in;
    }

    public static void echoInput(chessboard c) {
        String in = readInput();
        if (in.equals("p"))
        {
            c.setStatus("pause");
            return;
        }
        if (in.equals("e"))
        {
            c.setStatus("end");
            return;
        }
        if (in.equals("s"))
        {
            c.setStatus("playing");
            return;
        }
        //未完待续...
        System.out.println("异常：非法的输入："+in);
    }
}
