public class Student {
    private String name;
    private int avgPoint, groupNum;
    public Student(String name, int avgPoint, int groupNum) {
        this.name = name;
        this.avgPoint = avgPoint;
        this.groupNum = groupNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "студент c именем: '" + name + '\'' +
                ", средняя оценка: " + avgPoint +
                ", номер группы: " + groupNum + "\n";
    }
}

