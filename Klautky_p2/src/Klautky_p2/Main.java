package Klautky_p2;

    class SavingsAccount {

        private static double annualInterestRate;
        private double savingsBalance;

        public SavingsAccount(double savingsBalance) {
            this.savingsBalance = savingsBalance;
        }

        public double getSavingBalance() {
            return this.savingsBalance;
        }

        public static void ModifyInterestRate(double theNewInterestRate) {
            annualInterestRate = theNewInterestRate;
        }

        public void CalculateMonthlyInterest() {
            savingsBalance = savingsBalance + (savingsBalance * (annualInterestRate / 12.0));
        }

    }

class Application { // figuring out how to compile and run this in this IDE was a LARGE pain
    public static void main(String[] args) {
        SavingsAccount saverNum1 = new SavingsAccount(2000);
        SavingsAccount saverNum2 = new SavingsAccount(3000);

        // Instance with 4% interest
        SavingsAccount.ModifyInterestRate(0.04);

        System.out.println("Saver 1's balance with interest rate of 4%:");
        for (int i = 0; i < 12; i++) {

            saverNum1.CalculateMonthlyInterest();

            System.out.println("Month " + (i + 1) + " : " + String.format("$%.2f", saverNum1.getSavingBalance()));
        }
        System.out.println();

        System.out.println("Saver 2's balance with interest rate of 4%:");
        for (int i = 0; i < 12; i++) {

            saverNum2.CalculateMonthlyInterest();

            System.out.println("Month " + (i + 1) + " : " + String.format("$%.2f", saverNum2.getSavingBalance()));
        }
        System.out.println();

        // Instance with 5% interest
         saverNum1 = new SavingsAccount(2000); // I didn't know if I was supposed to reset it or not
         saverNum2 = new SavingsAccount(3000); // so I added this just in case.

        SavingsAccount.ModifyInterestRate(0.05);

        System.out.println("Saver 1's balance with interest rate of 5%:");
        for (int i = 0; i < 12; i++) {

            saverNum1.CalculateMonthlyInterest();

            System.out.println("Month " + (i + 1) + " : " + String.format("$%.2f", saverNum1.getSavingBalance()));
        }
        System.out.println();

        System.out.println("Saver 2's balance with interest rate of 5%:");
        for (int i = 0; i < 12; i++) {

            saverNum2.CalculateMonthlyInterest();

            System.out.println("Month " + (i + 1) + " : " + String.format("$%.2f", saverNum2.getSavingBalance()));
        }
        System.out.println();
    }
}
// Made by Noah Klautky, COP3330-19, TueThu 6:00PM - 7:15PM

