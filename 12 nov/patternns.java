import java.util.Scanner;

public class patternns {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("number pattern");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("Number pattern in reverse order");
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("Right triangle..........");
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Pyramid pattern......");
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println("reverse pyramid............");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<n-1-i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println("Diamond pattern.............");
        int sp=n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            sp--;
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sp=1;
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=sp;j++){
                System.out.print(" ");
            }
            sp++;
            for(int j=1;j<=2*(n-i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
