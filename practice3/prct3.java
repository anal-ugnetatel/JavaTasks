
import java.util.Date;

public class prct3 {
    public static void main(String[] args) {

        // test Circle
        Circle circle = new Circle(7);
        System.out.println(circle.toString() + ", circle area: " + String.format("%.3f", circle.getArea()));
        circle.setRadius(32.10);
        System.out.println(circle.toString() + ", circle area: " + String.format("%.3f", circle.getArea()));

        // test Human
        Human human = new Human("Ivan", 18);
        human.setAge(22);//re set age
        human.displayInfo();

        // test Human head
        Human.Head humanHead = human.new Head();
        humanHead.think();
        humanHead.sleep(false);
        humanHead.sleep(true);

        // test Human hand
        Human.Hand humanHand = human.new Hand();
        humanHand.move();
        humanHand.dropItem();
        humanHand.holdItem("cup");
        humanHand.dropItem();

        // test Human leg
        Human.Leg humanLeg = human.new Leg();
        humanLeg.move();

        // Book class test
        Book book = new Book("ShortStories", "GreyG", new Date());
        System.out.println(book);
        book.setName("1999");
        book.setWritingDate(new Date(1));
        System.out.println(book);
    }
}

class Circle {
    double radius;
    double diameter;
    // Init
    Circle(double radius) {
        this.radius = radius;
        this.diameter = this.radius * 2;
        System.out.println("Added Circle object (created)");
    }
    // Radius getter
    double getRadius() {
        return this.radius;
    }
    // Radius setter
    void setRadius(double radius) {
        this.radius = radius;
        this.diameter = this.radius * 2;
        System.out.println("Added Radius " + this.radius + " (set)");
    }
    // Area getter
    double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    public String toString() {
        return "Circle radius: " + getRadius() + ", diameter: " + this.diameter;
    }
}

class Human {
    private String name;
    private int age;

    Human(String name, int age) {
        this.name = name;
        this.age =  age;
        System.out.println("Added Human object (created)");
    }

    void displayInfo() {
        System.out.println("Human name: " + this.name + ", age: " + this.age);
    }

    // Name getter
    String getName() {
        return this.name;
    }

    // Name setter
    void setName(String name) {
        this.name = name;
    }

    // Age getter
    int getAge() {
        return this.age;
    }

    // Age setter
    void setAge(int age) {
        if (0 < age && age < 100) {
            this.age = age;
        }
    }

    public String toString() {
        return this.name;
    }

    class Head {
        private boolean isSleeping = false;

        // Head think method
        void think() {
            System.out.println(name + " is thinking");
        }

        // Head sleep method
        void sleep(boolean isSleeping) {
            this.isSleeping = isSleeping;
            if (this.isSleeping) System.out.println(name + " now sleeping");
            else System.out.println(name + " now not sleeping");
        }
    }

    class Leg {

        // Leg moving method
        void move() {
            System.out.println(name + "'s leg is moving");
        }
    }

    class Hand {
        private String itemInHand;

        // Hand moving method
        void move() {
            System.out.println(name + "'s hand is moving");
        }

        // Hand holding item method
        void holdItem(String item) {
            this.itemInHand = item;
            System.out.println(name + " holds " + this.itemInHand);
        }

        // Hand dropping item method
        void dropItem() {
            if (itemInHand != null) {
                System.out.println(name + " dropped " + this.itemInHand);
                this.itemInHand = null;
            }
            else{
                System.out.println(name + " had nothing to drop");
            }
        }
    }
}

class Book {
    private String name;
    private String author;
    private Date bookWritingDate = new Date();
    Book(String name, String author, Date bookWritingDate) {
        this.name = name;
        this.author = author;
        this.bookWritingDate = bookWritingDate;
        System.out.println("Added Book object (created)");
    }

    // Book name getter
    String getName() {
        return this.name;
    }

    // Book name setter
    void setName(String name) {
        this.name = name;
    }

    // Book author getter
    String getAuthor() {
        return this.author;
    }

    // Book author setter
    void setAuthor(String author) {
        this.author = author;
    }

    // Book writing date getter
    Date getWritingDate() {
        return this.bookWritingDate;
    }

    // Book writing date setter
    void setWritingDate(Date bookWritingDate) {
        this.bookWritingDate.setTime(bookWritingDate.getTime());
    }

    public String toString() {
        return "Book name: " + getName() + ", author: " + getAuthor() + ", writing date: " + getWritingDate();
    }
}

