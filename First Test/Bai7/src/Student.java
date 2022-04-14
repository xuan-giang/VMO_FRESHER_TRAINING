public class Student {
    private String name;
    private int age;
    private double math, physical, chemistry;
    private double avg;
    private String rank;

    public Student() {
    }

    public Student(String name, int age, double math, double physical, double chemistry) {
        this.name = name;
        this.age = age;
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
        this.avg = (math+physical+chemistry)/3;
        this.rank = setUpRank(this.avg);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", math=" + math +
                ", physical=" + physical +
                ", chemistry=" + chemistry +
                ", avg=" + avg +
                ", rank='" + rank + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysical() {
        return physical;
    }

    public void setPhysical(double physical) {
        this.physical = physical;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }

    public double getAvg() {
        return this.avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String setUpRank(double avg) {
        String rankTemp;
        if(avg >= 8){
            rankTemp = "GIOI";
        }else if(avg >= 6.5 && avg < 8){
            rankTemp = "KHA";
        }else if(avg >= 5 && avg < 6.5){
            rankTemp = "TB";
        }else{
            rankTemp = "YEU";
        }
        return rankTemp;
    }
}
