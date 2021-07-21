/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Seph
 */
public class program_93 {
    public static void main(String[] args){
        int[][] numbers={{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12}};
        int total;
        
        for (int col=0; col<numbers[0].length; col++)
        {
            total=0;
            for (int row=0; row<numbers.length; row++)
            total=total+numbers[row][col];
            System.out.println("The total of column "+col+" is "+total);
        }
    } 
}
