package exercises.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        ArrayList<MenuItem> menuItems = new ArrayList<>(
                Arrays.asList(
                        new MenuItem(8.75,
                                "Salad",
                                "chicken Caesar salad",
                                "Entree"),
                        new MenuItem(
                                18.50,
                                "Chicken Alfredo",
                                "chicken in a white sauce with fettuccine noodles",
                                "Entree")));
        Menu menu = new Menu(menuItems);
        menu.addMenuItem(new MenuItem(
                7.25,
                "Tiramisu",
                "coffee-flavoured Italian dessert",
                "Dessert"));
        menu.printMenu();
    }

}

