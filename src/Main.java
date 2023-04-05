public class Main {
    public static void main(String[] args)
    {
        chessboard c=new chessboard();
        keyOperator k=new keyOperator();
        while (true)
        {
            if (k.echoInput(c)==true) {
                if (c.SpawnBlock()==false) break;
            }
            c.Display();
        }
    }
}