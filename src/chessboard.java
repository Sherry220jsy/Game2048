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
        System.out.println("加分—— "+score);
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
                    System.out.printf("%-4d",chessboard[i][j]);            //忽略为0的位置
                else System.out.print("    ");
            }
            System.out.println();
        }
    }

    public static boolean SpawnBlock()
    {
        if (checkgame()==0) {
            System.out.println("棋盘已满，你输了，游戏结束！");
            return false;
        }
        if(checkgame()==2048){
            System.out.println("恭喜合出2048，你赢了，游戏结束！");
            return false;
        }
        else System.out.println("游戏继续，因为："+checkgame());
        Random r= new Random();
        int x,y;
        while (true)
        {
            x=r.nextInt(4);
            y=r.nextInt(4);
            if (chessboard[x][y]==0) break;
        }
        boolean ju=r.nextBoolean();
        if (ju)
        {
            chessboard[x][y]=2;
        }
        else chessboard[x][y]=4;
        return true;
    }

    public int up()
    {
        int sum=0;//相加的数之和

        for(int j=0;j<4;j++)//控制列
        {
            for(int i=1;i<4;i++)//控制行
            {
                //将a[i][j]数字往上移动直到上一个数字不为0或到顶为止
                int k=i;
                while(k>0 && chessboard[k-1][j]==0)
                {
                    chessboard[k-1][j]=chessboard[k][j];
                    chessboard[k][j]=0;
                    k--;
                }
                //移动到a[k][j]，判断该数字上方是否有数字是否可加，可加相加
                while(k>0&&chessboard[k][j]!=0)
                {
                    if(chessboard[k][j]==chessboard[k-1][j])
                    {
                        chessboard[k-1][j]=chessboard[k][j]+chessboard[k-1][j];
                        sum=sum+chessboard[k-1][j];
                        addScore(sum);
                        chessboard[k][j]=0;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        return sum;
    }

    //下
    public int down()
    {
        int sum=0;

        for(int j=0;j<4;j++)//控制列
        {
            for(int i=2;i>-1;i--)//控制行
            {
                int k=i;
                while(k<3 && chessboard[k+1][j]==0)
                {
                    chessboard[k+1][j]=chessboard[k][j];
                    chessboard[k][j]=0;
                    k++;
                }

                while(k<3&&chessboard[k][j]!=0)
                {
                    if(chessboard[k][j]==chessboard[k+1][j])
                    {
                        chessboard[k+1][j]=chessboard[k][j]+chessboard[k+1][j];
                        sum=sum+chessboard[k+1][j];
                        addScore(sum);
                        chessboard[k][j]=0;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        return sum;
    }

    //左

    public int left()
    {
        int sum=0;

        for(int j=0;j<4;j++)//控制行
        {
            for(int i=1;i<4;i++)//控制列
            {
                int k=i;
                while(k>0 && chessboard[j][k-1]==0)
                {
                    chessboard[j][k-1]=chessboard[j][k];
                    chessboard[j][k]=0;
                    k--;
                }

                while(k>0&&chessboard[j][k]!=0)
                {
                    if(chessboard[j][k]==chessboard[j][k-1])
                    {
                        chessboard[j][k-1]=chessboard[j][k]+chessboard[j][k-1];
                        sum=sum+chessboard[j][k-1];
                        addScore(sum);
                        chessboard[j][k]=0;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        return sum;
    }
    //右
    public int right()
    {
        int sum=0;

        for(int j=0;j<4;j++)//控制行
        {
            for(int i=2;i>-1;i--)//控制列
            {
                int k=i;
                while(k<3 && chessboard[j][k+1]==0)
                {
                    chessboard[j][k+1]=chessboard[j][k];
                    chessboard[j][k]=0;
                    k++;
                }

                while(k<3&&chessboard[j][k]!=0)
                {
                    if(chessboard[j][k]==chessboard[j][k+1])
                    {
                        chessboard[j][k+1]=chessboard[j][k]+chessboard[j][k+1];
                        sum=sum+chessboard[j][k+1];
                        addScore(sum);
                        chessboard[j][k]=0;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        return sum;
    }

    public static int checkgame() {     //查询是否有“0”,和2048
        int k = 0;
        for (int i = 0; i < 4; i++) {
            if (k > 0) {
                break;
            }
            for (int j = 0; j < 4; j++) {
                if(chessboard[i][j]==2048) {
                    k=2048;
                    break;
                }
                if (chessboard[i][j] == 0) {
                    k++;
                    break;
                } else {
                    //上
                    if (i > 0) {
                        if (chessboard[i - 1][j] == chessboard[i][j]) {
                            k++;
                            break;
                        }
                    }
                    //下
                    if (i < 3) {
                        if (chessboard[i + 1][j] == chessboard[i][j]) {
                            k++;
                            break;
                        }
                    }
                    //左
                    if (j > 0) {
                        if (chessboard[i][j - 1] == chessboard[i][j]) {
                            k++;
                            break;
                        }
                        //右
                        if (j < 3) {
                            if (chessboard[i][j + 1] == chessboard[i][j]) {
                                k++;
                                break;
                            }
                        }

                    }
                }
            }

        }
        return k;
    }
}
