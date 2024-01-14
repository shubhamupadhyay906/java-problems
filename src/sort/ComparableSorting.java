package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSorting {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Shubham", 1, (byte) 25));
        students.add(new Student("Satya", 2, (byte) 23));
        students.add(new Student("Rahul", 3, (byte) 30));
        students.add(new Student("Mangesh", 4, (byte) 21));
        // final List<Student> students1 = sortStudent(students);
        //using comparable
        Collections.sort(students);
        System.out.println(students);
        //nth highest value
//        int nth = 2;
//        Optional<Student> collect = students.stream()
//                .sorted((o1,o2)-> o2.getAge()- o1.getAge()).skip(nth - 1).findFirst();
//        Student min = students.stream().min((o1,o2)->o1.compareTo(o2)).get();
//        Byte max = students.stream().max((o1,o2)->o1.compareTo(o2)).map(Student::getAge).get();
//        System.out.println(collect);
//        System.out.println(min);
//        System.out.println(max);
    }

    private static List<Student> sortStudent(ArrayList<Student> students) {
        return students.stream().sorted().toList();
    }
}
