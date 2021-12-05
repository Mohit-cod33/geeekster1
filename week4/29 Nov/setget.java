import java.util.Scanner;

class SetGets{
    String company;
    String model;
    String fuel;
    String colour;
    int price;
    public void setCompany(String company) {
        this.company = company;
    }
    public String getCompany() {
        return company;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
    public String getFuel() {
        return fuel;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour() {
        return colour;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void car(){
        System.out.println("This is car.........\n");
        System.out.println("company: "+company+"\n"+"model: "+model+"\n"+"fuel: "+fuel+"\n"+"colour: "+colour+"\n"+"price: "+price);
    }
}
public class setget {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of a car.....");
        SetGets sg = new SetGets();
        System.out.print("Enter the company of a car: ");
        sg.setCompany(sc.next());
        System.out.print("Enter the model of a car: ");
        sg.setModel(sc.next());
        System.out.print("Enter the type of fuel of a car: ");
        sg.setFuel(sc.next());
        System.out.print("Enter the colour of a car: ");
        sg.setColour(sc.next());
        System.out.print("Enter the price of a car: ");
        sg.setPrice(sc.nextInt());

        sg.car();
    }
}
