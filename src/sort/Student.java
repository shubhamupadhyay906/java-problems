package sort;

public class Student implements Comparable<Student>{
    private String name;
    private int studentId;
    private byte age;

    public Student(String name, int studentId, byte age) {
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

    @Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();
    }

}
