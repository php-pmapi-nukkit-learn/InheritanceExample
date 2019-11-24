package entities.animals;

public class Pet extends Animal {
    public Pet(String name) {
        super(name);
    }

    public void stroke() {
        System.out.println("Ты погладил " + getName());
    }
}
