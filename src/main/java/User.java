import java.util.Comparator;

public class User {
    public static Comparator<? super User> getAge;
    private String name;
    private int age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User {Name: '"+name+"', Age: "+age+"}";
    }
}