package Animals;

public class Cat  extends  Animal{

    public static int catCnt =0;

    public Cat(String name, int runLim){
        super(animalType.cat, name, runLim, 0);
        catCnt++;
    }

    @Override
    public void run(int obstrLength) {
        if( obstrLength > this.runLimitation){
            System.out.printf("Кот %s устал бежать %d м.\n", this.name, obstrLength);
        }else {
            System.out.printf("Кот %s пробежал %d м.\n", this.name, obstrLength);
        }
    }

    public static void printCount() {
        System.out.printf("Количество котов - %d\n",catCnt);
    }

    @Override
    public void swim(int obstrLength) {
        System.out.println("Кошки не умеют плавать.");
    }
}
