public class chessboard {
    public int score;
    public String status;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public int[][]a;

    public int[][] getA() {
        return a;
    }

    public void setA(int[][] a) {
        this.a = new int[4][4];
    }

    public static void Display(int [][]a){
        for (int i=0;i<a.length;i++)
            for (int j=0;j<a[i].length;j++)
                System.out.println(a[i][j]);
    }
}
