package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class ComparatorSorting {

    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("Shubham", 1, (byte) 25));
        students.add(new Students("Satya", 2, (byte) 23));
        students.add(new Students("Rahul", 3, (byte) 30));
        students.add(new Students("Aryan", 3, (byte) 30));
        students.add(new Students("Mangesh", 4, (byte) 21));
        students.sort(new AgeComparator());
        System.out.println(students);

        ArrayList<Students> std = new ArrayList<>(students);
//        std.sort(new AgeComparator.NameComparator());
//        comparing two fields
        List<Students> list = students.stream()
                .sorted(Comparator.comparingInt(Students::getAge)
                        .thenComparing(Students::getName))
                .toList();
        System.out.println(list);

    }

    private static List<Student> sortStudent(ArrayList<Student> students) {
        return students.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).toList();
    }
}
