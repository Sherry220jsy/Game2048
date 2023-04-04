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
        if (in.equals("s"))   //start
        {
            c.setStatus("playing");
            return true;
        }
        //未完待续...
        System.out.println("异常：非法的输入："+in);
        return false;
    }
    public static int up(int[][] a)
    {
        int sum=0;//相加的数之和

        for(int j=0;j<4;j++)//控制列
        {
            for(int i=1;i<4;i++)//控制行
            {
                //将a[i][j]数字往上移动直到上一个数字不为0或到顶为止
                int k=i;
                while(k>0 && a[k-1][j]==0)
                {
                    a[k-1][j]=a[k][j];
                    a[k][j]=0;
                    k--;
                }
                //移动到a[k][j]，判断该数字上方是否有数字是否可加，可加相加
                while(k>0&&a[k][j]!=0)
                {
                    if(a[k][j]==a[k-1][j])
                    {
                        a[k-1][j]=a[k][j]+a[k-1][j];
                        sum=sum+a[k-1][j];
                        a[k][j]=0;
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
    public static int down(int[][] a)
    {
        int sum=0;

        for(int j=0;j<4;j++)//控制列
        {
            for(int i=2;i>-1;i--)//控制行
            {
                int k=i;
                while(k<3 && a[k+1][j]==0)
                {
                    a[k+1][j]=a[k][j];
                    a[k][j]=0;
                    k++;
                }

                while(k<3&&a[k][j]!=0)
                {
                    if(a[k][j]==a[k+1][j])
                    {
                        a[k+1][j]=a[k][j]+a[k+1][j];
                        sum=sum+a[k+1][j];
                        a[k][j]=0;
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

    public static int left(int[][] a)
    {
        int sum=0;

        for(int j=0;j<4;j++)//控制行
        {
            for(int i=1;i<4;i++)//控制列
            {
                int k=i;
                while(k>0 && a[j][k-1]==0)
                {
                    a[j][k-1]=a[j][k];
                    a[j][k]=0;
                    k--;
                }

                while(k>0&&a[j][k]!=0)
                {
                    if(a[j][k]==a[j][k-1])
                    {
                        a[j][k-1]=a[j][k]+a[j][k-1];
                        sum=sum+a[j][k-1];
                        a[j][k]=0;
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
    public static int right(int[][] a)
    {
        int sum=0;

        for(int j=0;j<4;j++)//控制行
        {
            for(int i=2;i>-1;i--)//控制列
            {
                int k=i;
                while(k<3 && a[j][k+1]==0)
                {
                    a[j][k+1]=a[j][k];
                    a[j][k]=0;
                    k++;
                }

                while(k<3&&a[j][k]!=0)
                {
                    if(a[j][k]==a[j][k+1])
                    {
                        a[j][k+1]=a[j][k]+a[j][k+1];
                        sum=sum+a[j][k+1];
                        a[j][k]=0;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        return sum;
    }
}
