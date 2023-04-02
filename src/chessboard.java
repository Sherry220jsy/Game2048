public class chessboard {
    public int score;
    public String status;
    public int[][]chessboard;

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

    public int[][] getA() {
        return chessboard;
    }

    public chessboard() {
        this.score = 0;
        this.status = "Ready";
        this.chessboard = new int[4][4];
    }


    public static void Display(int [][]a){
        for (int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j]);
            System.out.println();
        }
    }
}
