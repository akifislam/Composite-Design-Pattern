import java.util.Vector;

public class GodCreatures {
    Vector<AnimalTypes> creatures = new Vector<>();

    void addAnimal(AnimalTypes creature){
        creatures.add(creature);
    }


    public void getSubordinates() {
        System.out.println();
        System.out.println("God created : ");
        for (AnimalTypes element : creatures){
            element.showInfo();
        }
        System.out.println();
    }
}
