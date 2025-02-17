public class Person <U,T> extends Object{
    private U name;
    private T age;

    public U getName() {
        return name;
    }

    public void setName(U name) {
        this.name = name;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
