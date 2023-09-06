import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Department<Student> department = new Department<>(5, "Conputer Engineering");
        department.add(new Student(2, "junghun", 25));
        department.add(new Student(4, "wise", 24));
        department.add(new Student(1, "jong", 23));
        department.add(new Student(3, "kim", 21));

        Date date = new Date();
        System.out.println(date);

        // 익명 class, 익명메소드(람다식), 객체생성(compare to 정의)

        //Collections.sort(department.getList()); // compare 정의 후 학번 비교
        //Collections.sort(department.getList(), (e1, e2) -> e1.compareTo(e2)); //compare 정의 후 람다식으로 학번 비교
        //Collections.sort(department.getList(), (e1, e2) -> e1.getAge() - e2.getAge()); //람다식으로 정의 후 나이로 비교

        OrderAge<Student> orderAge = new OrderAge() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getAge() - student2.getAge();
            }

        };


        Collections.sort(department.getList(), orderAge);

        printStudentInformation(department);


    }

    public static void printStudentInformation(Department<Student> department) {
        for (Student student : department) {
            System.out.println(student);
        }
    }
}
