package main.labs.laba5.task2;

public class Student {
    String name;
    String group;
    int course;
    int mathMark;
    int physicsMark;
    double averageMark;
    public Student(String name, String group, int course, int mathMark,int physicsMark) {
        if (name == null) {
            throw new NullPointerException("Exception: s is null!");
        }
        if (group == null) {
            throw new NullPointerException("Exception: s is null!");
        }
        if (course<0) {
            throw new NullPointerException("Exception");
        }
        if (mathMark<0) {
            throw new NullPointerException("Exception");
        }
        if (physicsMark<0) {
            throw new NullPointerException("Exception");
        }
        try {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mathMark = mathMark;
        this.physicsMark=physicsMark;
        this.averageMark=findAverageMark();
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
    public String getName() {
        return this.name;
    }
    public String getGroup() {
        return this.group;
    }
    public int getCourse() {
        return this.course;
    }
    public void nextCourse() {
        this.course++;
    }
    public double findAverageMark() {
        if((this.physicsMark + this.mathMark) / 2.0f>0f){
            return (this.physicsMark + this.mathMark) / 2.0f;
        }else{
            System.out.println("Something went wrong.");
            return 1;
        }
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", koursage=" + course +
                ", srb=" + averageMark +
                '}';
    }
}
