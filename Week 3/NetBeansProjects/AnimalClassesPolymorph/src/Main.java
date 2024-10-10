import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
//        Animal myDog = new Dog("Rex", 55);
//        Animal myCat = new Cat("Patch", 45);
//        Animal myBird = new Bird("Damo", 25);
//
//        myDog.displayInfo();
//        myDog.eat();
//        myCat.displayInfo();
//        myBird.displayInfo();

        // Example of creating a FreshFood object
        FreshFood apple = new FreshFood(1, "Apple", LocalDateTime.now().plusDays(10), true,
                "Refrigerate");
        System.out.println("FreshFood: " + apple.getItemName() + ", BBE: " + apple.getBBE());
        // Example of creating a FrozenFood object
        FrozenFood pizza = new FrozenFood(2, "Pizza", LocalDateTime.now().plusMonths(6),
                false, true, -18);
        System.out.println("FrozenFood: " + pizza.getItemName() + ", Use Before: " +
                pizza.getUseBefore());
        CannedFood kidneyBeans = new CannedFood(3,"Kidney beans", LocalDateTime.now().plusMonths(9), false, "Cool dry place");
        System.out.println("CannedFood: " + kidneyBeans.getItemName() + ", Use Before: " + kidneyBeans.getBBE());
        DryFood spaghetti = new DryFood(4, "Spaghetti", LocalDateTime.now().plusMonths(8), true, "Cool dry place");
        System.out.println("DryFood: " + spaghetti.getItemName() + ", Use Before: " + spaghetti.getBBE());

    }
}