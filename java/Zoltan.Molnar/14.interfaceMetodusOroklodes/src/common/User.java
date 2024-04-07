package common;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " vagyok, " + age + " eves";
    }

    @Override
    public int compareTo(User other) {
        return name.compareToIgnoreCase(other.name);
    }
}
