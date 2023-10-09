public class CompositePatternDemo {
    public static void main(String[] args) {

        // Creating Leaf Node for Land Animal
        Tiger exampleLandAnimal_1 = new Tiger();
        Cat exampleLandAnimal_2 = new Cat();

        // Send/Add it to Composite Class -> Land Animal
        LandAnimals landAnimals = new LandAnimals();

        landAnimals.addAnimal(exampleLandAnimal_1);
        landAnimals.addAnimal(exampleLandAnimal_2);
        landAnimals.getSubordinates();

        // Creating Leaf Node for Water Animal
        SilverCarpFish exampleFish = new SilverCarpFish();
        WaterAnimals waterAnimals = new WaterAnimals();
        waterAnimals.addAnimal(exampleFish);
        waterAnimals.getSubordinates();


        // Creating Leaf Node for Flying Animal
        Parrot exampleFlyingAnimal_1 = new Parrot();
        Pigeon exampleFlyingAnimal_2 = new Pigeon();

        FlyingAnimals flyingAnimals = new FlyingAnimals();
        flyingAnimals.addAnimal(exampleFlyingAnimal_1);
        flyingAnimals.addAnimal(exampleFlyingAnimal_2);
        flyingAnimals.getSubordinates();

        // Send it to Animal Class
        Animals animals = new Animals();

        animals.addAnimal(landAnimals);
        animals.addAnimal(waterAnimals);
        animals.addAnimal(flyingAnimals);
        animals.getSubordinates();

        // Send it to Client Class - God Creature
        GodCreatures godCreatures = new GodCreatures();
        godCreatures.addAnimal(animals);
        godCreatures.getSubordinates();


    }
}