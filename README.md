# BankingSystemInterface
Develop a Java program with an interface Account comprising two methods: deposit(double amount) and withdraw(double amount). Implement this interface in the SavingsAccount class, which manages a balance attribute.

The SavingsAccount class allows depositing funds, increasing the balance, and withdraws funds if sufficient balance is available. Otherwise, it prints an error message.

In the Main class, prompt the user to input two double values (d1 and d2) representing deposit and withdrawal amounts respectively. Create an instance of SavingsAccount with an initial balance of 0.0.

Examples:
Input: 5000
       7000
Output : Deposit successful. Balance: 5000.0
         Insufficient funds. Withdrawal unsuccessful.

Input: 7000
       5000
Output : Deposit successful. Balance: 7000.0
         Withdrawal successful. Balance: 2000.0
