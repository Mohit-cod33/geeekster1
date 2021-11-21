import java.util.Scanner;

public class grdingSystem {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your year:- ");
        int yr = sc.nextInt();
        System.out.print("Please enter your branch:- ");
        String bh = sc.next();

        if(yr==1)
            System.out.println("English , Math, Science");
        else if(yr==2)
        {
            switch(bh)
            {
                case "CSE":
                    System.out.println("Operating System, Java, Data Structure");
                    break;
                case "ECE":
                    System.out.println("Micro processors, Logic switching");
                    break;
                case "MEC":
                    System.out.println("Drawing, Manufacturing Machines");
                    break;
                default:
                    System.out.println("Invalid branch");
            }
        }
        else if(yr==3)
        {
            switch(bh)
            {
                case "CSE":
                    System.out.println("Computer Organization, MultiMedia");
                    break;
                case "ECE":
                    System.out.println("Fundamentals of Logic Design, Microeletronics");
                    break;
                case "MECH":
                    System.out.println("Internal Combustion Engines, Mechanical Vibration");
                    break;
                default:
                    System.out.println("Invalid branch");
            }
        }
        else if(yr==4)
        {
            switch(bh)
            {
                case "CSE":
                    System.out.println("Data Communication anad Networking, Multimedia");
                    break;
                case "ECE":
                    System.out.println("Embedded System , Image Processing");
                    break;
                case "MECH":
                    System.out.println("Production Technology , Thermal Engineering");
                    break;
                default:
                    System.out.println("Invalid branch");
            }
        }


    }

}
