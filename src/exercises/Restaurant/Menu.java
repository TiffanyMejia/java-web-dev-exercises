package exercises.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Menu {

    private Date dateLastUpdated;
    private ArrayList<String> categories = new ArrayList<>(
            Arrays.asList("Appetizer", "Main Course", "Dessert")
    );
    private MenuItem special;
    private ArrayList<MenuItem> items;

    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
        this.dateLastUpdated = new Date();
    }

    public void addCategory(String category) {
        this.categories.add(category);
    }

    public void removeCategory(String category) {
        this.categories.remove(category);
    }

    public void addMenuItem(MenuItem item) {
        this.items.add(item);
    }

    public void removeMenuItem(MenuItem item) {
        this.items.remove(item);
    }

    public MenuItem getSpecial() {
        return special;
    }

    public void setSpecial(MenuItem special) {
        this.special = special;
    }

    public Date getDateLastUpdated() {
        return dateLastUpdated;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void printMenu() {
        System.out.println("****");
        for (MenuItem menuItem : items) {
            System.out.println(menuItem.toString());
            System.out.println("****");
        }
    }

}