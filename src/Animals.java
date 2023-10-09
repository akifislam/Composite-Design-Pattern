import java.util.Vector;

public class Animals implements AnimalTypes {
    Vector<AnimalTypes> animalsList = new Vector<>();

    void addAnimal(AnimalTypes animal){
        animalsList.add(animal);
    }
    @Override

    public void showInfo() {
        System.out.println("Animal Class");
    }

    public void getSubordinates(){
        System.out.println();
        System.out.println("Subordinates of Animal Class : ");

        for (AnimalTypes element : animalsList) {
            element.showInfo();
        }
        System.out.println();
    }
}

