import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        // Load existing inventory
        inventory.loadInventory("inventory.dat");

        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Quantity");
            System.out.println("4. View Inventory");
            System.out.println("5. Search Item");
            System.out.println("6. Save Inventory");
            System.out.println("7. Load Inventory");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter initial quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    inventory.addItem(itemName, quantity);
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String itemNameToRemove = scanner.nextLine();
                    inventory.removeItem(itemNameToRemove);
                    break;
                case 3:
                    System.out.print("Enter item name to update: ");
                    String itemNameToUpdate = scanner.nextLine();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    inventory.updateQuantity(itemNameToUpdate, newQuantity);
                    break;
                case 4:
                    inventory.viewInventory();
                    break;
                case 5:
                    System.out.print("Enter item name to search: ");
                    String itemNameSearch = scanner.nextLine();
                    inventory.searchItem(itemNameSearch);
                    break;
                case 6:
                    inventory.saveInventory("inventory.dat");
                    System.out.println("Inventory saved to inventory.dat");
# Added comment
                    break;
                case 7:
                    inventory.loadInventory("inventory.dat");
                    System.out.println("Inventory loaded from inventory.dat");
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}