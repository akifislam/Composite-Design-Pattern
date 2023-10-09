import java.util.Vector;

public class FlyingAnimals implements AnimalTypes {

    Vector<AnimalTypes> flyingAnimalList = new Vector<>();

    void addAnimal(AnimalTypes animal) {
        flyingAnimalList.add(animal);
    }

    @Override
    public void showInfo() {
        System.out.println("Flying Animals");
    }

    public void getSubordinates() {
        System.out.println();
        System.out.println("Subordinates of Flying Animals are : ");

        for (AnimalTypes element : flyingAnimalList) {
            element.showInfo();
        }
        System.out.println();
    }
}
