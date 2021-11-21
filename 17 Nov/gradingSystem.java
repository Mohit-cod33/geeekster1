import java.util.Scanner;

public class courseSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your score");
        int score = sc.nextInt();

        if(score>=50 && score<=59)
        {
            System.out.println(score1());
        }
        else if(score>=60 && score <=69)
        {
            System.out.println(score2());
        }
        else if(score>=70 && score<=79)
        {
            System.out.println(score3());
        }
        else if(score>=80 && score<=89)
        {
            System.out.println(score4());
        }
        else if(score>=90 && score<=100)
        {
            System.out.println(score5());
        }
        else if(score<50)
        {
            System.out.println(score6());
        }
        else
            System.out.println("Invalid");
    }

    private static String score6() {
// TODO Auto-generated method stub
        return "Fail";
    }

    private static String score5() {
// TODO Auto-generated method stub
        return "A+";
    }

    private static char score4() {
// TODO Auto-generated method stub
        return 'A';
    }

    private static char score3() {
// TODO Auto-generated method stub
        return 'B';
    }

    private static char score2() {
// TODO Auto-generated method stub
        return 'C';
    }

    private static char score1() {
        return 'D';
    }

}