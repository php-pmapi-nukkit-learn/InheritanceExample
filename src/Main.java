import entities.*;
import entities.animals.Pet;
import entities.animals.WildAnimal;
import entities.animals.Wolf;

public class Main {
    public static void main(String[] args) {
        // Создаем обычное существо
        Entity entity = new Entity("Unknown");
        System.out.println("Первоначальное имя: " + entity.getName());
        entity.setName("Entity");
        System.out.println("Имя после изменений: " + entity.getName());
        entity.eat();

        // Создаем дикое животное
        WildAnimal wildAnimal = new WildAnimal("Sheeeep 0_0");
        if(wildAnimal.isAngry()) {
            System.out.println("Берегись " + wildAnimal.getName());
        } else {
            System.out.println("Лучше обойти " + wildAnimal.getName());
        }

        //Создаем волка
        Wolf wolf = new Wolf("Buffy", false, true);
        if(wolf.isSiberian()) {
            System.out.println(wolf.getName() + " является сибирским волком");
        }
        wolf.woof();

        //Создаем человека
        Human human = new Human("Steve", false, true);
        if(human.hasCar() && human.hasHome()) System.out.println(human.getName() + " успешный человек");
        if(human.hasHome() || human.hasCar()) System.out.println(human.getName() + " среднего достатка");
        if(!human.hasCar() && !human.hasHome()) System.out.println(human.getName() + "'у есть куда стремиться");
        human.eat();
        //human.woof() - будет ошибка

        //Создаем домашнее животное
        Pet pet = new Pet("Guffy Cat");
        pet.stroke();
    }
}