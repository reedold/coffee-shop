package projects.cafemarket;

import java.util.ArrayList;
import java.util.List;

public class Cart<T extends Product>{

private List<T> items;

public Cart() {
    items = new ArrayList<>();

}
public void addProducByID(byte ID, List<T> catalog){
    for (T product: catalog ) {
        if (ID == product.getId()) {
            items.add(product);
            System.out.println(product.getName() + " added to cart.");
            return;
        }
    }
    System.out.println("Product with ID " + ID + " not found.");
}
public void removeProductByID(byte ID, List<T> catalog){


        if (items.isEmpty()) {
            System.out.println("Your cart is empty");
        }
    for (T item : items) {
        if (item.getId() == ID) {
            items.remove(item);
            System.out.println(item.getName() + " removed from cart.");
            return;
        }
    }

    System.out.println("The product is not in the cart.");

}
public void viewAllItems(){
    if (items.isEmpty()) {
        System.out.println("Cart is empty.");
    }
    else {
        System.out.println("Items in Cart:");

        for (T product : items) {

            System.out.println(product);
        }
    }

}
public double calculateTotalPrice(double discount){
    double total = 0.0;
    for (T product : items) {
        total += product.getPrice();
    }
    return total * (1 - discount);

}
public void  placesOrder(Customer customer){
    if (items.isEmpty()) {
        System.out.println("Cart is empty. Cannot place order.");
        return;
    }
    else {
        System.out.println("\n--- Order Summary ---");
        viewAllItems();
        double total = calculateTotalPrice(customer.getDiscount());
        System.out.printf("Total (after %.0f%% discount): $%.2f\n", customer.getDiscount() * 100, total);
        items.clear();
        System.out.println("Order placed successfully. Cart is now empty.\n");
    }

}



}
