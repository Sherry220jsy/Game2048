package check;

public class check_test {
    public static void main(String[] args) {
        int[][] a = {{8, 2, 8, 2}, {4, 16, 2, 4}, {2, 32, 4, 2}, {4, 2, 16, 8}};
        Print(a);
        int m = checkgame(a);

        System.out.println(m);
    }

    //打印函数
    public static void Print(int[][] a) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println("_________");
    }
   //判断终止
    public static int checkgame(int[][] a) {
        int k = 0;
        for (int i = 0; i < 4; i++) {
            if (k > 0) {
                break;
            }
            for (int j = 0; j < 4; j++) {
                if (a[i][j] == 0) {
                    k++;
                    break;
                } else {
                    //上
                    if (i > 0) {
                        if (a[i - 1][j] == a[i][j]) {
                            k++;
                            break;
                        }
                    }
                    //下
                    if (i < 3) {
                        if (a[i + 1][j] == a[i][j]) {
                            k++;
                            break;
                        }
                    }
                    //左
                    if (j > 0) {
                        if (a[i][j - 1] == a[i][j]) {
                            k++;
                            break;
                        }
                        //右
                        if (j < 3) {
                            if (a[i][j + 1] == a[i][j]) {
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