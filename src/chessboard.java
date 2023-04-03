import java.util.Random;

public class chessboard {
    public static int score;
    public static String status;
    public static int[][]chessboard;

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public void addScore(int score) {
        this.score += score;
        System.out.println("得分："+getScore());
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public int[][] getChessboard() {
        return chessboard;
    }

    public chessboard() {
        this.score = 0;
        this.status = "Ready";
        this.chessboard = new int[4][4];
    }


    public static void Display(){
        System.out.println("| 分数："+score+"      "+"状态："+status+" |");
        if (status!="Ready")
        for (int i=0;i<chessboard.length;i++) {
            for (int j = 0; j < chessboard.length; j++) {
                if (chessboard[i][j]!=0)
                System.out.print(chessboard[i][j] + " ");            //忽略为0的位置
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void SpawnBlock()
    {
        Random r= new Random();
        boolean ju=r.nextBoolean();
        int x;
        int y;
        while (true)
        {
            x=r.nextInt(3);
            y=r.nextInt(3);
            if (chessboard[x][y]==0) break;
        }
        if (ju)
        {
            chessboard[x][y]=2;
        }
        else chessboard[x][y]=4;
    }
}
