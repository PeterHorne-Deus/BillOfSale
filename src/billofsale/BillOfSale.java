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
        double p = 12.49;
        int g = 20;
        double t = 0.13;
        double c = (p)+t*(p);
        double x = g-c;
        System.out.println("Price: $" + p + "\n" + "\n"+ "Taxes: " + t + "%" + "\n" + "\n"+ "Total: $" + c +"\n" + "\n" + "Amount Given: $" + g + "\n" + "\n" + "Change Due: $" + x );
    }
    
}
