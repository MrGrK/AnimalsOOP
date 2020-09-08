
import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
//import Animals.animalType;

import java.util.Random;


public class Main {

    private final static  Random random = new Random();

    public static void main(String[] args) {
        Animal[] xAnimals =new Animal[]{
         new Cat("Матрос", 200),
         new Dog("Бобик",500, 10),
         new Cat("Пирожок", 30),
         new Cat("Рублик", 320),
         new Cat("Матроскин", 134),
         new Dog("Бакс",500, 10),
         new Dog("Рекс",340, 10),
         new Cat("Барсик", 120),
         new Dog("Мухтар",540, 14)
        };

        testAnimals(xAnimals);

        Cat.printCount();

        Dog.printCount();

        Animal.printCount();
}



    private static void testAnimals(Animal[] pAnimal) {
        for (Animal animal: pAnimal) {
            animal.run(random.nextInt(600));
            animal.swim(random.nextInt(20));
        }
    }
}
