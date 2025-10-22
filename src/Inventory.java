# Minor edit
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Inventory {
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(String name, int quantity) {
        Item item = new Item(name, quantity);
        this.items.add(item);
        System.out.println("Item added: " + item.getName() + " (Quantity: " + item.getQuantity() + ")");
    }

    public void removeItem(String name) {
        items.removeIf(item -> item.getName().equalsIgnoreCase(name));
        System.out.println("Item removed: " + name);
    }

    public void updateQuantity(String name, int newQuantity) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                item.setQuantity(newQuantity);
                System.out.println("Quantity updated for " + item.getName() + " to " + newQuantity);
                return;
            }
        }
        System.out.println("Item not found: " + name);
    }

    public void viewInventory() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        System.out.println("Inventory:");
        for (Item item : items) {
            System.out.println(item.getName() + " - Quantity: " + item.getQuantity());
        }
    }

    public void searchItem(String name) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                System.out.println("Item found: " + item.getName() + " (Quantity: " + item.getQuantity() + ")");
                return;
            }
        }
        System.out.println("Item not found: " + name);
    }

    public void saveInventory(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(this.items);
        } catch (IOException e) {
            System.err.println("Error saving inventory: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void loadInventory(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            this.items = (List<Item>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading inventory: " + e.getMessage());
            // If file not found or corrupted, start with an empty inventory
            this.items = new ArrayList<>();
        }
    }
}