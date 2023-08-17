public class Student
{
    String name;
    String advJGrade;
    int laptopNum;
    double gpa;
    boolean playsDND;

    public Student(String name, String advJGrade, int laptopNum, double gpa, boolean playsDND) {
        this.name = name;
        this.advJGrade = advJGrade;
        this.laptopNum = laptopNum;
        this.gpa = gpa;
        this.playsDND = playsDND;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", advJGrade='" + advJGrade + '\'' +
                ", laptopNum=" + laptopNum +
                ", gpa=" + gpa +
                ", playsDND=" + playsDND +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdvJGrade() {
        return advJGrade;
    }

    public void setAdvJGrade(String advJGrade) {
        this.advJGrade = advJGrade;
    }

    public int getLaptopNum() {
        return laptopNum;
    }

    public void setLaptopNum(int laptopNum) {
        this.laptopNum = laptopNum;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public boolean isPlaysDND() {
        return playsDND;
    }

    public void setPlaysDND(boolean playsDND) {
        this.playsDND = playsDND;
    }
}
