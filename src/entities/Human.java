package entities;

public class Human extends Entity {
    private boolean car;
    private boolean home;
    public Human(String name, boolean car, boolean home) {
        super(name);
        this.car = car;
        this.home = home;
    }

    public boolean hasCar() {
        return car;
    }

    public boolean hasHome() {
        return home;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " успешно покушал :3");
    }
}
