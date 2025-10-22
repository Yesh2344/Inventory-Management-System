# Inventory Management System

This project is a simple inventory management system built in Java. It allows users to manage a collection of items, track their quantity, and perform basic operations like adding, removing, and updating inventory levels.

## Features

*   **Add Items:** Easily add new items to the inventory with a name and initial quantity.
*   **Remove Items:** Remove items from the inventory.
*   **Update Quantity:** Adjust the quantity of existing items.
*   **View Inventory:** Display a list of all items and their current quantities.
*   **Search Items:** Find items by name.
*   **Simple Persistence:** Save and load inventory data from a file.

## Getting Started

### Prerequisites

*   Java Development Kit (JDK) 8 or later

### Installation

1.  Clone the repository:
    ```bash
    git clone [repository URL]
    ```
2.  Navigate to the project directory:
    ```bash
    cd inventory-management-system
    ```

### Building

1.  Compile the Java source files:
    ```bash
    javac src/*.java
    ```

### Running

1.  Run the compiled Java code:
    ```bash
    java src/Main
    ```

## Usage

Upon running the application, a menu will be displayed with the following options:

1.  **Add Item:** Prompts the user to enter the name and initial quantity of the item.
2.  **Remove Item:** Prompts the user to enter the name of the item to remove.
3.  **Update Quantity:** Prompts the user to enter the name of the item to update and the new quantity.
4.  **View Inventory:** Displays a list of all items in the inventory with their current quantities.
5.  **Search Item:** Prompts the user to enter the name of the item to search for.
6.  **Save Inventory:** Saves the current inventory to a file named `inventory.dat`.
7.  **Load Inventory:** Loads inventory data from the `inventory.dat` file.
8.  **Exit:** Exits the application.

## File Structure