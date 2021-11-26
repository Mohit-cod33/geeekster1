import java.util.Scanner;

public class revString {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Reversing a sentence Character by character..");
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println("\n");
        System.out.println("Reversing a sentence word by word..");
        String ans="";
        String ws[]=s.split(" ");
        for(int i=ws.length-1;i>=0;i--){
            ans+=ws[i]+" ";
        }
        System.out.println(ans);

    }
}
