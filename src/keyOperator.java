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
            if (c.up()!=0) return true;
            else return false;
        }if (in.equals("a"))   //OK
        {
            if (c.left()!=0) return true;
            else return false;
        }if (in.equals("s"))   //OK
        {
            if (c.down()!=0) return true;
            else return false;
        }if (in.equals("d"))   //OK
        {
            if (c.right()!=0) return true;
            else return false;
        }



        //未完待续...
        System.out.println("异常：非法的输入："+in);
        return false;
    }

}
