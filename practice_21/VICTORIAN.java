public class VICTORIAN implements Chair {

    @Override
    public void sit(Chair chair) {
        System.out.println("Это VICTORIAN");
    }

    @Override
    public String GetType() {
        return "victorian";
    }
}