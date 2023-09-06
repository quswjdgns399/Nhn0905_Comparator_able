public class Student implements Person {
    private int studentNu;
    private String name;
    private int age;

    public Student(int studentNu, String name, int age) {
        this.studentNu = studentNu;
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getPersonNum() {
        return getStudentNu();
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }


    public int getStudentNu() {
        return studentNu;
    }

    public void setStudentNu(int studentNu) {
        this.studentNu = studentNu;
    }

    @Override
    public String toString() {
        return studentNu + " / " + name + " / " + age;
    }
}
