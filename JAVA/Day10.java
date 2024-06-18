import java.util.Scanner;
public class Day10 {
    public static void main(String[] args) {
        int arr[][]=new int [2][3];
        Scanner S=new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("please enter element="  +  (i+1)+"and coloumn= "  +  (j+1));
                arr[i][j]=S.nextInt();
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
