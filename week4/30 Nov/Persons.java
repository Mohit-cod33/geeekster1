public class Persons {
    // fields
    private String name;
    private String email;
    private String phoneNumber;



    public Persons()
    {
        System.out.println("Please add field details");
    }

    // constructor
    public Persons(String theName)
    {
        this(theName+"@edu.in","406 558-7725");
        this.name = theName;

    }


    public Persons(String theEmail,String thePhoneNumber)
    {
        this.email = theEmail;
        this.phoneNumber=thePhoneNumber;
    }

    public Persons(String theName,String theEmail,String thePhoneNumber)
    {
        this.name = theName;
        this.email = theEmail;
        this.phoneNumber=thePhoneNumber;
    }


    // methods - getters
    public String getName() { return this.name;}
    public String getEmail() { return this.email;}
    public String getPhoneNumber() { return this.phoneNumber;}

    // methods - setters
    public void setName(String theName) { this.name = theName;}
    public void setEmail(String theEmail) {this.email = theEmail;}
    public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
    public String toString()
    {
        return this.name + "\t\t" + this.email + " " + this.phoneNumber;
    }

    // main method for testing
    public static void main(String[] args)
    {
        System.out.println("Name"+"\t\tEmails");
        Persons p1 = new Persons("Sana");
        System.out.println(p1);

        Persons p2 = new Persons("Jean");
        p2.setEmail("jean@gmail.com");
        p2.setPhoneNumber("404 899-9955");
        System.out.println(p2);

        Persons p3=new Persons("RatanTata","tata.motors_Ratan@gmail.com","85146245244");
        System.out.println(p3);
    }
}
