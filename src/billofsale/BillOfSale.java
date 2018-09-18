/*
 * Peter Horne-Deus
 * BillOfSale.java
 * This program calculates a bill of sale for a shirt
 * September 18, 2018
 */

package billofsale;

/**
 *
 * @author pehor9164
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double price = 12.49;
        int given = 20;
        double tax = 0.13;
        double cost = (price)+tax*(price);
        double change = given-cost;
        
        System.out.println("Price: $" + price + "\n" + "\n"+ "Taxes: " + tax + "%" + "\n" + "\n"+ "Total: $" + cost +"\n" + "\n" + "Amount Given: $" + given + "\n" + "\n" + "Change Due: $" + change );
    }
    
}
