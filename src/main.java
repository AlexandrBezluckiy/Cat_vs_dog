public class main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.cat_stats(1,4,4,4);

        Dog dog = new Dog();
        dog.dog_stats(7,3,2, 3);
        if (cat.cat() > dog.dog()) {
            System.out.println("Cat power: " + cat.cat() + "\nDog power: " + dog.dog() + "\nCat WINS!!!");
        }
        else {
            System.out.println("Cat power: " + cat.cat() + "\nDog power: " + dog.dog() + "\nDog WINS!!!");
        }
    }
}
