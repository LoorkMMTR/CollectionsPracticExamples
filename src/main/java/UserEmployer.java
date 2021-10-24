public class UserEmployer extends UserConstructor {
    public String position;

    public UserEmployer(String name, Integer age, String position) {
        super(name, age);
        this.position = position;
    }

    @Override
    public String toString() {
        return "User {Name: "+name+", Age: "+age+", Position: "+position+"}";
    }
}
