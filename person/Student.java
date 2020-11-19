package person;

public class Student {
    private int number;
    private String name;
    private String sex;
    private int classno;

    public Student(int number,String name,String sex,int classno) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.classno = classno;
    }
    public int getClassno() {
        return classno;
    }

    public void setClassno(int classno) {
        this.classno = classno;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
