import static java.lang.Double.parseDouble;

public class UserConstructor {
    public String name;
    public Double age;

    public UserConstructor(String name, Double age) {
        this.name = name;
        this.age = age;
    }

    public UserConstructor(String name, Integer age) {
        this.name = name;
        this.age = age.doubleValue();
    }

    public UserConstructor(String name, String age) {
        this.name = name;
        this.age = parseDouble(age);
    }

    public UserConstructor(String name) {
        this.name = name;
        this.age = 21.0;
    }

    @Override
    public String toString() {
        return "User {Name: "+name+", Age: "+age+"}";
    }
}

