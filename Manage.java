package Projects.ShoppingManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class represents the main management and interface for the Shopping Management System.
 * It allows customers to browse products, add/remove products to their cart, checkout, and manage inventory.
 */
public class Manage {
    public static void main(String[] args) {
        // List of available products in the inventory.
        List<Product> products = new ArrayList<>();
        products.add(new Product("P001", "Vivo", 50000, "High Resolution", "Electronics", 4));
        products.add(new Product("P002", "Asus", 20000, "Good Gaming Performance", "Electronics", 5));
        products.add(new Product("P003", "Lenovo Laptop", 70000, "Ideal for Professionals", "Electronics", 2));

        // Creating a customer instance to perform shopping actions.
        Customer customer = new Customer("C001", "Sudhanshu shukla", "sudhanshu206@gmail.com");

        int choice; // Holds the user's menu choice.
        Scanner sc = new Scanner(System.in);

        // Display the menu and perform actions until the user chooses to exit.
        do {
            // Print the shopping system menu.
            System.out.println("\n--- Shopping System Menu ---");
            System.out.println("1. Browse Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. Remove Product from Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Restock Product");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            // Perform actions based on the user's choice.
            switch (choice) {
                case 1:
                    // Browse products: Display all available products.
                    System.out.println("\n");
                    System.out.println("Available products are: \n");
                    for (Product p : products) {
                        p.DisplayProductDetails();
                        System.out.println("-------------------------------------------------------------------");
                    }
                    break;

                case 2:
                    // Add a product to the customer's cart by providing the product ID.
                    System.out.println("Enter ProductId to add: ");
                    String productid = sc.next();
                    boolean found = false;
                    for (Product p : products) {
                        if (p.getProductId().equals(productid)) {
                            customer.addProductToCart(p);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("product not found");
                    }
                    break;

                case 3:
                    // Remove a product from the customer's cart by providing the product ID.
                    System.out.println("Enter productID to remove: ");
                    String productid2 = sc.next();
                    boolean remove = false;
                    for (Product p : products) {
                        if (p.getProductId().equals(productid2)) {
                            customer.removefromcart(p);
                            remove = true;
                            break;
                        }
                    }
                    if (!remove) {
                        System.out.println("Product not found: ");
                    }
                    break;

                case 4:
                    // View and display all items currently in the customer's cart.
                    customer.getCart().Display_Cart();
                    break;

                case 5:
                    // Perform checkout: complete the order and display order details.
                    customer.checkout();
                    break;

                case 6:
                    // Restock a product in the inventory by providing product ID and quantity to add.
                    System.out.println("Enter productId of product wants to restock");
                    String productid3 = sc.next();
                    boolean found2 = false;
                    for (Product p : products) {
                        if (p.getProductId().equals(productid3)) {
                            System.out.println("quantity of product to restock: ");
                            int quantity = sc.nextInt();
                            p.Restock(quantity);
                            found2 = true;
                            break;
                        }
                    }
                    if (!found2) {
                        System.out.println("product not found");
                    }
                    break;

                case 7:
                    // Exit the menu.
                    System.out.println("Exiting the Shopping System. Thank you!");
                    break;
            }

        } while (choice != 7); // Loop until the user chooses to exit the system.

    }
}
