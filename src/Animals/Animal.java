package Animals;
enum  animalType{
    cat,
    dog
}

public abstract class Animal {



    public final animalType anType;

    protected static int cnt =0;



    public Animal(animalType pAnType, String name, int runLim, int swimLim)
    {
        this.anType = pAnType;
        this.name = name;
        this.runLimitation = runLim;
        this.swimLimitation = swimLim;
        cnt++;
    }

    protected String name;

    protected int runLimitation;

    protected int swimLimitation;


    public abstract void swim(int obstrLength);

    public abstract void run(int obstrLength);

    public static void printCount(){
        System.out.printf("Всего животных - %d\n",cnt);
    }

}
