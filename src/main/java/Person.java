public interface Person extends Comparable<Person> {
    String getName();

    int getAge();

    int getPersonNum();

    void setName(String name);

    void setAge(int age);

    // This is the compareTo method required for Comparable
    @Override
    default int compareTo(Person person) {
        return getAge() - person.getAge();
    }


}
