package Projects.cafemarket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Market {
    public static void main(String[] args) {
        List<Product> catalog = new ArrayList<>();
        catalog.add(new Product(1,"Espresso",2.50));
        catalog.add(new Product(2,"Cappucino", 3.00));
        catalog.add(new Product(3,"Latte", 3.50));


        List<Customer> customers = new ArrayList<>();
        customers .add(new Customer(101, "Alice Smith", "alice@example.com"));
        customers.add(new Customer(102, "Bob Johnson", "bob@example.com"));
        customers.add(new PremiumCustomer(103, "Charlie Prime", "charlie@premium.com"));

        Cart<Product> cart = new Cart<>();

        Scanner scanner = new Scanner(System.in);

        Customer selectedCustomer =null;
        while (selectedCustomer==null){
            System.out.println("Choose a customer by ID:");
            for (Customer customer : customers) {
                String type = (customer instanceof PremiumCustomer) ? "(Premium)" : "";
                System.out.println(customer.getId() + ": " + customer.getName() + " " + type);
            }
            byte customerId = scanner.nextByte();

            for (Customer customer : customers) {
                if (customerId == customer.getId()) {
                    selectedCustomer = customer;
                    break;
                }
            }
            if (selectedCustomer == null) {
                System.out.println("Customer not found.");
            }
        }


        boolean running = true;
        while (running){
            try {

                System.out.println("Welcome to CaffeeMarket!\n" +
                        "1. View Products\n" +
                        "2. Add Product to Cart\n" +
                        "3. Remove Product from Cart\n" +
                        "4. View Cart\n" +
                        "5. Place Order\n" +
                        "6. Exit");

                System.out.println("Choose an option: ");
                int option = scanner.nextByte();
                switch (option) {
                    case 1:
                        for (Product product : catalog) {
                            System.out.println(product);
                        }
                        break;
                    case 2:
                        System.out.print("Enter product ID to add: ");
                        byte ID = scanner.nextByte();
                        cart.addProducByID(ID, catalog);
                        break;
                    case 3:
                        System.out.print("Enter product ID to remove: ");
                        ID = scanner.nextByte();
                        cart.removeProductByID(ID, catalog);
                        break;
                    case 4:
                        cart.viewAllItems();
                        break;
                    case 5:
                        cart.placesOrder(selectedCustomer);
                        break;
                    case 6:
                        running = false;
                        System.out.println("Thank you for visiting CaffeeMarket!");
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");

                }
            }
                catch(Exception e){
                    System.out.println("Error: Invalid input. Please try again.");
                }

            }
        scanner.close();
        }

    }

