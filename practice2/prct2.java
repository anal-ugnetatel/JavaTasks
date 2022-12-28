import java.util.*;

public class prct2 {
    public static void main(String[] args) {

        Shape Square = new Shape("qadrat");
        System.out.println("toString() method test: " + Square.toString());


        Ball ball = new Ball(7);
        ball.displayInfo();

        Book book = new Book("ShortStories", 123);
        book.displayInfo();


        Dog wolf = new Dog("Grey", 3);
        //wolf.setAge(3); //reset age
        System.out.println(wolf);

        Dog dogs[] = { new Dog("Black", 6), new Dog("White", 9), new Dog("Purple", 1) };


        DogNursery dogNursery = new DogNursery();
        System.out.println(dogNursery);//create nursery

        dogNursery.addDog(wolf);
        System.out.println(dogNursery);//test adding one dog

        dogNursery.addDogs(dogs);
        System.out.println(dogNursery);//test adding some dogs
    }
}

class Shape {
    private String name;
    Shape(String name) {
        this.name = name;
        System.out.println("\nAdded Shape object " + this.name + " (created)");
    }
    public String toString() {
        return "Shape: " + this.name;
    }
}

class Dog {
    private String name;
    private int age;
    Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("\nAdded Dog object with name: " + this.name + " (created)");
    }
    // Age setter
    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        }
    }
    // Age getter
    public int getAge() {
        return this.age;
    }
    // Name setter
    public void setName(String name) {
        this.name = name;
        System.out.println("Dog name set as: " + this.name);
    }
    // Name getter
    public String getName() {
        return this.name;
    }

    public int getHumanAge() {
        return this.age * 7;
    }

    public String toString() {
        return "Dog " + getName() + " with age " + getAge();
    }
}

class DogNursery {
    private List<Dog> dogNurseryArray = new ArrayList<Dog>();
    {
        System.out.println("\nAdded Dog nursery object (created)");
    }
    // test on one dog
    public void addDog(Dog dog) {
        this.dogNurseryArray.add(dog);
        System.out.println(dog + ". This dog was added into nursery successfully");
    }
    // test on multiple dogs
    public void addDogs(Dog dogs[]) {
        this.dogNurseryArray.addAll(new ArrayList<Dog>(Arrays.asList(dogs)));
        System.out.println("Dogs: " + Arrays.toString(dogs) + " added into the dog nursery successfully");
    }
    public String toString() {
        if (!this.dogNurseryArray.isEmpty()) return "Dog nursery: " + this.dogNurseryArray;
        else return "Dog nursery empty!";
    }
}

class Ball {
    int radius;
    int diameter;
    Ball(int radius) {
        this.radius = radius;
        this.diameter = this.radius * 2;
        System.out.println("\nAdded Ball object (created)");
    }
    void displayInfo() {
        System.out.printf("Radius: %s \tDiameter: %d\n", this.radius, this.diameter);
    }
}

class Book {
    String name;
    int pages;
    Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
        System.out.println("\nAdded Book object (created)");
    }
    void displayInfo() {
        System.out.printf("Book's name: %s \tPages: %d\n", this.name, this.pages);
    }
}
