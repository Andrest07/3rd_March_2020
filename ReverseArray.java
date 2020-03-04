/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.array;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class ReverseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x[] = {1,2,3,4,5};
        int y[]= {0,0,0,0,0};
        int n=0;
        for(int i=x.length-1;i>=0;i--){
            y[n]=x[i];
            n++;
    }
        x = y;
        System.out.print(Arrays.toString(x));
}
}
