public class Main {
    public static void main(String[] args)
    {
        chessboard c=new chessboard();
        keyOperator k=new keyOperator();
        while (true)
        {
            k.echoInput(c);
            c.Display();
        }
    }
}