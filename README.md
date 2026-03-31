# 💰 Personal Expense Tracker

## 📌 Overview

The Personal Expense Tracker is a console-based Java application designed to help users efficiently manage and monitor their daily expenses. It provides a simple yet effective way to record financial transactions, view spending history, and calculate total expenses.

This project focuses on solving a real-world problem — lack of personal expense tracking — while demonstrating core programming concepts and emphasizing clean, user-friendly output.

---

## 🎯 Problem Statement

Many individuals struggle to keep track of their daily expenses, leading to poor financial awareness and management. This project provides a lightweight solution to record and analyze spending in an organized manner.

---

## 🚀 Features

* ➕ Add new expenses (amount, category, date, description)
* 📋 View all expenses in a structured table format
* ❌ Delete specific expense entries
* 💰 Calculate total expenses
* 💾 Persistent storage using file handling
* 🎨 Clean and formatted console UI for better readability

---

## 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections (ArrayList)
* File Handling (BufferedReader, BufferedWriter)

---

## 🧱 Project Structure

```
ExpenseTracker/
│── src/
│   ├── Main.java
│   ├── Expense.java
│   ├── ExpenseManager.java
│── data.txt
│── README.md
│── .gitignore
│── LICENSE
```

---

## ▶️ How to Run

1. Open terminal / command prompt

2. Navigate to the src folder:
   cd src

3. Compile the program:
   javac *.java

4. Run the application:
   java Main

---

## 🖥️ Sample Output

========= MENU =========

1. ➕ Add Expense
2. 📋 View Expenses
3. ❌ Delete Expense
4. 💰 Total Expense
5. 🚪 Exit

---

## No  | Amount     | Category   | Date         | Description

Example:
## 1   | $99.99    | Food       | 2026-01-29   | Birthday Party

💰 Total Expense: $99.99

---

## ⚙️ How It Works

* Expenses are stored as objects using OOP principles
* All records are maintained in an ArrayList during runtime
* Data is saved to `data.txt` to ensure persistence
* On restart, the application reloads saved data automatically

---

## 🧠 Key Concepts Demonstrated

* Object-Oriented Design (Encapsulation, Classes, Objects)
* File Handling for persistent storage
* Use of Collections (ArrayList)
* User input handling and control flow
* Formatted console output using printf

---

## ⚠️ Limitations

* Console-based interface (no GUI)
* No advanced analytics or charts
* Manual data entry required

---

## 🔮 Future Enhancements

* GUI version using Java Swing / JavaFX
* Category-wise expense analysis
* Budget tracking and alerts
* Graphical reports and charts

---

## 🎓 Learning Outcomes

Through this project, I gained practical experience in applying Java concepts to solve a real-world problem, improved my understanding of file handling and data structures, and learned how to enhance user experience through structured output design.

---

## 📄 License

This project is licensed under the MIT License.
