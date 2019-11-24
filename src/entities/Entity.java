package entities;

public class Entity {
    private String name;
    public Entity(String name) {
        this.name = name;
    }

    public Entity() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " был покормлен(а)");
    }
}
