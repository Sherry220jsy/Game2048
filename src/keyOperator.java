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

    public static boolean echoInput(chessboard c) {
        String in = readInput();
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
        if (in.equals("w"))   //OK
        {
            c.up();
            return true;
        }if (in.equals("a"))   //OK
        {
            c.left();
            return true;
        }if (in.equals("s"))   //OK
        {
            c.down();
            return true;
        }if (in.equals("d"))   //OK
        {
            c.right();
            return true;
        }



        //未完待续...
        System.out.println("异常：非法的输入："+in);
        return false;
    }

}
