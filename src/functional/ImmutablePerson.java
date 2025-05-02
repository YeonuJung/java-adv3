package functional;

public class ImmutablePerson {

    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ImmutablePerson withName(String name) {
        return new ImmutablePerson(name, this.age);
    }

    public ImmutablePerson withAge(int age) {
        return new ImmutablePerson(this.name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
