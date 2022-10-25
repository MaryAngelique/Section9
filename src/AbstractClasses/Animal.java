package AbstractClasses;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();
    public abstract void fly();

    public String getName() {
        return name;
    }

}
