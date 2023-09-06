import java.util.ArrayList;
import java.util.List;


public class Student<E> {// implements Comparable<Student> {

    private List<E> studentList = new ArrayList<E>();
    private int studentNu;
    private String name;
    private int age;

    public int getStudentNu() {
        return studentNu;
    }

    public void setStudentNu(int studentNu) {
        this.studentNu = studentNu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int age() {
        return age;
    }

    public List<E> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<E> studentList) {
        this.studentList = studentList;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void age(int age) {
        this.age = age;
    }

    public Student(int studentNu, String name, int age) {
        this.studentNu = studentNu;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.studentNu + " / " + this.name + " / " + this.age;
    }


//    @Override
//    public int compareTo(Student student) {
//        return getStudentNu() - student.getStudentNu();
//    }

}
