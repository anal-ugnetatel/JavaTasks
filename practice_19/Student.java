public class Student implements Comparable<Student>{
    private String fio;
    private int avgPoint, groupNum;


    public static final CompareAvg AVG_COMP = new CompareAvg();
    public static final CompareGroup GROUP_COMP = new CompareGroup();

    public Student(String fio, int avgPoint, int groupNum) {
        this.fio = fio;
        this.avgPoint = avgPoint;
        this.groupNum = groupNum;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        if(fio.equals(""))
            throw new EmptyString();
        this.fio = fio;
    }

    public int getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(int avgPoint) {
        this.avgPoint = avgPoint;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }


    @Override
    public String toString() {
        return "студент c ФИО: '" + fio + '\'' +
                ", средняя оценка: " + avgPoint +
                ", номер группы: " + groupNum;
    }

    @Override
    public int compareTo(Student o) {
        return this.fio.compareTo(o.fio);
    }
}