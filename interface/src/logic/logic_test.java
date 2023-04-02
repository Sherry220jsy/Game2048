package logic;

public class logic_test {
    public static void main(String[] args) {
        int[][] a = {{2,4,0,4},{2,4,0,4},{2,4,0,4},{2,4,0,4}};

    }

    public static void up(int[][] a)
    {
        int sum=0;
        //将所有数字往上移动
        for(int j=0;j<4;j++)//控制列
        {
            for(int i=1;i<4;i++)//控制行
            {
                int k=i;
                while(k>0&&a[k-1][j]!=0)
                {
                    a[k-1][j]=a[k][j];
                    a[k][j]=0;
                    k--;
                }
            }
        }

        return;
    }
}
