public class Client implements Chair{
    private String name;
    public Client(String name) {
        this.name = name;

    }

    public void orderChair(ChairType type) {
        Factory chairFactory = new Factory(){};
        Chair chair = chairFactory.createChair(type);
        System.out.println("спасибоза покупку "+ chair.GetType() +", приходите еще");
    }

    @Override
    public void sit(Chair chair) {
        System.out.println("вы протестировали " + chair.GetType());
    }

    @Override
    public String GetType() {
        return null;
    }
}