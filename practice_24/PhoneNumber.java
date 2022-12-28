public class PhoneNumber {
    private String code, fisttree, sectree, four;

    public PhoneNumber(String phone){
        if(phone.startsWith("8")){
            code = "+7";
        }else{
            code = phone.substring(0, phone.length()-10);
        }
        fisttree = phone.substring(phone.length()-10, phone.length()-7);
        sectree = phone.substring(phone.length()-7, phone.length()-4);
        four = phone.substring(phone.length()-4);
    }

    @Override
    public String toString() {
        return code + fisttree + "-" + sectree + "-" + four;
    }

    public static void main(String[] args) {
        System.out.println(new PhoneNumber("89175655655"));
        System.out.println(new PhoneNumber("+79175655655"));
        System.out.println(new PhoneNumber("+102896522110000"));
        System.out.println(new PhoneNumber("+18005553535"));
    }
}
