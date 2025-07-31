abstract class Food {
    abstract String getName();
}

class Pizza extends Food {
    String getName() {
        return "Food: Pizza";
    }
}

class Burger extends Food {
    String getName() {
        return "Food: Burger";
    }
}

public class FoodMenu {
    public static void main(String[] args) {
        Food pizza = new Pizza();
        Food burger = new Burger();
        System.out.println(pizza.getName());
        System.out.println(burger.getName());
    }
}
