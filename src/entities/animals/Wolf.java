package entities.animals;

public class Wolf extends WildAnimal {
    private boolean siberian;
    public Wolf(String name, boolean angry, boolean siberian) {
        super(name, angry);
        this.siberian = siberian;
    }

    public boolean isSiberian() {
        return siberian;
    }

    public void woof() {
        System.out.println("Гав-гаф -_-");
    }
}
