package main.labs.laba5.Adapters;

import main.labs.laba5.task2.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentAdapter {

    public static List<Student> delFromList(List<Student> list) {
        List<Student> result = new ArrayList<Student>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).findAverageMark() >= 3.0f) {
                result.add(list.get(i));
            }
        }
        for (int i = 0; i < result.size(); i++) {
            result.get(i).nextCourse();
        }
        return result;
    }

    public static void printList(List list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void printStudents(List<Student> list, int course) {
        for (Student student : list) {
            if (student.getCourse() == course)
                System.out.println(student);
        }
    }
}
