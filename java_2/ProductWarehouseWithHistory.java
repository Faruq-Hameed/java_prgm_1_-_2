/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changeHistory;
//NullPointerException: Cannot invoke "ChangeHistory.add(double)" because "this.changeHistory" is null, in call ProductWarehouseWithHistory("grain", 10.0, 5.0). 
//The code that caused the error:
// new ProductWarehouseWithHistory("grain",10.0,5.0);

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        //Set the initial balance as the initial balance of the warehouse  as well as the first value of the change history.
        this.changeHistory = new ChangeHistory(); // Initialize first
        this.addToWarehouse(initialBalance);      // Safe to call now
//        this.changeHistory.add(initialBalance);   // Optional: if not already added inside addToWarehouse
    }

//      
    public String history() {
        return this.changeHistory.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);//add the amount to warehouse still use the super super class method
        //get the balance and use it as the hisory
        double balance = super.getBalance();
        this.changeHistory.add(balance);
    }

//
    public double takeFromWarehouse(double amount) {
        double result = super.takeFromWarehouse(amount);//remve the amount to warehouse still use the super super class method
        //get the balance and use it as the hisory
        double balance = super.getBalance();
        this.changeHistory.add(balance);
        return result;
    }

    public void printAnalysis() {
//        Product: Juice
        System.out.println("Product: " + this.getName());
//History: [1000.0, 988.7, 989.7]
        System.out.println("History: " + this.changeHistory);
//Largest amount of product: 1000.0
        System.out.println("Largest amount of product: " + this.changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.changeHistory.minValue());
        System.out.println("Average: " + this.changeHistory.average());
//Smallest amount of product: 988.7
//Average: 992.8
    }
}
