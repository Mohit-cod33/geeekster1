public class Dogg {
    public void speak()
    {
        System.out.println("woof!");
    }

    public static void main(String[] args)
    {
        Dogg dog = new Dogg();
        dog.speak();
        Beagle bea = new Beagle();
        bea.speak();
    }
}

class Beagle extends Dogg
{
    public void speak()
    {
        System.out.println("arf arf");
    }
}
