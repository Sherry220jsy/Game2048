import java.util.Scanner;

public class keyOperator {

    public keyOperator() {
    }

    public String readInput()
    {
        Scanner s= new Scanner(System.in);
        System.out.println("请求输入：");
        String in=s.nextLine();
        //System.out.println(in);
        return in;
    }

    public static boolean echoInput(String in,chessboard c) {
        if (in.equals("p"))
        {
            c.setStatus("pause");
            return false;
        }
        if (in.equals("e"))
        {
            c.setStatus("end");
            return false;
        }
        if (in.equals("o"))   //OK
        {
            c.setStatus("playing");
            return true;
        }
        if (in.equals("w") || in.equals("a") || in.equals("s") || in.equals("d")) return true;
        //未完待续...
        System.out.println("异常：非法的输入："+in);
        return false;
    }
    public boolean juMove(String in)
    {
        if (in.equals("w") || in.equals("a") || in.equals("s") || in.equals("d")) return true;
        else return false;
    }
    public boolean chessMove(String in,chessboard c) {
        if (in.equals("w"))   //OK
        {
            if (c.up()!=0) return true;
        }if (in.equals("a"))   //OK
        {
            if (c.left()!=0) return true;
        }if (in.equals("s"))   //OK
        {
            if (c.down()!=0) return true;
        }if (in.equals("d"))   //OK
        {
            if (c.right()!=0) return true;
        }
        //System.out.println("没有加分的移动");
        return false;
    }

}
