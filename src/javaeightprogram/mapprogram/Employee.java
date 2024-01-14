package javaeightprogram.mapprogram;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private long salary;
    private byte age;
    private List<String> cities;

    public Employee(int id, String name, long salary, byte age, List<String> cities) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.cities = cities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", cities=" + cities +
                '}';
    }
}
