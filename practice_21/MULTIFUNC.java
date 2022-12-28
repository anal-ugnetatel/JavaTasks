
public class MULTIFUNC implements Chair{
    @Override
    public void sit(Chair chair) {
        System.out.println("Это MULTIFUNC");
    }

    @Override
    public String GetType() {
        return "miltifunc";
    }
}