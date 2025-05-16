import java.util.Scanner;
public class lab3task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the pay rate per hour: ");
        double payRate = scanner.nextDouble();
        System.out.print("Enter the number of hours worked each week: ");
        int hoursWorkedPerWeek = scanner.nextInt();
        double totalIncomeBeforeTaxes = payRate * hoursWorkedPerWeek * 5;
        double taxesPaid = 0.14 * totalIncomeBeforeTaxes;
        double netIncome = totalIncomeBeforeTaxes - taxesPaid;
        double clothesAndAccessories = 0.10 * netIncome;
        double schoolSupplies = 0.01 * netIncome;
        double remainingMoney = netIncome - clothesAndAccessories - schoolSupplies;
        double savingsBonds = 0.25 * remainingMoney;
        double parentSavingsBonds = 0.50 * savingsBonds;
        // Output the results
        System.out.println("Income before taxes: $" + totalIncomeBeforeTaxes);
        System.out.println("Income after taxes: $" + netIncome);
        System.out.println("Money spent on clothes and accessories: $" + clothesAndAccessories);
        System.out.println("Money spent on school supplies: $" + schoolSupplies);
        System.out.println("Money spent on savings bonds: $" + savingsBonds);
        System.out.println("Money spent by parents on savings bonds: $" + parentSavingsBonds);
    }
}
