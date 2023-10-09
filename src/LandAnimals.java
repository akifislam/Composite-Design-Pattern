import java.util.Vector;

public class LandAnimals implements AnimalTypes {


    Vector<AnimalTypes> landAnimalList = new Vector<>();

    void addAnimal(AnimalTypes animal){
        landAnimalList.add(animal);
    }
    @Override
    public void showInfo() {
        System.out.println("Land Animals");
    }


    public void getSubordinates() {
        System.out.println();
        System.out.println("Subordinates of Land Animals are : ");
        for (AnimalTypes element : landAnimalList){
            element.showInfo();
        }
        System.out.println();
    }
}
