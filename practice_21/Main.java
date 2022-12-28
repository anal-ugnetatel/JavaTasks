public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory(){};

        Chair chair1 = factory.createChair(ChairType.VICTORIAN);
        Chair chair2 = factory.createChair(ChairType.MULTIFUNC);
        Chair chair3 = factory.createChair(ChairType.MAGIC);

        Client person = new Client("Anton");
        person.sit(chair1);
        person.sit(chair2);
        person.sit(chair3);
        person.orderChair(ChairType.VICTORIAN);
    }
}