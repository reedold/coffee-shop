package Projects;

import java.util.Objects;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        String[] books = {"Harry Potter", "A Brief History of Time"};
registration(books);

    }
    static void registration(String[] books){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Dear client pls access your name: ");
        String name = scanner.nextLine();
        System.out.println("Borrow : 0    Return:1");
        char k = scanner.nextLine().charAt(0);
        if (k == '0') {
            System.out.println("Please write the book name wanting borrow: Harry Potter or A Brief History of Time");
        } else if (k == '1') {
            System.out.println("Please write the book name wanting return: Harry Potter or A Brief History of Time");
        }
        else {
            System.out.println("Invalid input");
        }
        String book = scanner.nextLine();
        for (String b : books){
            if (Objects.equals(b, book)) {
                System.out.println("Your choice has been recorded");
                return;
            }
        }
        System.out.println("Invalid book");
        scanner.close();
    }



}
