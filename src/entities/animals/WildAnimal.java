package entities.animals;

public class WildAnimal extends Animal {
    private boolean angry = false;
    public WildAnimal(String name, boolean angry) {
        super(name);
        this.angry = angry;
    }

    public WildAnimal(String name) {super(name);}

    public WildAnimal() {}

    public boolean isAngry() {
        return angry;
    }
}
