import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Department<E> implements Iterable<E> {

    private int department;
    private String departmentName;

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setList(List<E> list) {
        this.list = list;
    }

    public List<E> getList() {
        return list;
    }


    private List<E> list = new ArrayList<>(); //Iterator 사용시 Iterable 을 implement 해야함

    public Department(int num, String name) {
        this.department = num;
        this.departmentName = name;
    }

    public void add(E student) {
        list.add(student);
    }

    @Override
    public Iterator<E> iterator() { //iterator 는 Scanner역할이라 그릇이 되지 못함
        return list.iterator();
    }


}
