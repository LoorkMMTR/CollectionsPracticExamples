public class UserKidOrOld {
    private final String name;
    private final Double age;

    public UserKidOrOld(String name, Double age) {
        this.name = name;
        this.age = age;
    }

    public static UserKidOrOld kid() {
        double randomAge = 1 + Math.random()*16.9, roundRandomAge = (double) Math.round(randomAge * 10) / 10;
        return new UserKidOrOld("Ребенок", roundRandomAge);
    }

    public static UserKidOrOld old() {
        return new UserKidOrOld("Старик", 100.0);
    }

    @Override
    public String toString() {
        return "User {Name: "+name+", Age: "+age+"}";
    }
}

