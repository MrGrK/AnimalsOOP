package Animals;

public class Dog extends Animal {


    public static int dogCnt = 0;

    public Dog(String name, int runLim, int swimLim){
        super(animalType.dog, name, runLim, swimLim);
        dogCnt ++;
    }

    @Override
    public void swim(int obstrLength) {
        if( obstrLength > this.swimLimitation){
            System.out.printf("Пёс %s утонул в заплыве на %d м.\n", this.name, obstrLength);
        }else {
            System.out.printf("Пёс %s проплыл %d м.\n", this.name, obstrLength);
        }
    }

    @Override
    public void run(int obstrLength)
    {
        if( obstrLength > this.runLimitation){
            System.out.printf("Пёс %s устал бежать %d м.\n", this.name, obstrLength);
        }else {
            System.out.printf("Пёс %s пробежал %d м.\n", this.name, obstrLength);
        }
    }

    public static void printCount() {
        System.out.printf("Количество собак - %d\n",dogCnt);
    }


}
