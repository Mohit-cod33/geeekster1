public class Dogs {
    private String name;

    public Dogs(String name)
    {
        this.name = name;
    }

    public boolean equals(String other)
    {
        boolean b1=name.equals(other);
        return b1;
    }

    public static void main(String[] args)
    {
        Dogs dg1 = new Dogs("Rufus");
        Dogs dg2 = new Dogs("Sally");
        Dogs dg3 = new Dogs("Rufus");
        dg1=dg3;
        Dogs dg4 = dg3;
        System.out.println(dg1.equals(dg2));
        System.out.println(dg2.equals(dg3));
        System.out.println(dg1.equals(dg3));
        System.out.println(dg3.equals(dg4));
    }
}
