import java.util.Scanner;

class D_obejct{
    String company;
    String model;
    String fuel;
    String colour;
    int price;
    D_obejct(){
        this.company="Hero";
        this.model="PassionPro";
        this.fuel="petrol";
        this.colour="Red";
        this.price=80000;
    }
    D_obejct(String company,String model,String fuel,String colour,int price){
        this.company=company;
        this.model=model;
        this.fuel=fuel;
        this.colour=colour;
        this.price=price;
    }
    D_obejct(String company,String model,int price,String fuel,String colour){
        this.company=company;
        this.model=model;
        this.fuel=fuel;
        this.colour=colour;
        this.price=price;
    }

    public void bike(){
        System.out.println("This is bike.........\n");
        System.out.println("company: "+company+"\n"+"model: "+model+"\n"+"fuel: "+fuel+"\n"+"colour: "+colour+"\n"+"price: "+price);
    }
    public void car(){
        System.out.println("This is car.........\n");
        System.out.println("company: "+company+"\n"+"model: "+model+"\n"+"fuel: "+fuel+"\n"+"colour: "+colour+"\n"+"price: "+price);
    }
    public void truck(){
        System.out.println("This is truck........\n");
        System.out.println("company: "+company+"\n"+"model: "+model+"\n"+"fuel: "+fuel+"\n"+"colour: "+colour+"\n"+"price: "+price);
    }
}

public class BikECarTrek {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details of car/trek.....");
        String company=sc.next();
        String model=sc.next();
        String fuel=sc.next();
        String colour=sc.next();
        int price=sc.nextInt();
        D_obejct bike=new D_obejct();
        D_obejct car=new D_obejct(company,model,fuel,colour,price);
        D_obejct trek=new D_obejct("Mahindra","Ford f250",2000000,"diesel","silver");
        bike.bike();
        car.car();
        trek.truck();

    }
}
