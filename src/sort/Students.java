package sort;

import java.util.Comparator;

public class Students {
    private String name;
    private int studentId;
    private byte age;

    public Students(String name, int studentId, byte age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public byte getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", age=" + age +
                '}';
    }
}
