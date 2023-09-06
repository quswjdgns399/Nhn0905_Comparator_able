import java.util.Comparator;

public interface OrderAge<E> extends Comparator<Student> {
    public int compare(Student student1, Student student2);
    
}
