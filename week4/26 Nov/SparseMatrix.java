import java.util.Scanner;

public class SparseMatrix {
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
        int s=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]>0)
                    s++;
            }
        }
        int new_arr[][]=new int[3][s];
        int k=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]!=0){
                    new_arr[0][k]=i;
                    new_arr[1][k]=j;
                    new_arr[2][k]=arr[i][j];
                    k++;
                }
            }
        }
        System.out.println("The Result of sparse Matrix....... ");
        for(int i=0;i<3;i++){
            for(int j=0;j<s;j++){
                System.out.print(new_arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
