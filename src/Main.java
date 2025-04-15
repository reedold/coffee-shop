//import java.util.InputMismatchException;
//import java.util.Scanner;
//import java.util.SortedMap;
//
//public class Main {
//    public static void main(String[] args) {
//        Object[] accountBalances = {1200,2400,600,null};
//        System.out.println("Please choose your account wanna change");
//        Scanner scanner = new Scanner(System.in);
//        try {
//            int account = scanner.nextInt();
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("This account was not found");
//        }
//        System.out.println("Enter amount to deposit: ");
//
//        try{
//            double deposit = scanner.nextDouble();
//            System.out.println("Successfully deposited :$"+deposit);
//        }
//        catch (InputMismatchException e){
//            System.out.println("Oops! Please enter a valid amount.");
//            scanner.next();
//        }
//        try {
//            System.out.println("Attempting to withdraw from the account...");
//            System.out.println("Enter account number to withdraw from: ");
//            int accountNumber = scanner.nextInt();
//            if (accountBalances[accountNumber]== null){
//                throw new NullPointerException();
//            }
//            try {
//
//            }
//            catch (){
//
//            }
//        }
//    }
//}