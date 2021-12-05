class Animal {
    String type;
    String name;
    static int age;
    String colour;

    Animal() {
        this.type="mammal";
        this.name="Dog";
        this.age=4;
        this.colour="Brown";
    }

    Animal(String type,String name, int age,String colour) {
        this.type=type;
        this.name = name;
        this.colour =colour;
    }

    Animal(String name, int age,String type) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public int getAge() {
        return age;
    }

    public static void incrementAge(int age1) {
        age = age + age1;
    }

//    public String toString() {
//        return this.name;
//    }

}

class TypeofAnimal {
    public static void main(String args[]) {
        Animal dog = new Animal();
        dog.setType("mammal");
        System.out.println(" Type: " + dog.getType());
        System.out.println();

        Animal cat = new Animal("Mammal", "Cat", 3, "red&white");

        System.out.println("Animal: " + cat.getName());
        System.out.println("age: " + cat.getAge());
        System.out.println("Colour: " + cat.getColour());
        System.out.println("Type: " + dog.getType());
        System.out.println();

        Animal cow = new Animal("cattle", "Cow", 9, "white");
        cow.incrementAge(10);
        System.out.println("Animal: " + cow.getName());
        System.out.println("age: " + cow.getAge());
        System.out.println("colour: " + cow.getColour());
        System.out.println("Type: " + cow.getType());
        System.out.println();

        Animal elephant = new Animal("Mammal", "elephant", 15, "Black");
        cow.incrementAge(10);
        System.out.println("Animal: " + elephant.getName());
        System.out.println("age: " + elephant.getAge());
        System.out.println("colour: " + elephant.getColour());
        System.out.println("Type: " + elephant.getType());
        System.out.println();

    }
}

