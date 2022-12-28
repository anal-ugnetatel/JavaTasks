public class Person {
    private String surname, name, infather;

    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String surname, String name, String infather) {
        this.surname = surname;
        this.name = name;
        this.infather = infather;
    }
    public String getSur(){
        StringBuilder sb = new StringBuilder(surname);
        if(name != null && ! name.equals(""))
            sb.append(" ").append(name);
        if(infather != null && ! infather.equals(""))
            sb.append(" ").append(infather);
        return sb.toString();
    }

    public static void main(String[] args) {
        Person p1 = new Person("Norris");
        Person p2 = new Person("Hamilton", "", "");
        Person p3 = new Person("Комаров", "Петр", "Николаевич");
//surname name infather
        System.out.println(p1.getSur());
        System.out.println(p2.getSur());
        System.out.println(p3.getSur());
    }
}
//24