import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        manager.loadFromFile();

        System.out.println("====================================");
        System.out.println("   Welcome to Expense Tracker       ");
        System.out.println("====================================");

        while (true) {
            System.out.println("\n========= MENU =========");
            System.out.println("1. ➕ Add Expense");
            System.out.println("2. 📋 View Expenses");
            System.out.println("3. ❌ Delete Expense");
            System.out.println("4. 💰 Total Expense");
            System.out.println("5. 🚪 Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Add New Expense ---");

                    System.out.print("Amount ($): ");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Category: ");
                    String category = sc.nextLine();

                    System.out.print("Date (YYYY-MM-DD): ");
                    String date = sc.nextLine();

                    System.out.print("Description: ");
                    String desc = sc.nextLine();

                    manager.addExpense(new Expense(amount, category, date, desc));
                    break;

                case 2:
                    manager.viewExpenses();
                    break;

                case 3:
                    manager.viewExpenses();
                    System.out.print("\nEnter expense number to delete: ");
                    int index = sc.nextInt();
                    manager.deleteExpense(index - 1);
                    break;

                case 4:
                    double total = manager.getTotalExpense();
                    System.out.printf("\n💰 Total Expense: $%.2f\n", total);
                    break;

                case 5:
                    manager.saveToFile();
                    System.out.println("\n💾 Data saved successfully.");
                    System.out.println("👋 Exiting... Thank you!");
                    return;

                default:
                    System.out.println("\n❌ Invalid choice. Try again.");
            }
        }
    }
}