/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Class
 */
import java.util.Scanner;
public class program_90 {
    public static void main(String[] args){
        int scores[][]= new int [3][4];
        Scanner keyboard=new Scanner(System.in);
        for (int row=0; row<3;row++)
            for(int col=0; col<4; col++)
            {
                System.out.print("Enter a score: ");
                Scanner k=new Scanner(System.in);
                scores[row][col]=k.nextInt();
                
                System.out.println(scores[row][col]);
            }
    }
}
