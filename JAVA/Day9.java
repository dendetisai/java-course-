import java.util.Scanner;
public class Day9 {
    public static void main(String[] args) {
        int arr[]=new int[12];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<12;i++)
        {
            System.out.println("please enter marks of student"+(i+1));
            arr[i]=s.nextInt();
        }
        for(int i=0;i<12;i++){
            System.out.println(arr[i]);
        }
    }
}

