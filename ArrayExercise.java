/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.exercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ArrayExercise {
public static void num1(){
    //Number 1
    Scanner input = new Scanner(System.in);
    System.out.println("Number 1:");
    int x[];
    System.out.print("How many values would you like the array to have? ");
    x = new int[input.nextInt()];
    for(int i = 0;i <= x.length - 1;i++){
        System.out.print("Enter the value: ");
        x[i]=input.nextInt();
    }
    System.out.print(Arrays.toString(x));
    ArrayExercise.init();
}
public static void num2(){
    //Number 2
    Scanner input = new Scanner(System.in);
    boolean f = false;
    System.out.println("Number 2:");
    int x[];
    System.out.print("How many values would you like the array to have? ");
    x = new int[input.nextInt()];
    for(int i = 0;i <= x.length - 1;i++){
    System.out.print("Enter the value: ");
    x[i]=input.nextInt();
    }
    System.out.print("What value would you like check? ");
    int in = input.nextInt();
    for(int i = 0; i <= x.length - 1; i++){
        if(x[i]==in){
            System.out.print(in + " is inside the array in position number " + i + ".");
            }    
    }
    if(f==false){
        System.out.print("The value " + in + " is not in the array.");
    }
    ArrayExercise.init();
}
public static void num3(){
    //Number 3
    int p=0,n=0,o=0,e=0,z=0;
    Scanner input = new Scanner(System.in);
    System.out.println("Number 3:");
    int x[];
    System.out.print("How many values would you like the array to have? ");
    x = new int[input.nextInt()];
    for(int i = 0;i <= x.length - 1;i++){
        System.out.print("Enter the value: ");
        x[i]=input.nextInt();
    }
    for(int i = 0;i <= x.length - 1; i++){
        if(x[i]>0){
            p++;
        }
        else if(x[i]<0){
            n++;
        }
        else if(x[i]==0){
            z++;
        }
        if((x[i]%2)==0){
            e++;
        }
        else{
            o++;
        }
    }
    System.out.println("There are " + p + " positives.");
    System.out.println("There are " + n + " negatives.");
    System.out.println("There are " + o + " odds.");
    System.out.println("There are " + e + " evens.");
    System.out.println("There are " + z + " zeroes.");
    ArrayExercise.init();
}
public static void num4(){
    //Number 4
    int sum=0,prod=1;
    Scanner input = new Scanner(System.in);
    System.out.println("Number 4:");
    int x[];
    System.out.print("How many values would you like the array to have? ");
    x = new int[input.nextInt()];
    for(int i = 0;i <= x.length - 1;i++){
        System.out.print("Enter the value: ");
        x[i]=input.nextInt();
    }
    for(int i = 0; i <= x.length - 1; i++){
        sum = sum + x[i];
        prod = prod * x[i];
    }
    System.out.println("The sum of the array is " + sum + ".");
    System.out.println("The product of the array is " + prod + ".");
    ArrayExercise.init();
}
public static void num5(){
    //Number 5
    int l=-2147483648,s=2147483647;
    Scanner input = new Scanner(System.in);
    System.out.println("Number 5:");
    int x[];
    System.out.print("How many values would you like the array to have? ");
    x = new int[input.nextInt()];
    for(int i = 0;i <= x.length - 1;i++){
        System.out.print("Enter the value: ");
        x[i]=input.nextInt();
    }
    for(int i = 0;i <= x.length - 1;i++){
        if(x[i]>l){
            l = x[i];
        }
        if(x[i]<s){
            s = x[i];
        }
    }
    System.out.println("The largest value is " + l + ".");
    System.out.println("The smallest value is " + s + ".");
    ArrayExercise.init();
}
public static void num6(){
    //Number 6
    String s="",s2="";
    Scanner input = new Scanner(System.in);
    System.out.println("Number 6:");
    char x[];
    System.out.print("How many values would you like the array to have? ");
    x = new char[input.next().charAt(0)];
    for(int i = 0;i <= x.length - 1;i++){
        System.out.print("Enter the value: ");
        x[i]=input.next().charAt(0);
    }
    for(int i = 0;i <= x.length - 1;i++){
        s = s + x[i];
    }
    for(int i = x.length - 1;i >= 0;i--){
        s2 = s2 + x[i];
    }
    if(s.equalsIgnoreCase(s2)){
        System.out.println("This array is a palindrome.");
    }
    else{
        System.out.println("This array is not a palindrome.");
    }
    ArrayExercise.init();
}
public static void num7(){
    //Number 7
    int mid=0;
    Scanner input = new Scanner(System.in);
    System.out.println("Number 7:");
    int x[],y[],z[];
    System.out.print("How many values would you like the array to have? ");
    x = new int[input.nextInt()];
    for(int i = 0;i <= x.length - 1;i++){
        System.out.print("Enter the value: ");
        x[i]=input.nextInt();
    }
    mid = x.length / 2;
    y = new int[mid];
    z = new int[mid];
    for(int i = 0;i <= mid - 1; i++){
        y[i] = x[i];
    }
    for(int i = mid;i <= x.length - 1; i++){
        z[i - 5] = x[i];
    }
    System.out.println("The first half is " + Arrays.toString(y) + ".");
    System.out.println("The second half is " +Arrays.toString(z) + ".");
    ArrayExercise.init();
}
public static void num8(){
    //Number 8
    int h=-2147483648,h2=-2147483648,d=0,p=0;
    Scanner input = new Scanner(System.in);
    System.out.println("Number 8:");
    int x[],y[];
    System.out.print("How many values would you like the array to have? ");
    x = new int[input.nextInt()];
    for(int i = 0;i <= x.length - 1;i++){
        System.out.print("Enter the value: ");
        x[i]=input.nextInt();
    }
    for(int i = 0;i <= x.length - 1;i++){
        if(x[i]>h){
            h2 = h;
            h = x[i];
            p = i;
        }
        else if(x[i]>h2){
            h2 = x[i];
        }
    }
    d = h - h2;
    y = new int[x.length + 1];
    for(int i = 0,j = 0;i <= y.length - 1;i++){
        if(i==p){
            y[i] = h2;
            i++;
            y[i] = d;
            j++;
        }
        else{
            y[i] = x[j];
            j++;
        }
    }
    System.out.println("The original array is " + Arrays.toString(x));
    System.out.println("The changed array is " + Arrays.toString(y));
    ArrayExercise.init();
}
public static void num9(){
    //Number 9
    Scanner input = new Scanner(System.in);
    System.out.println("Number 9:");
    int x[],y[];
    System.out.print("How many values would you like the array to have? ");
    x = new int[input.nextInt()];
    y = new int[x.length];
    for(int i = 0;i <= x.length - 1;i++){
        System.out.print("Enter the value: "); 
        x[i]=input.nextInt();
    }
    for(int i = 0;i <= x.length - 1;i++){
        if(i == x.length - 1){
            y[0] = x[i];
        }
        else{
            y[i+1] = x[i];
        }
    }
    x = y;
    System.out.println(Arrays.toString(x));
    ArrayExercise.init();
}
public static void num10(){
    //Number 10
    Scanner input = new Scanner(System.in);
    System.out.println("Number 10:");
    int x[],y[],s;
    System.out.print("How many values would you like the array to have? ");
    x = new int[input.nextInt()];
    for(int i = 0;i <= x.length - 1;i++){
        System.out.print("Enter the value: ");
        x[i]=input.nextInt();
    }
    Arrays.sort(x); //I got lazy doing it the manual way, don' judge me xD
    System.out.println(Arrays.toString(x));
    ArrayExercise.init();
}
public static void init(){
    ArrayExercise AE = new ArrayExercise();
    Scanner input = new Scanner(System.in);
    System.out.print("Which number would you like to test? ");
    int in = input.nextInt();
    if(in==1){
        AE.num1();
    }
    else if(in==2){
        AE.num2();
    }
    else if(in==3){
        AE.num3();
    }
    else if(in==4){
        AE.num4();
    }
    else if(in==5){
        AE.num5();
    }
    else if(in==6){
        AE.num6();
    }
    else if(in==7){
        AE.num7();
    }
    else if(in==8){
        AE.num8();
    }
    else if(in==9){
        AE.num9();
    }
    else if(in==10){
        AE.num10();
    }
    else{
        System.out.println("Please only input the valid values. (1-10)");
        AE.init();
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayExercise.init();
}
}