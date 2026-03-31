public class Expense {
    private double amount;
    private String category;
    private String date;
    private String description;

    public Expense(double amount, String category, String date, String description) {
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.description = description;
    }

    public double getAmount() { return amount; }
    public String getCategory() { return category; }
    public String getDate() { return date; }
    public String getDescription() { return description; }

    @Override
    public String toString() {
        return amount + "," + category + "," + date + "," + description;
    }

    public static Expense fromString(String line) {
        String[] parts = line.split(",");
        return new Expense(
                Double.parseDouble(parts[0]),
                parts[1],
                parts[2],
                parts[3]
        );
    }
}