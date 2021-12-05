public class Candy {
    public String taste()
    {
        return "tastes sweet!";
    }

    public static void main(String[] args)
    {
        Candy cd = new Candy();
        System.out.println(cd.taste());
        Candy cd1 = new Choco();
        System.out.println(cd1.taste());
    }
}

class Choco extends Candy
{
    public String taste()
    {
        return "tastes chocolaty!";
    }
}