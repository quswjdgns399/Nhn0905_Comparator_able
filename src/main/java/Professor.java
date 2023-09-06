import java.util.ArrayList;
import java.util.List;

public class Professor implements Person {

    private List<Professor> professorList = new ArrayList<>();
    private int professorNu;
    private String name;
    private int age;

    public List<Professor> getProfessorList() {
        return professorList;
    }


    public int getProfessorNu() {
        return professorNu;
    }

    public void setProfessorNu(int professorNu) {
        this.professorNu = professorNu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Professor(int professorNu, String name, int age) {
        this.professorNu = professorNu;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.professorNu + " / " + this.name + " / " + this.age;
    }

    @Override
    public int getPersonNum() {
        return getProfessorNu();
    }
}
