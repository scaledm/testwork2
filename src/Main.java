import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
Scanner sc= new Scanner(System.in);
System.out.println("Enter size of matrix");

int n=sc.nextInt();
int m=n;
int A[][]= new int[n][m];
int i,j;
for(i=0;i<n;i++)
{
    for(j=0;j<m;j++)
    {
        A[i][j]=((int)(Math.random()*50));
        System.out.print(" "+A[i][j]);
    }

System.out.println();

}
        int max=-1000,ln=0,lm=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(A[i][j]>max & j>i){
                    max=A[i][j];
                    ln=i;
                    lm=j;
                }
            }





        }

        System.out.println("max:"+max+"      lane:"+ln+"          column:"+lm);
        for(i=ln;i<n-1;i++)
        {
            for(j=0;j<m;j++)
            {A[i][j]=A[i+1][j];

            }
        }
        n--;
        System.out.println("Matrix after delete:");
        for(i=0;i<n;i++) {
            for (j = 0; j < m; j++) {

                System.out.print(" " + A[i][j]);
            }
            System.out.println();
        }
        }

}