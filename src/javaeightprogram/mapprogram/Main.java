package javaeightprogram.mapprogram;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Hari", 10000, (byte) 32, List.of("Hyderabad", "Bangalore", "Pune"));
        Employee e2 = new Employee(2, "Ravi", 25000, (byte) 29, List.of("Noida", "Bangalore", "Chennai"));
        Employee e3 = new Employee(3, "Sai", 15000, (byte) 30, List.of("Hyderabad"));
        Employee e4 = new Employee(4, "Raj", 37000, (byte) 35, List.of("Chennai"));
        Employee e5 = new Employee(5, "Mangesh", 10000, (byte) 25, List.of("Hyderabad"));
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        for (Employee e : employees) {
            System.out.println(e);
        }

        List<Integer> map = employees.stream().map(Employee::getId).toList();
        System.out.println(map);

        List<String> flapMap = employees.stream()
                .flatMap(cities -> cities.getCities().stream()).distinct().toList();
        System.out.println(flapMap);

        //sorting employees by salary desc order
        System.out.println("Sorted salary");
        employees.stream()
                .map(Employee::getSalary)
                .sorted((o1, o2) -> (int) (o2 - o1))
                .toList().forEach(System.out::println);

        //fetch top 3 salary
        System.out.println("top 3 salary");
        employees.stream()
                .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .limit(3)
                .toList().forEach(System.out::println);

        //fetch less than 3 highest salary
        System.out.println("less than 3rd highest salary");
        employees.stream()
                .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .skip(3)
                .toList().forEach(System.out::println);

        //fetch max age
        System.out.println("max age");
         Byte aByte = employees.stream()
                .map(Employee::getAge)
                .max((o1, o2) -> o1 - o2)
                .get();
        System.out.println(aByte);

        //fetch min age
        System.out.println("min age");
        Byte minAge = employees.stream()
                .map(Employee::getAge)
                .min((o1, o2) -> o1 - o2)
                .get();
        System.out.println(minAge);

        //fetch sum age
        System.out.println("sum age");
        int sum = employees.stream()
                .map(Employee::getAge)
                .mapToInt(value -> value)
                        .sum();
        System.out.println(sum);
        System.out.println(sum/employees.size());

    }
}
