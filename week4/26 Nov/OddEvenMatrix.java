import java.util.Scanner;

public class OddEvenMatrix {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int row=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int cnt_odd=0;
        int cnt_even=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]%2==0)
                    cnt_even++;
                else
                    cnt_odd++;
            }
        }
        System.out.println("Even numbers present in the array are: "+cnt_even);
        System.out.println("Odd numbers present in the array are: "+cnt_odd);
    }
}
