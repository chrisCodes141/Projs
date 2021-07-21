/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author class
 */
import java.util.Scanner;
public class program_20 {
//LINEAR EQUATION
    public static void main(String[] args) {
        float a, b, x;
        Scanner k=new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        a=k.nextFloat();
        System.out.println("Please enter a number: ");
        b=k.nextFloat();
        
        if (a==0)
            if (b==0)
                System.out.println("All solutions");
            else
                System.out.println("No solutions");
        else{
            System.out.println("One solution");
            x=-b/a;
            System.out.println("X= "+x);
        }
       
    }
    
}
