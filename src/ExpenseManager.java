import java.io.*;
import java.util.*;

public class ExpenseManager {
    private List<Expense> expenses = new ArrayList<>();
    private final String FILE_NAME = "data.txt";

    public void addExpense(Expense e) {
        expenses.add(e);
        System.out.println("\n✅ Expense added successfully!");
    }

    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("\n⚠️ No expenses recorded yet.\n");
            return;
        }

        System.out.println("\n--------------------------------------------------------------");
        System.out.printf("%-3s | %-10s | %-10s | %-12s | %s\n",
                "No", "Amount", "Category", "Date", "Description");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < expenses.size(); i++) {
            Expense e = expenses.get(i);
            System.out.printf("%-3d | $%-8.2f | %-10s | %-12s | %s\n",
                    (i + 1),
                    e.getAmount(),
                    e.getCategory(),
                    e.getDate(),
                    e.getDescription());
        }

        System.out.println("--------------------------------------------------------------");
    }

    public void deleteExpense(int index) {
        if (index >= 0 && index < expenses.size()) {
            expenses.remove(index);
            System.out.println("\n🗑️ Expense deleted successfully!");
        } else {
            System.out.println("\n❌ Invalid index.");
        }
    }

    public double getTotalExpense() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        return total;
    }

    public void saveToFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));
        for (Expense e : expenses) {
            writer.write(e.toString());
            writer.newLine();
        }
        writer.close();
    }

    public void loadFromFile() throws IOException {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            expenses.add(Expense.fromString(line));
        }
        reader.close();
    }
}