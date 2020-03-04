/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitmask;

/**
 *
 * @author ASUS
 */
public class Bitmask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mask = '\u000F';
        int mask2 = '\u003F';
	int val = '1';
	int val2 = '2';
	int r = val & mask;
	int r2 = val2 & mask;
        int r3 = val & mask2;
        int r4 = val2 & mask2;
	System.out.println("Ascii to Decimal: " + r + " + " + r2 + " = " + (r + r2));
        System.out.println("Decimal to Ascii: " + r3 + " + " + r4 + " = " + (r3 + r4));
    }
}
