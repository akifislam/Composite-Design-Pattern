import java.util.Vector;

public class WaterAnimals implements AnimalTypes {


    Vector<AnimalTypes> waterAnimaList = new Vector<>();

    void addAnimal(AnimalTypes animal) {
        waterAnimaList.add(animal);
    }

    @Override
    public void showInfo() {
        System.out.println("Water Animals");
    }


    public void getSubordinates() {
        System.out.println();
        System.out.println("Subordinates of Water Animals are : ");

        for (AnimalTypes element : waterAnimaList) {
            element.showInfo();
        }
        System.out.println();
    }
}

