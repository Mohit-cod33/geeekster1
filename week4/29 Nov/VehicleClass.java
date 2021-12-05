import java.util.Scanner;

class Vehicle{
    String type;
    String company;
    String model;
    int price;

    public void setType(String type) {
        this.type = type;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getType() {
        return type;
    }
    public String getCompany() {
        return company;
    }
    public String getModel() {
        return model;
    }
    public int getPrice() {
        return price;
    }
    public void Allinfo(){
        System.out.println("type: "+type+"\n"+"company: "+company+"\n"+"model: "+model+"\n"+"price: "+price);
    }
}

public class VehicleClass {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        Vehicle v=new Vehicle();
        System.out.print("Enter the type of vehicle: ");
        v.type=sc.next();
        System.out.print("Enter the company of vehicle: ");
        v.company=sc.next();
        System.out.print("Enter the model of vehicle: ");
        v.model=sc.next();
        System.out.print("Enter the price of vehicle: ");
        v.price=sc.nextInt();
        System.out.println("\n");
        System.out.println(v.company);
        v.Allinfo();
    }
}
